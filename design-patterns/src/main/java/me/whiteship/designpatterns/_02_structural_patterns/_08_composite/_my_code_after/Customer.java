package me.whiteship.designpatterns._02_structural_patterns._08_composite._my_code_after;


public class Customer {

    public static void main(String[] args) {
        Grocery mushroom = new Grocery("송이버섯", 1000, "버섯과");
        Grocery seaweed = new Grocery("미역", 2000, "해조류과");

        Bag bag = new Bag();
        bag.add(mushroom);
        bag.add(seaweed);

        Customer customer = new Customer();
        customer.printBag(bag);

        System.out.println(" ============= ");

        customer.printPrice(mushroom);
        customer.printName(mushroom);
        customer.printPrice(bag);
    }

    private void printBag(Component component){
        System.out.println(component.getName());
    }

    private void printName(Component component) {
        System.out.println(component.getName());
    }

    private void printPrice(Component component){
        System.out.println(component.getPrice());
    }


}
