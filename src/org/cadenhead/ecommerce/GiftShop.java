package org.cadenhead.ecommerce;

public class GiftShop {
    public static void main(String[] args) {
        Storefront storefront = new Storefront();
        storefront.addItem("C01", "MUG", "9.99", "150");
        storefront.addItem("C02", "LG MUG", "12.99", "82");
        storefront.addItem("C03", "MOUSEPAD", "10.49", "800");
        storefront.addItem("D01", "T SHIRT", "16.99", "90");

        storefront.sort();

        for (int i = 0; i < storefront.getSize(); i++) {
            Item show = storefront.getItem(i);
            System.out.println("\nItem ID: " + show.getId() +
                    "\nName: " + show.getName() +
                    "\nRetail Price: $" + show.getRetail() +
                    "\nPrice: $" + show.getPrice() +
                    "\nQuantity: " + show.getQuantity());
        }
    }
}
