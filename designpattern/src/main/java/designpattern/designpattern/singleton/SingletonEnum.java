package designpattern.designpattern.singleton;

public enum SingletonEnum {

    INSTANCE;

    SingletonEnum() {

    }

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
