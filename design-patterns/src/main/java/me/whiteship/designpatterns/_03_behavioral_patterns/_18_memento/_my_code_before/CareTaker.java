package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._my_code_before;

import java.util.ArrayList;

public class CareTaker {

    ArrayList<Memento> savedArticles = new ArrayList<>();

    public void addMemento(Memento m) {
        savedArticles.add(m);
    }

    public Memento getMemento(int index){
        return savedArticles.get(index);
    }



}
