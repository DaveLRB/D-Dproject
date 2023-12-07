public class Item {
    private String name;
    private Integer price;
    private Integer strength;
    private Integer charisma;
    private Integer dexterity;
    private Integer intelligence;

    public Item(String name, Integer price, Integer strength, Integer charisma, Integer dexterity, Integer intelligence) {
        this.name = name;
        this.price = price;
        this.strength = strength;
        this.charisma = charisma;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }
}