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

    /*
    private static Monster[] createMonsters(MonsterType... monsterTypes) {
        List<Monster> monsters = new ArrayList<>();
        for (MonsterType monsterType : monsterTypes) {
            monsters.add(createMonster(monsterType));
        }
        return monsters.toArray(new Monster[0]);
    }

    */

    public static Monster[] createMonstersForLevel(int level) {
        switch (level) {
            case 1:
                return createMonsters(MonsterType.SLIME, MonsterType.BABYSPIDERS, MonsterType.GOBLIN, MonsterType.SKELETON, MonsterType.ZOMBIE);
            case 2:
                return createMonsters(MonsterType.SPECTRE, MonsterType.WEREWOLF, MonsterType.GHOST, MonsterType.WITCH, MonsterType.VAMPIRE);
            case 3:
                return createMonsters(MonsterType.MUMMY, MonsterType.CREEPER, MonsterType.HARPY, MonsterType.CENTAUR, MonsterType.MINOTAUR);
            case 4:
                return createMonsters(MonsterType.CYCLOPS, MonsterType.BASILISK, MonsterType.GRIFFIN, MonsterType.CHIMERA, MonsterType.MEDUSA);
            case 5:
                return createMonsters(MonsterType.WYVERN, MonsterType.PHOENIX, MonsterType.KRAKEN, MonsterType.BEHEMOTH, MonsterType.DRAGON);
            default:
                return null;
        }
    }
}
