package me.whiteship.designpatterns._02_structural_patterns._08_composite._01_before;

import java.util.*;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);
        int[] test = {2,7,4,1,8,1};

        List<Integer> stoneList = (LinkedList)Arrays.stream(test).sorted().boxed().collect(Collectors.toCollection(LinkedList::new));

        while(stoneList.size() != 1){
            System.out.println("stoneList = " + stoneList);
            int max = Collections.max(stoneList);
            stoneList.remove(stoneList.indexOf(max));
            int nextMax = Collections.max(stoneList);

            if(nextMax == max){
                stoneList.remove(stoneList.indexOf(nextMax));
            }else {
                stoneList.remove(stoneList.indexOf(nextMax));
                stoneList.add(max - nextMax);
            }
        }
        System.out.println(stoneList);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }

}
