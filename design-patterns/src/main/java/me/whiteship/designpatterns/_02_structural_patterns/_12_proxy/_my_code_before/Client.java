package me.whiteship.designpatterns._02_structural_patterns._12_proxy._my_code_before;

public class Client {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        FirstProxyCache proxyCache = new FirstProxyCache(subject);
        ProxyClient client = new ProxyClient(proxyCache);
        client.execute();
        client.execute();
        client.execute();
    }

}
