package me.whiteship.designpatterns._02_structural_patterns._08_composite._my_code_before;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    List<Grocery> groceryList = new ArrayList<>();

    public void add(Grocery grocery) {
        groceryList.add(grocery);
    }

    public List<Grocery> getItems() {
        return groceryList;
    }
}
