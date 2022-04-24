package me.whiteship.designpatterns._03_behavioral_patterns._18_memento._my_code_before;

public class Memento {

    private String article;

    Memento(String articleSave) {
        article = articleSave;
    }

    public String getSavedArticle(){
        return article;
    }
}
