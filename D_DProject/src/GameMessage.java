public class GameMessage {
    public void getPlayerSelectCharacterMenu() {
        int count = 0;
        System.out.println(count++ + " " + CharacterType.KNIGHT.name() + " | Strength: " + CharacterType.KNIGHT.getStrength() + " | Dexterity: " + CharacterType.KNIGHT.getDexterity() + " | Charisma: " + CharacterType.KNIGHT.getCharisma() + " | Intelligence: "+ CharacterType.KNIGHT.getIntelligence());
    }
}
