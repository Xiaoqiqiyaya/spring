package com.kuang.demo1;

public class Cliletn {
    public static  void main(String[] args){
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
