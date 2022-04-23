package me.whiteship.designpatterns._02_structural_patterns._10_facade._my_code;

public class CheckStringParam {

    static String checkStringParam(String param){
        if(param.equals("test1")){
            throw new IllegalArgumentException("test1 !!!");
        }

        if(param.equals("test2")){
            throw new IllegalArgumentException("test2 !!!");
        }

        return param;
    }

}
