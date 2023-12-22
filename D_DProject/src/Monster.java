import java.util.Random;

public class Monster {
    private int timesAttacked;
    private String name;
    private int hitDmg;
    private int monsterHP;
    private int experiencePoints;
    private int level = 0;
    private int gold = 0;
    private int turnToBeInvisible = 0;
    private boolean isAlive;
    private boolean hasBeenRevived = false;
    private boolean isAngered;
    private boolean isInvisible;
    private boolean isSeduced;
    private String[] attacks;
    private Quote[] neutralQuotes;
    private Quote[] angerQuotes;
    private Quote[] seducedQuotes;
    private static final int ONE_SHOT_CHANCE = 10;
    private static final int REVIVE_HEALTH = 100;
    private MonsterType monsterType;
    public Monster(String name, int hitDmg, int monsterHP, int experiencePoints, int gold, boolean isAlive, boolean isInvisible, boolean isAngered, boolean isSeduced, String[] attacks, Quote[] neutralQuotes, Quote[] angerQuotes, Quote[] seducedQuotes, MonsterType monsterType) {
        this.name = name;
        this.hitDmg = hitDmg;
        this.monsterHP = monsterHP;
        this.experiencePoints = experiencePoints;
        this.gold = gold;
        this.isAlive = isAlive;
        this.isInvisible = isInvisible;
        this.isAngered = isAngered;
        this.isSeduced = isSeduced;
        this.attacks = attacks;
        this.neutralQuotes = neutralQuotes;
        this.angerQuotes = angerQuotes;
        this.seducedQuotes = seducedQuotes;
        this.monsterType = monsterType;
    }

    public int getTimesAttacked() {
        return timesAttacked;
    }

    public void setTimesAttacked(int timesAttacked) {
        this.timesAttacked = timesAttacked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitDmg() {
        return hitDmg;
    }

    public void setHitDmg(int hitDmg) {
        this.hitDmg = hitDmg;
    }

    public int getMonsterHP() {
        return monsterHP;
    }

    public void setMonsterHP(int monsterHP) {
        this.monsterHP = monsterHP;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getTurnToBeInvisible() {
        return turnToBeInvisible;
    }

    public void setTurnToBeInvisible(int turnToBeInvisible) {
        this.turnToBeInvisible = turnToBeInvisible;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isHasBeenRevived() {
        return hasBeenRevived;
    }

    public void setHasBeenRevived(boolean hasBeenRevived) {
        this.hasBeenRevived = hasBeenRevived;
    }

    public boolean isAngered() {
        return isAngered;
    }

    public void setAngered(boolean angered) {
        isAngered = angered;
    }

    public boolean isInvisible() {
        return isInvisible;
    }

    public void setInvisible(boolean invisible) {
        isInvisible = invisible;
    }

    public boolean isSeduced() {
        return isSeduced;
    }

    public void setSeduced(boolean seduced) {
        isSeduced = seduced;
    }

    public String[] getAttacks() {
        return attacks;
    }

    public void setAttacks(String[] attacks) {
        this.attacks = attacks;
    }

    public Quote[] getNeutralQuotes() {
        return neutralQuotes;
    }

    public void setNeutralQuotes(Quote[] neutralQuotes) {
        this.neutralQuotes = neutralQuotes;
    }

    public Quote[] getAngerQuotes() {
        return angerQuotes;
    }

    public void setAngerQuotes(Quote[] angerQuotes) {
        this.angerQuotes = angerQuotes;
    }

    public Quote[] getSeducedQuotes() {
        return seducedQuotes;
    }

    public void setSeducedQuotes(Quote[] seducedQuotes) {
        this.seducedQuotes = seducedQuotes;
    }

    public MonsterType getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(MonsterType monsterType) {
        this.monsterType = monsterType;
    }
    public int monsterAttack(Character character) {
        if (getTurnToBeInvisible() % 2 == 0
                && (name.equals("Ghost")
                || name.equals("Spectre"))) {
            isInvisible = true;
        }

        int attackIndex = new Random().nextInt(attacks.length);
        String attack = attacks[attackIndex];
        System.out.println(name + " used " + attack + "! " + character.getName() + " took " + hitDmg + " damage.");
        return hitDmg;
    }

    public void takeDamage(Player player, String attackType) {
        if (isInvisible) {
            isInvisible = false;
        } else {
            int damage = 0;
            switch (attackType) {
                case "light":
                case "heavy":
                case "ultimate":
                    damage = player.getSelectedCharacter().attack(this, attackType);
                    break;
                default:
                    System.out.println("Invalid attack type!");
                    return;
            }
            monsterHP -= damage;
            System.out.println("\n" + player.getSelectedCharacter().getName() + " used " + attackType + " attack and dealt " + damage + " damage to " + this.name + "!");
            turnToBeInvisible++;
        }
        turnToBeInvisible++;
    }

    private void speak(Quote[] quotes, String emotion) {
        int quoteIndex = new Random().nextInt(quotes.length);
        Quote monsterQuote = quotes[quoteIndex];
        Music music = new Music(monsterQuote.getFilename());
        music.play();
        System.out.println(name + emotion + monsterQuote.getText());
    }

    public void monsterSpeak() {
        speak(neutralQuotes, " (Neutral): ");
    }

    public void monsterAngerSpeak() {
        speak(angerQuotes, " (Angry): ");
    }

    public void monsterSeducedSpeak() {
        speak(seducedQuotes, " (Seduced): ");
    }

    public void monsterDoesOneshot(MonsterType monsterType) {
        Random random = new Random();
        int chance = random.nextInt(100);
        if (this.getMonsterHP() <= 0
                && (monsterType == MonsterType.CREEPER
                || monsterType == MonsterType.MEDUSA
                || monsterType == MonsterType.BASILISK)
                && chance < ONE_SHOT_CHANCE) {
            isAlive = false;
            System.out.println(this.getName() + " killed you in a single blow...");
        }
    }

    public void revive(MonsterType monsterType) {
        if (!this.isAlive && monsterType == MonsterType.SKELETON && !hasBeenRevived) {
            this.setMonsterHP(REVIVE_HEALTH);
            this.isAlive = true;
            hasBeenRevived = true;
            System.out.println(this.getName() + " has been revived with full health!");
        }
    }

    public void printMonsterArt() {
        GameMessage.printMonsterArt(this.monsterType);
    }
}