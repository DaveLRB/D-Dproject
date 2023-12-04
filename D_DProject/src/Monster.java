public class Monster {
    private String name;
    private int hitDmg;
    private int monsterHP;
    private boolean isFriendly;
    private String[] attacks;
    private String[] quotes;
    int level = 0;

    public Monster(String name, int hitDmg, int monsterHP, boolean isFriendly, String[] attacks, String[] quotes) {
        this.name = name;
        this.hitDmg = hitDmg;
        this.monsterHP = monsterHP;
        this.isFriendly = isFriendly;
        this.attacks = attacks;
        this.quotes = quotes;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public String[] getQuotes() {
        return quotes;
    }

    public void setQuotes(String[] quotes) {
        this.quotes = quotes;
    }


   /* private Monster createRandomMonster() {
        MonsterType randomMonsterType = MonsterType.values()[new Random().nextInt(MonsterType.values().length)];

        switch (randomMonsterType) {
            case SLIME:
                return new SlimeMonster("Slime");
            case BABYSPIDERS:
                return new BabySpiders("Baby Spider");
            default:
                return null;
        }
    }

    public static Monster[] createMonstersForLevel(int level) {
        switch (level) {
            case 1:
                return createMonsters(MonsterType.SLIME, );
            case 2:
                return createMonsters(MonsterType.BABYSPIDERS);
            default:
                return null;
        }
    } */
}
