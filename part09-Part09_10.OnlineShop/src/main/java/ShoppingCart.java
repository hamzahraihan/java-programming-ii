/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
import java.util.*;

public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<String, Item>();
    }

    public void add(String product, int price) {
        this.cart.putIfAbsent(product, new Item(product, 0, price));
        this.cart.get(product).increaseQuantity();

    }

    public int price() {
        Collection<Item> item = this.cart.values();
        int totalPrice = 0;
        for (Item i : item) {
            totalPrice += i.price();
        }
        return totalPrice;
    }

    public void print() {
        Collection<Item> item = this.cart.values();
        for (Item i : item) {
            System.out.println(i.getProduct() + ": " + i.getQuantity());
        }

    }
}
