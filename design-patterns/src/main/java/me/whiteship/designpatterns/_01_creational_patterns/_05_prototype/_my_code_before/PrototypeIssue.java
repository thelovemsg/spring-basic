package me.whiteship.designpatterns._01_creational_patterns._05_prototype._my_code_before;

import java.util.Objects;

public class PrototypeIssue implements Cloneable{

    private int id;

    private String title;

    private PrototypeRepository repository;

    public PrototypeIssue(PrototypeRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PrototypeRepository getRepository() {
        return repository;
    }

    public String getText(){
        return String.format("Prototype Method Test with PrototypeRepository => "
                + repository.getUser() + " " + repository.getName() + " " + this.getId());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PrototypeRepository repository = new PrototypeRepository();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());

        PrototypeIssue prototypeIssue = new PrototypeIssue(repository);
        prototypeIssue.setId(this.id);
        prototypeIssue.setTitle(this.getTitle());

        return prototypeIssue;
//        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrototypeIssue that = (PrototypeIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }
}
