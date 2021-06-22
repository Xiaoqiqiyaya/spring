package com.kuang.demo1;

public class Proxy {
    private  Host host;

    public  Proxy(){

    }

    public  Proxy(Host host){
        this.host = host;
    }

    public void rent(){
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    public  void seeHouse(){
        System.out.println("看房子");
    }

    public void fare(){
        System.out.println("收房租");
    }
    public void hetong(){
        System.out.println("hetong");
    }

}
