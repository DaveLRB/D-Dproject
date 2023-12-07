import exceptions.DontHaveGoldException;
import exceptions.ShopIsEmptyException;
import exceptions.ShopItemDontExistException;

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
        GameMessage.shopMenu(this);
        int choice = sc.nextInt()-1;
        sell(choice, player);
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

    public LinkedList<Item> getShopList() {
        return shopList;
    }
}
