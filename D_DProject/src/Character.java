import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Character {

    private CharacterType characterType;
    private String name;
    private int strength;
    private int dexterity;
    private int charisma;
    private int intelligence;
    private int healthPoints;


    public Character(CharacterType characterType) {
        switch (characterType) {
            case KNIGHT:
                this.name = "KNIGHT";
                this.strength = 12;
                this.dexterity = 7;
                this.charisma = 8;
                this.intelligence = 5;
                break;
            case SORCERER:
                this.name = "SORCERER";
                this.strength = 5;
                this.dexterity = 6;
                this.charisma = 8;
                this.intelligence = 12;
                break;
            case BARD:
                this.name = "BARD";
                this.strength = 7;
                this.dexterity = 8;
                this.charisma = 12;
                this.intelligence = 8;
                break;
            case ASSASSIN:
                this.name = "ASSASSIN";
                this.strength = 8;
                this.dexterity = 12;
                this.charisma = 5;
                this.intelligence = 7;
                break;
        }
        this.healthPoints = 100;
    }

    private String [] charQuotes = {
            "Hey darling, i have never seen such beautiful being",
            "WOW am i blind? Or are you a ray of sunshine?!",
            "Can i sing you a song...of passion?",
            "Is that a weapon? Or are you happy to see me?!",
            "Beautiful eyes, in such a beautiful being..",
            "WOWZA CHAWABANGA!!"
    };

    private void shuffleQuotes() {
        List<String> quotesList = Arrays.asList(charQuotes);
        Collections.shuffle(quotesList);
        quotesList.toArray(charQuotes);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength += strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity += dexterity;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma += charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence += intelligence;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints += healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void characterTakeDamage(Monster monster) {
        this.healthPoints -= monster.monsterAttack(this);
    }

    public int characterAttack() {
        int attack = 0;
        switch (characterType) {
            case KNIGHT -> attack = this.strength;
            case SORCERER -> attack = this.intelligence;
            case BARD -> attack = this.charisma;
            case ASSASSIN -> attack = this.dexterity;
        }
        ;

        return attack;

    }

    public int specialAttack() {
        int special = 0;
        switch (characterType) {
            case KNIGHT -> special = this.strength * (int) (Math.random() * 3) + 1;
            case SORCERER -> special = this.intelligence * (int) (Math.random() * 3) + 1;
            case BARD -> special = this.charisma * (int) (Math.random() * 3) + 1;
            case ASSASSIN -> special = this.dexterity * (int) (Math.random() * 3) + 1;
        }
        ;
        return special;
    }

    public int ultimateAttack() {
        Random random = new Random();
        double chance = random.nextDouble();
        int ultimate = 0;
        if (chance <= 0.20 && healthPoints <= 20) {
            switch (characterType) {
                case KNIGHT -> ultimate = this.strength * 10;
                case SORCERER -> ultimate = this.intelligence * 10;
                case BARD -> ultimate = this.charisma * 10;
                case ASSASSIN -> ultimate = this.dexterity * 10;
            }
            ;
            return ultimate;
        }
        switch (characterType) {
            case KNIGHT -> ultimate = this.strength;
            case SORCERER -> ultimate = this.intelligence;
            case BARD -> ultimate = this.charisma;
            case ASSASSIN -> ultimate = this.dexterity;
        }
        ;
        return ultimate;
    }
}

