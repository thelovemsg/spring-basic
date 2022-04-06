package me.whiteship.designpatterns._01_creational_patterns._05_prototype._my_code_before;

public class TestCode {

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeRepository repository = new PrototypeRepository();
        repository.setUser("키메라");
        repository.setName("어흥!");

        PrototypeIssue prototypeIssue = new PrototypeIssue(repository);
        prototypeIssue.setId(1);
        prototypeIssue.setTitle("아 무료하다... 생각보다 내용이 많네...");

        String text = prototypeIssue.getText();
        System.out.println("text = " + text);

        PrototypeIssue clone = (PrototypeIssue) prototypeIssue.clone();
        System.out.println("text = " + clone.getText());

        repository.setUser("이름 변환하기");

        System.out.println(clone != prototypeIssue);
        System.out.println(clone.equals(prototypeIssue));
        System.out.println(clone.getClass() == prototypeIssue.getClass());
        System.out.println(clone.getRepository() == prototypeIssue.getRepository());

        System.out.println(clone.getText());
    }
}
