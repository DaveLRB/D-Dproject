public enum CharacterType {

    KNIGHT("knight", 12, 7, 8, 5),
    SORCERER("sorcerer", 5, 6, 8, 12),
    BARD("bard", 7, 8, 12, 8),
    ASSASSIN("assassin", 8, 12, 5, 7);

    private final String type;
    private int strenght;
    private int dexterity;
    private int charisma;
    private int intelligence;
    private int healthPoints;

    CharacterType(String type, int strenght, int dexterity, int charisma, int intelligence) {
        this.type = type;
        this.strenght = strenght;
        this.dexterity = dexterity;
        this.charisma = charisma;
        this.intelligence = intelligence;
        this.healthPoints = 100;

    }

    public void characterAttack() {
        int attack;
        switch (this.type) {
            case "knight" -> attack = this.strenght;
            case "sorcerer" -> attack = this.intelligence;
            case "bard" -> attack = this.charisma;
            case "assassin" -> attack = this.dexterity;
        }

    }

    public void specialAttack() {
        int special;
        switch (this.type) {
            case "knight" -> special = this.strenght * (int) (Math.random() * 3) + 1;
            case "sorcerer" -> special = this.intelligence * (int) (Math.random() * 3) + 1;
            case "bard" -> special = this.charisma * (int) (Math.random() * 3) + 1;
            case "assassin" -> special = this.dexterity * (int) (Math.random() * 3) + 1;
        }
    }

    public void takeDamage(int MonsterDamage) {
        this.healthPoints = healthPoints - MonsterDamage;
    }

    public void ultimateAttack() {
        int ultimate;
        switch (this.type) {
            case "knight" -> ultimate = this.strenght * 100;
            case "sorcerer" -> ultimate = this.intelligence * 100;
            case "bard" -> ultimate = this.charisma * 100;
            case "assassin" -> ultimate = this.dexterity * 100;


        }
    }
}
