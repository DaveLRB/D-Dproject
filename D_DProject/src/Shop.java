import exceptions.*;

import java.util.LinkedList;
import java.util.Scanner;

public class Shop {
    private LinkedList<Item> shopList;
    private Scanner sc;

    Shop() {
        shopList = new LinkedList<>();
        sc = new Scanner(System.in);
        addItemsToShop();
    }

    private void addItemsToShop() {
        shopList.add(ItemFactory.create(ItemType.SWORD));
        shopList.add(ItemFactory.create(ItemType.MAGIC_STAFF));
    }

    public void enter(Player player) {
        GameMessage.shopMenu();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                GameMessage.itemListShop(this);
                GameMessage.getOption();
                sell(sc.nextInt()-1, player);
            case 2:


        }
    }

    private void sell(int choice, Player player) {
        try {
            if (shopList.isEmpty()) throw new ShopIsEmptyException();
            if (shopList.get(choice) == null) throw new ShopItemDontExistException();
            //if(player.getGold() < shopList.get(choice).getPrice()) throw new DontHaveGoldException();

            //player.setGold(player.getGold() - shopList.get(choice).getPrice());
            //player.getInventory().add(shopList.get(choice));
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

            /*if (player.getSELECTED_CHARACTER().getInventory().get(choice) == null)
                throw new InvalidPlayerItemException();
            if (player.getGold() < player.getInventory().get(choice).getPriceToUpgrade())
                throw new NotEnoughFundsToUpgradeException();
            */
            // TODO: 07/12/2023 logica para aumentar os status do item (se tiver que dar mais força, só pode aumentar a força) 

        } catch (InvalidPlayerItemException | NotEnoughFundsToUpgradeException e) {
            GameMessage.getExceptionMessage(e.getMessage());
        }
    }

    public LinkedList<Item> getShopList() {
        return shopList;
    }
}
