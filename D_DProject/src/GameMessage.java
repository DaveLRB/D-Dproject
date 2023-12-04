public class GameMessage {
    public void getPlayerSelectCharacterMenu() {
        int count = 0;
        System.out.println(count++ + " " + CharacterType.KNIGHT.name() + " | Strength: " + CharacterType.KNIGHT.getStrength() + " | Dexterity: " + CharacterType.KNIGHT.getDexterity() + " | Charisma: " + CharacterType.KNIGHT.getCharisma() + " | Intelligence: "+ CharacterType.KNIGHT.getIntelligence());
        System.out.println(count++ + " " + CharacterType.SORCERER.name() + " | Strength: " + CharacterType.SORCERER.getStrength() + " | Dexterity: " + CharacterType.SORCERER.getDexterity() + " | Charisma: " + CharacterType.SORCERER.getCharisma() + " | Intelligence: "+ CharacterType.SORCERER.getIntelligence());
        System.out.println(count++ + " " + CharacterType.BARD.name() + " | Strength: " + CharacterType.BARD.getStrength() + " | Dexterity: " + CharacterType.BARD.getDexterity() + " | Charisma: " + CharacterType.BARD.getCharisma() + " | Intelligence: "+ CharacterType.BARD.getIntelligence());
        System.out.println(count++ + " " + CharacterType.ASSASSIN.name() + " | Strength: " + CharacterType.ASSASSIN.getStrength() + " | Dexterity: " + CharacterType.ASSASSIN.getDexterity() + " | Charisma: " + CharacterType.ASSASSIN.getCharisma() + " | Intelligence: "+ CharacterType.ASSASSIN.getIntelligence());
    }
}
