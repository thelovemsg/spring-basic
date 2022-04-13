package me.whiteship.designpatterns._02_structural_patterns._08_composite._my_code_before;

public class Customer {

    public static void main(String[] args) {
        Grocery mushroom = new Grocery("송이버섯", 1000, "버섯과");
        Grocery seaweed = new Grocery("미역", 2000, "해조류과");

        Bag bag = new Bag();
        bag.add(mushroom);
        bag.add(seaweed);

        Customer customer = new Customer();
        customer.printPrice(mushroom);
        customer.printPrice(bag);
    }

    private void printPrice(Grocery mushroom) {
        System.out.println(mushroom.getPrice());
    }

    private void printPrice(Bag bag) {
        int total = bag.getItems().stream().mapToInt(Grocery::getPrice).sum();
        System.out.println("total = " + total);
    }

}
