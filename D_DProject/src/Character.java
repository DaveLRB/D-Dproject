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

    private final Quote[] charQuotesBard = {
            new Quote("MonsterAudio/bard_quote_1.wav", "Am i blind? Or are you a ray of sunshine?!"),
            new Quote("MonsterAudio/bard_quote_2.wav", "Can i sing you a song...of passion?"),
            new Quote("MonsterAudio/bard_quote_3.wav", "Is that a weapon? Or are you happy to see me?!"),
            new Quote("MonsterAudio/bard_quote_4.wav", "WOWZA CHA-WA-BANGA!!"),
            new Quote("MonsterAudio/bard_quote_5.wav", "In tales of old, valor blooms."),
            new Quote("MonsterAudio/bard_quote_6.wav", "With every dawn, a new legend unfolds."),
            new Quote("MonsterAudio/bard_quote_7.wav", "Melodies weave the fabric of our stories."),
            new Quote("MonsterAudio/bard_quote_8.wav", "Words, the bard's sword; songs, the bard's shield.")

    };

    private final Quote[] charQuotesKnight = {
            new Quote("MonsterAudio/knight_quote_1", "The valor of a knight will smite you!"),
            new Quote("MonsterAudio/knight_quote_2", "With my weapon i shall cleanse the world of evil"),
            new Quote("MonsterAudio/knight_quote_3", "Courage is the strength to face uncertainty."),
            new Quote("MonsterAudio/knight_quote_4", "Chivalry is not just a code, but a way of being."),
            new Quote("MonsterAudio/knight_quote_5", "Strength shields the weak, to the evils might."),
            new Quote("MonsterAudio/knight_quote_6", "Valor knows no fear, in the face of darkness."),
            new Quote("MonsterAudio/knight_quote_7", "Honor guides every deed, an honest heart makes."),
            new Quote("MonsterAudio/knight_quote_8", "Adversity forges nobility, were cowardice sows fragility.")
    };

    private final Quote[] charQuotesAssassin = {
            new Quote("MonsterAudio/assassin_quote_1", "My poison daggers will send you to the shadows.."),
            new Quote("MonsterAudio/assassin_quote_2", "In the dark i live..in the dark you shall die"),
            new Quote("MonsterAudio/assassin_quote_3", "Silence is the deadliest weapon in the arsenal of an assassin."),
            new Quote("MonsterAudio/assassin_quote_4", "Darkness is the ally of shadows, and shadows breed the unseen strike."),
            new Quote("MonsterAudio/assassin_quote_5", "Silence speaks louder than steel."),
            new Quote("MonsterAudio/assassin_quote_6", "Shadows are my allies, darkness my cloak."),
            new Quote("MonsterAudio/assassin_quote_7", "Precision is my art, stealth my dance."),
            new Quote("MonsterAudio/assassin_quote_8", "In the quiet, I am deadliest.")
    };

    private final Quote[] charQuotesSorcerer = {
            new Quote("MonsterAudio/sorcerer_quote_1", "With my magic i shall turn you to ash!"),
            new Quote("MonsterAudio/sorcerer_quote_2", "Behold my might..the Sorcerer Supreme!"),
            new Quote("MonsterAudio/sorcerer_quote_3", "Magic flows where intent meets will."),
            new Quote("MonsterAudio/sorcerer_quote_4", "Knowledge is the staff of power wielded by the adept sorcerer."),
            new Quote("MonsterAudio/sorcerer_quote_5", "Magic bends to my will, the elements dance at my command."),
            new Quote("MonsterAudio/sorcerer_quote_6", "Arcane secrets whisper in every spell."),
            new Quote("MonsterAudio/sorcerer_quote_7", "Power courses through my veins, shaped by incantations."),
            new Quote("MonsterAudio/sorcerer_quote_8", "The unseen forces are my allies, shaping reality to my design.")

    };

    private void shuffleQuotes(Quote[] quotes) {
        List<Quote> quotesList = Arrays.asList(quotes);
        Collections.shuffle(quotesList);
        quotesList.toArray(quotes);
    }

    private Quote getRandomQuote(Quote[] quotes) {
        Random random = new Random();
        shuffleQuotes(quotes);
        int index = random.nextInt(quotes.length);
        return quotes[index];
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
        Quote randomQuote = null;
        Music music = null;
        switch (this.getCharacterType()) {
            case BARD -> {
                randomQuote = getRandomQuote(charQuotesBard);
                seduce++;
                if (seduce == 2) {
                    seduce = 0;
                    if (!monster.isSeduced()) {
                        monster.setSeduced(true);
                        System.out.println(randomQuote.getText());
                        monster.monsterSeducedSpeak();
                        music = new Music(randomQuote.getFilename());
                    }
                }
            }
            case KNIGHT -> {
                randomQuote = getRandomQuote(charQuotesKnight);
                music = new Music(randomQuote.getFilename());
            }
            case ASSASSIN -> {
                randomQuote = getRandomQuote(charQuotesAssassin);
                music = new Music(randomQuote.getFilename());
            }
            case SORCERER -> {
                randomQuote = getRandomQuote(charQuotesSorcerer);
                music = new Music(randomQuote.getFilename());
            }
        }
        if (randomQuote != null && !monster.isSeduced()) {
            System.out.println(randomQuote.getText());
            if (music != null) {
                music.play();
            }
        }
    }

    public void characterTakeDamage(Monster monster) {
        this.healthPoints -= monster.monsterAttack(this);
    }

    public int attack(Monster monster, String attackType) {
        if (isParalysed()) {
            System.out.println("Cannot attack, you are paralysed!");
            return 0;
        }
        int attack = 0;
        Random random = new Random();
        double chance = random.nextDouble();
        characterTalk(monster);
        switch (attackType) {
            case "light":
                attack = switch (characterType) {
                    case KNIGHT -> this.strength;
                    case SORCERER -> this.intelligence;
                    case BARD -> this.charisma;
                    case ASSASSIN -> this.dexterity;
                };
                break;
            case "heavy":
                attack = switch (characterType) {
                    case KNIGHT -> this.strength * (int) (Math.random() * 3) + 1;
                    case SORCERER -> this.intelligence * (int) (Math.random() * 3) + 1;
                    case BARD -> this.charisma * (int) (Math.random() * 3) + 1;
                    case ASSASSIN -> this.dexterity * (int) (Math.random() * 3) + 1;
                };
                break;
            case "ultimate":
                if (chance <= 0.20 && healthPoints <= 20) {
                    attack = switch (characterType) {
                        case KNIGHT -> this.strength * 10;
                        case SORCERER -> this.intelligence * 10;
                        case BARD -> this.charisma * 10;
                        case ASSASSIN -> this.dexterity * 10;
                    };
                } else {
                    throw new HealthPointsGreaterThan20Exception();
                }
                break;
            default:
                System.out.println("Invalid attack type!");
                break;
        }
        return attack;
    }

    public void removeCharisma(Integer charisma) {
        this.charisma -= charisma;
    }

    public void removeDexterity(Integer dexterity) {
        this.dexterity -= dexterity;
    }

    public void removeIntelligence(Integer intelligence) {
        this.intelligence -= intelligence;
    }

    public void removeStrength(Integer strength) {
        this.strength -= strength;
    }
}