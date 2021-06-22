package com.kuang.demo3;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInocationHandler proxyInocationHandler =  new ProxyInocationHandler();
        proxyInocationHandler.setRent(host);
        Rent proxy = (Rent) proxyInocationHandler.getProxy();
        proxy.rent();
    }
}
