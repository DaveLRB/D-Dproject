import java.util.Random;

public class Monster {
    private String name;
    private int hitDmg;
    private int monsterHP;
    private int experiencePoints;
    private int level = 0;
    private int turnToBeInvisible = 0;
    private boolean isFriendly;
    private boolean isInvisible;
    private boolean isSeduced;
    private String[] attacks;
    private String[] neutralQuotes;
    private String[] angerQuotes;
    private String[] seducedQuotes;


    public Monster(String name, int hitDmg, int monsterHP, boolean isInvisible, boolean isFriendly, boolean isSeduced, String[] attacks, String[] neutralQuotes, String[] angerQuotes, String[] seducedQuotes) {
        this.name = name;
        this.hitDmg = hitDmg;
        this.monsterHP = monsterHP;
        this.experiencePoints = 0;
        this.isInvisible = isInvisible;
        this.isFriendly = isFriendly;
        this.isSeduced = isSeduced;
        this.attacks = attacks;
        this.neutralQuotes = neutralQuotes;
        this.angerQuotes = angerQuotes;
        this.seducedQuotes = seducedQuotes;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
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

    public boolean isInvisible() {
        return isInvisible;
    }

    public void setInvisible(boolean invisible) {
        isInvisible = invisible;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
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

<<<<<<< HEAD
    public int monsterAttack(Character character) {
        if (!isInvisible) {
            int attackIndex = new Random().nextInt(attacks.length);
            String attack = attacks[attackIndex];
            System.out.println(name + " used " + attack + "! " + character.getName() + " took " + hitDmg + " damage.");
            return hitDmg;
=======
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
>>>>>>> main
        }
        int attackIndex = new Random().nextInt(attacks.length);
        String attack = attacks[attackIndex];
        System.out.println(name + " used " + attack + "! " + character.getName() + " took " + hitDmg + " damage.");
        return hitDmg;
    }

    public void takeDamage(Player player) {
        if(!isInvisible) {
            int playerAttack = player.getSELECTED_CHARACTER().characterAttack();
            monsterHP -= playerAttack;
            System.out.println("\n" + player.getSELECTED_CHARACTER().getName() + " gave " + playerAttack + " damage on " + this.name + "!");
            turnToBeInvisible++;
        } else {
            isInvisible = false;
            monsterAngerSpeak();
            turnToBeInvisible++;
        }
    }

    public void takeSpecialDamage(Player player) {
        if (isMonsterAlive()) {
            int playerAttack= player.getSELECTED_CHARACTER().specialAttack();
            monsterHP-=playerAttack;
            System.out.println("\n" + player.getSELECTED_CHARACTER().getName() + " gave " + playerAttack + " damage on "+this.name+ "!");
            monsterAngerSpeak();
        }
    }

    public void takeUltimateDamage(Player player) {
        if (isMonsterAlive()) {
            int playerAttack= player.getSELECTED_CHARACTER().ultimateAttack();
            monsterHP -= playerAttack;
            System.out.println("\n" + player.getSELECTED_CHARACTER().getName() + " gave " + playerAttack + " damage on "+this.name+ "!");
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

   public void printSeducedQuotes(){
        if (isSeduced){
            monsterSeducedSpeak();
        }
   }

    public void revive(MonsterType monsterType) {
        if (this.getMonsterHP() <= 0 && monsterType == MonsterType.SKELETON) {
            this.setMonsterHP(100);
            System.out.println(this.getName() + " has been revived with full health!");
        }
    }
}