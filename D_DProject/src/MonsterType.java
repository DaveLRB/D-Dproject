enum MonsterType {
    SLIME,
    BABYSPIDERS,
}

class MonsterFactory {
    public static Monster createMonster(MonsterType monsterType) {
        return switch (monsterType) {
            case SLIME ->
                    new Monster("Slime", 20, false, new String[]{"Slap", "Bounce"}, new String[]{"I'm gooey!", "Bloop bloop!"});
            case BABYSPIDERS ->
                    new Monster("Baby Spider", 25, false, new String[]{"Bite", "Web Spit"}, new String[]{"Tiny hisses", "Skittering sounds"});
            default -> null;
        };
    }
}