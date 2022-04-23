package me.whiteship.designpatterns._02_structural_patterns._10_facade._my_code;

public class MakeString {

    public static void main(String[] args) {
        /**
         * Facade pattern 구현 전
         */
        String getParam = "testParam";

        if(getParam.equals("test1")){
            throw new IllegalArgumentException("test1 !!!");
        }

        if(getParam.equals("test2")){
            throw new IllegalArgumentException("test2 !!!");
        }

        System.out.println("getParam = " + getParam);

        /**
         * Facade pattern 구현 후
         */

        System.out.println(CheckStringParam.checkStringParam("testParam"));

    }

}
