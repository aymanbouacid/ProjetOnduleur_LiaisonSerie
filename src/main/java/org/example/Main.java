package org.example;

import jssc.SerialPortException;

import java.util.Scanner;

public class Main {
    static Wks wks = new Wks();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            wks.initCom("COM3");
            wks.configurerParametres(2400,8,0,1);
            while(true){
                wks.demandeQPIGS();
                Thread.sleep(5000);
            }
           // sc.nextLine();
        } catch (SerialPortException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}