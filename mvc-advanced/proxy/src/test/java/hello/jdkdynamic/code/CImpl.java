package hello.jdkdynamic.code;

public class CImpl implements CInterface{
    @Override
    public String test1() {
        return "CImpl 중 test1입니다.";
    }

    @Override
    public String test2() {
        return "CImpl 중 test2입니다.";
    }

    @Override
    public String test3() {
        return "CImpl 중 test3입니다.";
    }
}
