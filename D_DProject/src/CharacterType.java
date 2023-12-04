import java.util.Random;

public enum CharacterType {
<<<<<<< HEAD
    KNIGHT,
    SORCERER,
    BARD,
    ASSASSIN
=======

    KNIGHT(12,7,8,5),
    SORCERER(5,6,8,12),
    BARD(7,8,12,8),
    ASSASSIN(8,12,5,7);

    private int strenght;
    private int dexterity;
    private int charisma;
    private int intelligence;

    private CharacterType(int strenght, int dexterity, int charisma, int intelligence) {

        this.strenght = strenght;
        this.dexterity = dexterity;
        this.charisma = charisma;
        this.intelligence = intelligence;
    }


>>>>>>> f57d1c5 (added some things)
}
