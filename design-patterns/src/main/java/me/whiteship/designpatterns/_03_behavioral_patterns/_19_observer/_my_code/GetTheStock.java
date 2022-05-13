package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._my_code;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

    private int startTime;
    private String stock;
    private double price;

    private ConcreteSubject concreteSubject;

    public GetTheStock(ConcreteSubject concreteSubject, int newStartTime, String newStock, double newPrice){
        this.concreteSubject = concreteSubject;

        startTime = newStartTime;
        stock = newStock;
        price = newPrice;
    }

    @Override
    public void run() {
        for (int i=1; i<=20; i++){
            try {
                Thread.sleep(2000);
            }catch (Exception e){

            }
            double randNum = (Math.random() * (.06)) - .03;

            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.valueOf(df.format((price + randNum)));

            if(stock == "IBM") ((ConcreteSubject)concreteSubject).setIbmPrice(price);
            if(stock == "AAPL") ((ConcreteSubject)concreteSubject).setAaplPrice(price);
            if(stock == "GOOG") ((ConcreteSubject)concreteSubject).setGoogPrice(price);

            System.out.println(stock + ": " + df.format((price + randNum))
                + " " + df.format(randNum));

            System.out.println();

        }
    }

}
