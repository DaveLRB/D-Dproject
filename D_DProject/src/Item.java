public class Item {
    private String name;
    private Integer priceToBuy;
    private Integer priceToUpgrade;
    private Integer strength;
    private Integer charisma;
    private Integer dexterity;
    private Integer intelligence;

    public Item(String name, Integer priceToBuy, Integer priceToUpgrade, Integer strength, Integer charisma, Integer dexterity, Integer intelligence) {
        this.name = name;
        this.priceToBuy = priceToBuy;
        this.strength = strength;
        this.charisma = charisma;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.priceToUpgrade = priceToUpgrade;
    }

    public String getName() {
        return name;
    }

    public Integer getPriceToUpgrade() {
        return priceToUpgrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriceToBuy() {
        return priceToBuy;
    }

    public void setPrice(Integer price) {
        this.priceToBuy = price;
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