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
    private int seduce = 0;
    private boolean isParalised;

    public Character(CharacterType characterType) {
        this.characterType = characterType;
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


    private final String[] charQuotesBard = {
            "Am i blind? Or are you a ray of sunshine?!",
            "Can i sing you a song...of passion?",
            "Is that a weapon? Or are you happy to see me?!",
            "WOWZA CHA-WA-BANGA!!"
    };

    private final String[] charQuotesKnight = {
            "The valor of a knight will smite you!",
            "With my weapon i shall cleanse the world of evil",
            "Courage is the strength to face uncertainty.",
            "Chivalry is not just a code, but a way of being."
    };

    private final String[] charQuotesAssassin = {
            "My poison daggers will send you to the shadows..",
            "In the dark i live..in the dark you shall die",
            "Silence is the deadliest weapon in the arsenal of an assassin.",
            "Darkness is the ally of shadows, and shadows breed the unseen strike."
    };
    private final String[] charQuotesSorcerer = {
            "With my magic i shall turn you to ash!",
            "Behold my migth..the Sorcerer Supreme!",
            "Magic flows where intent meets will.",
            "Knowledge is the staff of power wielded by the adept sorcerer."
    };


    private void shuffleQuotes(String[] quotes) {
        List<String> quotesList = Arrays.asList(quotes);
        Collections.shuffle(quotesList);
        quotesList.toArray(quotes);
    }

    private String getRandomQuote(String[] quotes) {
        Random random = new Random();
        shuffleQuotes(quotes);
        int index = random.nextInt(quotes.length);
        return quotes[index];
    }

    private String getRandomQuoteBard() {
        return getRandomQuote(charQuotesBard);
    }

    private String getRandomQuoteKnight() {
        return getRandomQuote(charQuotesKnight);
    }

    private String getRandomQuoteSorcerer() {
        return getRandomQuote(charQuotesSorcerer);
    }

    private String getRandomQuoteAssassin() {
        return getRandomQuote(charQuotesAssassin);
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

    public void setHP(int healthPoints) {
        this.healthPoints -= healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeduce() {
        return seduce;
    }

    public void setSeduce(int seduce) {
        this.seduce = seduce;
    }

    public boolean isParalised() {
        return isParalised;
    }

    public void setParalised(boolean paralised) {
        isParalised = paralised;
    }

    public void characterTalk(CharacterType characterType, Monster monster) {
        String randomQuote = "";

        switch (characterType) {
            case BARD -> {
                randomQuote = getRandomQuoteBard();
                seduce++;
                if (seduce == 2) {
                    if (!monster.isSeduced()) {
                        monster.setSeduced(true);
                    }
                }
            }
            case KNIGHT -> randomQuote = getRandomQuoteKnight();
            case ASSASSIN -> randomQuote = getRandomQuoteAssassin();
            case SORCERER -> randomQuote = getRandomQuoteSorcerer();
        }
        System.out.println(randomQuote);
    }

    public void characterTakeDamage(Monster monster) {
        this.healthPoints -= monster.monsterAttack(this);
    }

    public int characterAttack() {
        if (!isParalised()) {
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

        return 0;

    }

    public int specialAttack() {
        if (!isParalised()) {
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

        return 0;

    }

    public int ultimateAttack() {
        Random random = new Random();
        double chance = random.nextDouble();
        int ultimate = 0;
        if (isParalised) {
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

            return ultimate;
        }

        return 0;

    }
}

