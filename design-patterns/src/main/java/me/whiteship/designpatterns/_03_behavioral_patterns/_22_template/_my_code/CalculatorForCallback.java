package me.whiteship.designpatterns._03_behavioral_patterns._22_template._my_code;

import java.util.HashMap;
import java.util.Map;

public class CalculatorForCallback {

    private Map<String, Integer> map = new HashMap<>();

    public void makeProcess(String calName, int a, int b, CallbackInterface callbackInterface){
        if(map.containsKey(calName)){
            System.out.println("이미 존재하는 방식입니다.");
            for (String s : map.keySet()) {
                System.out.println("map key : " + calName + "/ map value : " + map.get(s));
            }
        }else{
            System.out.println("공식 값 세팅하기");
            System.out.println("공식 이름 : " + calName);
            System.out.printf("입력값 : %d & %d\n", a, b);
            int result = callbackInterface.getResult(a, b);
            System.out.println("결과값 : " + result);
            map.put(calName, result);
        }
        System.out.println();
    }

    public void executeProcess(String calName){
        if(map.containsKey(calName)){
            System.out.println("공식 찾아보기 : " + calName);
            System.out.println("결과 : " + map.get(calName));
        }else {
            System.out.println("존재하지 않는 공식입니다. 실패!");
        }
        System.out.println();
    }

}
