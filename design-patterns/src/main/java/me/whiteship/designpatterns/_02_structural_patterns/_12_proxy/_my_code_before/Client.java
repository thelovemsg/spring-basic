package me.whiteship.designpatterns._02_structural_patterns._12_proxy._my_code_before;

public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        FirstProxyCache proxyCache = new FirstProxyCache(subject);
        ProxyClient client = new ProxyClient(proxyCache);
        client.execute();
        client.execute();
        client.execute();

        SecondProxyCache secondProxyCache = new SecondProxyCache(subject);
        ProxyClient client1 = new ProxyClient(secondProxyCache);
        client1.execute();
        client1.execute();
        client1.execute();

        ThirdProxyCache thirdProxyCache = new ThirdProxyCache(subject);
        ProxyClient client2 = new ProxyClient(thirdProxyCache);
        client2.execute();
        client2.execute();
        client2.execute();


    }

}
