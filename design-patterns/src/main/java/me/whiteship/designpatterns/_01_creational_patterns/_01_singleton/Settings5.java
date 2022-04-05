package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

/**
 * Enum을 사용해서 싱글톤 만들기
 */
public enum Settings5 {

    INSTANCE;

    private Settings5(){}

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
