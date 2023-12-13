import exceptions.*;

import java.util.LinkedList;
import java.util.Scanner;

public class Shop {
    private LinkedList<Item> shopList;
    private Scanner sc;
    private Player player;

    Shop(Player player) {
        shopList = new LinkedList<>();
        sc = new Scanner(System.in);
        this.player = player;
        addItemsToShop();
    }

    private void addItemsToShop() {
        switch (player.getSelectedCharacter().getName()) {
            case "KNIGHT" -> {
                shopList.add(ItemFactory.create(ItemType.REGULAR_SWORD));
                shopList.add(ItemFactory.create(ItemType.ZWEINHANDER));
                shopList.add(ItemFactory.create(ItemType.BATTLE_AXE));
                shopList.add(ItemFactory.create(ItemType.HEAL_POTION));
            }
            case "ASSASSIN" -> {
                shopList.add(ItemFactory.create(ItemType.DAGGERS));
                shopList.add(ItemFactory.create(ItemType.SAI));
                shopList.add(ItemFactory.create(ItemType.SHORT_SWORD));
                shopList.add(ItemFactory.create(ItemType.HEAL_POTION));
            }
            case "SORCERER" -> {
                shopList.add(ItemFactory.create(ItemType.MAGIC_STAFF));
                shopList.add(ItemFactory.create(ItemType.MAGIC_BOOK));
                shopList.add(ItemFactory.create(ItemType.WAND));
                shopList.add(ItemFactory.create(ItemType.HEAL_POTION));
            }
            case "BARD" -> {
                shopList.add(ItemFactory.create(ItemType.SMALL_KNIFE));
                shopList.add(ItemFactory.create(ItemType.CROSSBOW));
                shopList.add(ItemFactory.create(ItemType.RAPIER));
                shopList.add(ItemFactory.create(ItemType.HEAL_POTION));
            }
        }
    }

    public void enter() {
        GameMessage.shopMenu();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                GameMessage.itemListShop(this);
                GameMessage.getOption();
                sell(sc.nextInt() - 1);
                break;
            case 2:
                GameMessage.getPlayerInventoryListToUpgrade(player);
                upgrade();
                break;
            case 3:
                buy();
                break;
            case 4:
                break;
        }
    }

    private void sell(int choice) {
        try {
            if (shopList.isEmpty()) throw new ShopIsEmptyException();

            if (choice < 0 || choice >= shopList.size()) {
                throw new ShopItemDontExistException();
            }

            if (player.getGold() < shopList.get(choice).getPriceToBuy()) throw new DontHaveGoldException();

            player.addGold(shopList.get(choice).getPriceToBuy());
            player.removeGold(shopList.get(choice).getPriceToBuy());
            player.getSelectedCharacter().getInventory().getItemList().add(shopList.get(choice));
            GameMessage.getShopSuccessMessage(shopList.get(choice));
            if(!shopList.get(choice).getName().equals("HEAL POTION")) {
                shopList.remove(choice);
            }

        } catch (ShopIsEmptyException | ShopItemDontExistException | DontHaveGoldException e) {
            GameMessage.getExceptionMessage(e.getMessage());
        }
    }

    public void upgrade() {
        try {
            LinkedList<Item> playerItem = player.getSelectedCharacter().getInventory().getItemList();

            if (playerItem.isEmpty()) throw new EmptyInventoryException();

            GameMessage.getOption();
            int choice = sc.nextInt() - 1;

            if (choice < 0 || choice >= shopList.size()) {
                throw new InvalidPlayerItemException();
            }

            if (player.getGold() < playerItem.get(choice).getPriceToUpgrade())
                throw new NotEnoughFundsToUpgradeException();
            if (playerItem.get(choice).getWeaponBetterSkill() >= 50) throw new CantUpgradeAnymoreException();

            if (playerItem.get(choice).getWeaponBetterSkill() < 47) {
                playerItem.get(choice).addToSkill(5);
            } else {
                playerItem.get(choice).addToSkill(3);
            }

            GameMessage.upgradeSuccess(playerItem.get(choice));
            player.removeGold(playerItem.get(choice).getPriceToUpgrade());
            playerItem.get(choice).setPriceToUpgrade((int) (playerItem.get(choice).getPriceToUpgrade() * 0.35));

            if (player.isEquiped()) {
                Item getPlayerItem = null;
                for (Item item : playerItem) {
                    if (player.getWhatIsEquiped().equals(item.getName())) getPlayerItem = item;
                }

                int str = getPlayerItem != null ? getPlayerItem.getStrength() > 10 ? 5 : 0 : 0;
                int dex = getPlayerItem != null ? getPlayerItem.getDexterity() > 10 ? 5 : 0 : 0;
                int cha = getPlayerItem != null ? getPlayerItem.getCharisma() > 10 ? 5 : 0 : 0;
                int ite = getPlayerItem != null ? getPlayerItem.getIntelligence() > 10 ? 5 : 0 : 0;

                player.getSelectedCharacter().setCharisma(cha);
                player.getSelectedCharacter().setIntelligence(ite);
                player.getSelectedCharacter().setDexterity(dex);
                player.getSelectedCharacter().setStrength(str);
            }

        } catch (InvalidPlayerItemException | NotEnoughFundsToUpgradeException | EmptyInventoryException |
                 CantUpgradeAnymoreException e) {
            GameMessage.getExceptionMessage(e.getMessage());
        }
    }

    public void buy() {
        try {
            LinkedList<Item> playerItem = player.getSelectedCharacter().getInventory().getItemList();
            if (playerItem.isEmpty()) throw new EmptyInventoryException();

            GameMessage.getPlayerInventoryList(player);
            GameMessage.whatItemYouWantToSell();
            GameMessage.getOption();
            int choice = sc.nextInt() - 1;

            if (playerItem.get(choice) == null) throw new InvalidPlayerItemException();

            player.addGold(playerItem.get(choice).getPriceToBuy() / 2);
            GameMessage.successSell(playerItem, choice);
            playerItem.remove(choice);
        } catch (EmptyInventoryException | InvalidPlayerItemException e){
            GameMessage.getExceptionMessage(e.getMessage());
        }
    }

    public LinkedList<Item> getShopList() {
        return shopList;
    }
}
