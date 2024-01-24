package org.example;

import jssc.SerialPortException;

import java.util.Scanner;

public class Main {
    static Wks wks = new Wks();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            wks.initCom("com3");
            wks.configurerParametres(2400,8,0,1);
            wks.demandeQPIGS();
            wks.demandeQPIRI();
            wks.demandeQPIWS();
            sc.nextLine();
        } catch (SerialPortException e) {
            throw new RuntimeException(e);
        }


    }
}