import exceptions.HealthPointsGreaterThan20Exception;

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
    private boolean isParalysed;
    private Inventory inventory;

    public Character(CharacterType characterType) {
        this.characterType = characterType;
        this.name = characterType.getName();
        this.strength = characterType.getStrength();
        this.dexterity = characterType.getDexterity();
        this.charisma = characterType.getCharisma();
        this.intelligence = characterType.getIntelligence();
        this.inventory = new Inventory();
        this.healthPoints = 100;
    }

    private final String[] charQuotesBard = {
            "Am i blind? Or are you a ray of sunshine?!",
            "Can i sing you a song...of passion?",
            "Is that a weapon? Or are you happy to see me?!",
            "WOWZA CHA-WA-BANGA!!",
            "In tales of old, valor blooms.",
            "With every dawn, a new legend unfolds.",
            "Melodies weave the fabric of our stories.",
            "Words, the bard's sword; songs, the bard's shield."

    };

    private final String[] charQuotesKnight = {
            "The valor of a knight will smite you!",
            "With my weapon i shall cleanse the world of evil",
            "Courage is the strength to face uncertainty.",
            "Chivalry is not just a code, but a way of being.",
            "Strength shields the weak, to the evils might.",
            "Valor knows no fear, in the face of darkness.",
            "Honor guides every deed, an honest heart makes.",
            "Adversity forges nobility, were cowardice sows fragility."
    };

    private final String[] charQuotesAssassin = {
            "My poison daggers will send you to the shadows..",
            "In the dark i live..in the dark you shall die",
            "Silence is the deadliest weapon in the arsenal of an assassin.",
            "Darkness is the ally of shadows, and shadows breed the unseen strike.",
            "Silence speaks louder than steel.",
            "Shadows are my allies, darkness my cloak.",
            "Precision is my art, stealth my dance.",
            "In the quiet, I am deadliest."
    };

    private final String[] charQuotesSorcerer = {
            "With my magic i shall turn you to ash!",
            "Behold my might..the Sorcerer Supreme!",
            "Magic flows where intent meets will.",
            "Knowledge is the staff of power wielded by the adept sorcerer.",
            "Magic bends to my will, the elements dance at my command.",
            "Arcane secrets whisper in every spell.",
            "Power courses through my veins, shaped by incantations.",
            "The unseen forces are my allies, shaping reality to my design."

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
        this.healthPoints = healthPoints;
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

    public boolean isParalysed() {
        return isParalysed;
    }

    public void setParalysed(boolean paralysed) {
        isParalysed = paralysed;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public void characterTalk(Monster monster) {
        String randomQuote = "";
        switch (this.getCharacterType()) {
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
        int attack = 0;
        if (!isParalysed()) {
            switch (characterType) {
                case KNIGHT -> attack = this.strength;
                case SORCERER -> attack = this.intelligence;
                case BARD -> attack = this.charisma;
                case ASSASSIN -> attack = this.dexterity;
            }
            return attack;
        } else {
            System.out.println("Cannot attack, you are paralysed!");
        }
        return 0;
    }

    public int specialAttack() {
        if (!isParalysed()) {
            int special = 0;
            switch (characterType) {
                case KNIGHT -> special = this.strength * (int) (Math.random() * 3) + 1;
                case SORCERER -> special = this.intelligence * (int) (Math.random() * 3) + 1;
                case BARD -> special = this.charisma * (int) (Math.random() * 3) + 1;
                case ASSASSIN -> special = this.dexterity * (int) (Math.random() * 3) + 1;
            }
            return special;
        } else {
            System.out.println("Cannot attack, you are paralysed!");
        }
        return 0;
    }

    public int ultimateAttack() {
        Random random = new Random();
        double chance = random.nextDouble();
        int ultimate = 0;
        if (!isParalysed()) {
            if (chance <= 0.20 && healthPoints <= 20) {
                switch (characterType) {
                    case KNIGHT -> ultimate = this.strength * 10;
                    case SORCERER -> ultimate = this.intelligence * 10;
                    case BARD -> ultimate = this.charisma * 10;
                    case ASSASSIN -> ultimate = this.dexterity * 10;
                }
            } else{
                throw new HealthPointsGreaterThan20Exception();
            }
            return ultimate/10;
        } else {
            System.out.println("Cannot attack, you are paralysed!");

        }
        return 0;
    }

    public void removeCharisma(Integer charisma) {
        this.charisma-=charisma;
    }

    public void removeDexterity(Integer dexterity) {
        this.dexterity-=dexterity;
    }

    public void removeIntelligence(Integer intelligence) {
        this.intelligence-=intelligence;
    }

    public void removeStrength(Integer strength) {
        this.strength-=strength;
    }
}