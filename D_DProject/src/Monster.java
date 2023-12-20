import java.util.Random;

public class Monster {
    private String name;
    private int hitDmg;
    private int monsterHP;
    private int experiencePoints;
    private int level = 0;
    private int gold = 0;
    private int turnToBeInvisible = 0;
    private boolean isAlive;
    private boolean isAngered;
    private boolean isInvisible;
    private boolean isSeduced;
    private String[] attacks;
    private Quote[] neutralQuotes;
    private Quote[] angerQuotes;
    private Quote[] seducedQuotes;


    public Monster(String name, int hitDmg, int monsterHP, int experiencePoints, int gold, boolean isAlive, boolean isInvisible, boolean isAngered, boolean isSeduced, String[] attacks, Quote[] neutralQuotes, Quote[] angerQuotes, Quote[] seducedQuotes) {
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

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isInvisible() {
        return isInvisible;
    }

    public void setInvisible(boolean invisible) {
        isInvisible = invisible;
    }

    public boolean isAngered() {
        return isAngered;
    }

    public void setAngered(boolean angered) {
        isAngered = angered;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isSeduced() {
        return isSeduced;
    }

    public void setSeduced(boolean seduced) {
        isSeduced = seduced;
    }

    public boolean isMonsterAlive() {
        return monsterHP > 0;
    }

    public int getTurnToBeInvisible() {
        return turnToBeInvisible;
    }

    public void setTurnToBeInvisible(int turnToBeInvisible) {
        this.turnToBeInvisible = turnToBeInvisible;
    }

    public int monsterAttack(Character character) {
        if(getTurnToBeInvisible() % 2 == 0) {
            if (name.equals("Ghost") || name.equals("Spectre")) {
                isInvisible = true;
            }
        }
        int attackIndex = new Random().nextInt(attacks.length);
        String attack = attacks[attackIndex];
        System.out.println(name + " used " + attack + "! " + character.getName() + " took " + hitDmg + " damage.");
        return hitDmg;
    }

    public void takeDamage(Player player, String attackType) {
        int damage = 0;

        if (!isInvisible) {
            switch (attackType) {
                case "light":
                    damage = player.getSelectedCharacter().attack("light");
                    break;
                case "heavy":
                    damage = player.getSelectedCharacter().attack("heavy");
                    break;
                case "ultimate":
                    damage = player.getSelectedCharacter().attack("ultimate");
                    break;
                default:
                    System.out.println("Invalid attack type!");
                    return;
            }
            monsterHP -= damage;
            System.out.println("\n" + player.getSelectedCharacter().getName() + " used " + attackType + " attack and dealt " + damage + " damage to " + this.name + "!");
            turnToBeInvisible++;
        } else {
            isInvisible = false;
            turnToBeInvisible++;
        }
    }

    public void monsterSpeak() {
        int quoteIndex = new Random().nextInt(neutralQuotes.length);
        Quote monsterQuote = neutralQuotes[quoteIndex];
        System.out.println(name + ": " + monsterQuote.getText());
    }

    public void monsterAngerSpeak() {
        int quoteIndex = new Random().nextInt(angerQuotes.length);
        Quote angerQuote = angerQuotes[quoteIndex];
        System.out.println(name + " (Angry): " + angerQuote.getText());
    }

    public void monsterSeducedSpeak() {
        int quoteIndex = new Random().nextInt(seducedQuotes.length);
        Quote seducedQuote = seducedQuotes[quoteIndex];
        System.out.println(name + " (Seduced): " + seducedQuote.getText());
    }

    public void printAngeredQuotes(){
        if (isAngered){
            monsterAngerSpeak();
        }
    }
   public void printSeducedQuotes(){
        if (isSeduced){
            monsterSeducedSpeak();
        }
   }

    public void monsterDoesOneshot(MonsterType monsterType) {
        if (this.getMonsterHP() <= 0 && monsterType == MonsterType.CREEPER || monsterType == MonsterType.MEDUSA || monsterType == MonsterType.BASILISK) {
            isAlive = false;
            System.out.println(this.getName() + " killed you in a single blow...");
        }
    }

    public void revive(MonsterType monsterType) {
        if (!this.isAlive && monsterType == MonsterType.SKELETON) {
            this.setMonsterHP(100);
            System.out.println(this.getName() + " has been revived with full health!");
        }
    }
}