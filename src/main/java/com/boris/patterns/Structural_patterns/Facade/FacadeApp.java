package com.boris.patterns.Structural_patterns.Facade;

import java.io.IOException;
import java.net.InetAddress;

public class FacadeApp {

    public static void main(String[] args) throws IOException {

        FacadeConsole facade = new FacadeConsole();
        System.out.printf("string >");
        String s = facade.getString();
        System.out.println(s);
        System.out.printf("int >");
        int n = facade.getInt();
        System.out.println(n);
        System.out.printf("ip >");
        InetAddress ip = facade.getIp();
        System.out.println(ip);

    }
}
