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
            }
            case "ASSASSIN" -> {
                shopList.add(ItemFactory.create(ItemType.DAGGERS));
                shopList.add(ItemFactory.create(ItemType.SAI));
                shopList.add(ItemFactory.create(ItemType.SHORT_SWORD));
            }
            case "SORCERER" -> {
                shopList.add(ItemFactory.create(ItemType.MAGIC_STAFF));
                shopList.add(ItemFactory.create(ItemType.MAGIC_BOOK));
                shopList.add(ItemFactory.create(ItemType.WAND));
            }
            case "BARD" -> {
                shopList.add(ItemFactory.create(ItemType.SMALL_KNIFE));
                shopList.add(ItemFactory.create(ItemType.CROSSBOW));
                shopList.add(ItemFactory.create(ItemType.RAPIER));
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
                sell(sc.nextInt()-1);
            case 2:


        }
    }

    private void sell(int choice) {
        try {
            if (shopList.isEmpty()) throw new ShopIsEmptyException();
            if (shopList.get(choice) == null) throw new ShopItemDontExistException();
            if(player.getGold() < shopList.get(choice).getPriceToBuy()) throw new DontHaveGoldException();

            player.addGold(player.getGold() - shopList.get(choice).getPriceToBuy());
            player.getSelectedCharacter().getInventory().getItemList().add(shopList.get(choice));
            GameMessage.getShopSuccessMessage(shopList.get(choice));
            shopList.remove(choice);

        } catch (ShopIsEmptyException | ShopItemDontExistException | DontHaveGoldException e) {
            GameMessage.getExceptionMessage(e.getMessage());
        }
    }

    public void upgrade(Player player) {
        GameMessage.getPlayerInventoryList(player);

        try {
            int choice = sc.nextInt()-1;

            if (player.getSelectedCharacter().getInventory().getItemList().get(choice) == null)
                throw new InvalidPlayerItemException();
            if (player.getGold() < player.getSelectedCharacter().getInventory().getItemList().get(choice).getPriceToUpgrade())
                throw new NotEnoughFundsToUpgradeException();

            // TODO: 07/12/2023 logica para aumentar os status do item (se tiver que dar mais força, só pode aumentar a força) 

        } catch (InvalidPlayerItemException | NotEnoughFundsToUpgradeException e) {
            GameMessage.getExceptionMessage(e.getMessage());
        }
    }

    public LinkedList<Item> getShopList() {
        return shopList;
    }
}
