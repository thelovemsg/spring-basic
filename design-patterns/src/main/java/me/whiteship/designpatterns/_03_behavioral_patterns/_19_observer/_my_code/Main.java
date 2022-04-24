package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._my_code;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver(subject);

        subject.setIbmPrice(127.000);
        subject.setAaplPrice(222.000);
        subject.setGoogPrice(333.000);

        ConcreteObserver observer2 = new ConcreteObserver(subject);

        subject.setIbmPrice(444.00);
        subject.setAaplPrice(555.60);
        subject.setGoogPrice(666.40);

        // Delete one of the observers

        // stockGrabber.unregister(observer2);

        subject.setIbmPrice(197.00);
        subject.setAaplPrice(677.60);
        subject.setGoogPrice(676.40);

        // Create 3 threads using the Runnable interface
        // GetTheStock implements Runnable, so it doesn't waste
        // its one extendable class option

//        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
//        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
//        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);

        // Call for the code in run to execute

//        new Thread(getIBM).start();
//        new Thread(getAAPL).start();
//        new Thread(getGOOG).start();
    }

}
