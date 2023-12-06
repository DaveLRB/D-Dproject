import java.util.Random;

public class Monster {
    private String name;
    private int hitDmg;
    private int monsterHP;
    private int experiencePoints;
    private boolean isFriendly;
    private boolean isParalised;
    private String[] attacks;
    private String[] neutralQuotes;
    private String[] angerQuotes;
    private String[] seducedQuotes;
    int level = 0;

    public Monster(String name, int hitDmg, int monsterHP, boolean isParalised, boolean isFriendly, String[] attacks, String[] neutralQuotes, String[] angerQuotes, String[] seducedQuotes) {
        this.name = name;
        this.hitDmg = hitDmg;
        this.monsterHP = monsterHP;
        this.experiencePoints = 0;
        this.isParalised = isParalised;
        this.isFriendly = isFriendly;
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

    public boolean isParalised() {
        return isParalised;
    }

    public void setParalised(boolean paralised) {
        isParalised = paralised;
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


    public void takeDamage(int attackDamage) {
        if (isMonsterAlive()) {
            monsterHP = Math.max(0, monsterHP - attackDamage);
            System.out.println(name + " took " + attackDamage + " damage!");
        } else {
            System.out.println("\nThis creature is already defeated!");
        }
    }

    public boolean isMonsterAlive() {
        return monsterHP > 0;
    }

    public int monsterAttack(Character character) {
        int attackIndex = new Random().nextInt(attacks.length);
        String attack = attacks[attackIndex];
        System.out.println(name + " used " + attack + "! " + character.getName() + " took " + hitDmg + " damage.");
        return hitDmg;
    }

    public void takeDamage(Player player) {
        if (isMonsterAlive()) {
            int playerAttack= player.getSELECTED_CHARACTER().characterAttack();
            monsterHP = Math.max(0, monsterHP - playerAttack);
            System.out.println("\n" + player.getSELECTED_CHARACTER().getName() + " gave " + playerAttack + " damage on "+this.name+ "!");
        } else {
            System.out.println("\nThis creature is already defeated!");
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
}