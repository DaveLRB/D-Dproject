import java.util.Random;

public class Monster {
    private String name;
    private int hitPoints;
    private boolean isFriendly;
    private String[] attacks;
    private String[] quotes;
    int level = 0;

    public Monster(String name, int hitPoints, boolean isFriendly, String[] attacks, String[] quotes) {
        this.name = name;
        this.hitPoints = hitPoints;
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

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
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
