/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String valore;
        System.out.println("devo stampare a video la parola hello world? (Y|N)");
        valore = tastiera.next();
        if (valore.equals("Y") || valore.equals("yes")) {
            System.out.println("Hello world!");
        } else {
            System.out.println("ok, come non detto");
        }

    }

}
