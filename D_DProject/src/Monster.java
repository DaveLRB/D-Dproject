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
    private boolean isAngered;
    private boolean isInvisible;
    private boolean isSeduced;
    private String[] attacks;
    private String[] neutralQuotes;
    private String[] angerQuotes;
    private String[] seducedQuotes;


    public Monster(String name, int hitDmg, int monsterHP, int experiencePoints, int gold, boolean isAlive, boolean isInvisible, boolean isAngered, boolean isSeduced, String[] attacks, String[] neutralQuotes, String[] angerQuotes, String[] seducedQuotes) {
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

    public String[] getNeutralQuotes() {
        return neutralQuotes;
    }

    public void setNeutralQuotes(String[] neutralQuotes) {
        this.neutralQuotes = neutralQuotes;
    }

    public String[] getAngerQuotes() {
        return angerQuotes;
    }

    public void setAngerQuotes(String[] angerQuotes) {
        this.angerQuotes = angerQuotes;
    }

    public String[] getSeducedQuotes() {
        return seducedQuotes;
    }

    public void setSeducedQuotes(String[] seducedQuotes) {
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
        if(!this.isSeduced){
            int attackIndex = new Random().nextInt(attacks.length);
            String attack = attacks[attackIndex];
            System.out.println(name + " used " + attack + "! " + character.getName() + " took " + hitDmg + " damage.");
        }else{
            this.isSeduced=false;
        }
        return hitDmg;
    }

    public void takeDamage(Player player) {
        timesAttacked++;
        if(timesAttacked==1){
            monsterSpeak();
        }
        if(!isInvisible) {
            int playerAttack = player.getSelectedCharacter().characterAttack();
            monsterHP -= playerAttack;
            player.getSelectedCharacter().characterTalk(this);
            if (!this.isSeduced){
                System.out.println("\n" + player.getSelectedCharacter().getName() + " gave " + playerAttack + " damage on " + this.name + "!");
                monsterAngerSpeak();
                turnToBeInvisible++;
            }else{
                monsterSpeak();
                System.out.println("\n" + player.getSelectedCharacter().getName() + " gave " + playerAttack + " damage on " + this.name + "!");
                monsterAngerSpeak();
                turnToBeInvisible++;
                player.getSelectedCharacter().setSeduce(0);
            }
        } else {
            isInvisible = false;
            monsterAngerSpeak();
            turnToBeInvisible++;
        }
    }

    public void takeSpecialDamage(Player player) {
        if (isMonsterAlive()) {
            int playerAttack= player.getSelectedCharacter().specialAttack();
            monsterHP-=playerAttack;
            System.out.println("\n" + player.getSelectedCharacter().getName() + " gave " + playerAttack + " damage on "+this.name+ "!");
            monsterAngerSpeak();
        }
    }

    public void takeUltimateDamage(Player player) {
        if (isMonsterAlive()) {
            int playerAttack = player.getSelectedCharacter().ultimateAttack();
            monsterHP -= playerAttack;
            System.out.println("\n" + player.getSelectedCharacter().getName() + " gave " + playerAttack + " damage on " + this.name + "!");
            monsterAngerSpeak();
        }
    }

    public void monsterSpeak() {
        int quoteIndex = new Random().nextInt(neutralQuotes.length);
        String monsterQuote = neutralQuotes[quoteIndex];
        System.out.println(name + ": " + monsterQuote);
    }

    public void monsterAngerSpeak() {
        int quoteIndex = new Random().nextInt(angerQuotes.length);
        String angerQuote = angerQuotes[quoteIndex];
        System.out.println(name + " (Angry): " + angerQuote);
    }


    public void monsterSeducedSpeak() {
        int quoteIndex = new Random().nextInt(seducedQuotes.length);
        String seducedQuote = seducedQuotes[quoteIndex];
        System.out.println(name + " (Seduced): " + seducedQuote);
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