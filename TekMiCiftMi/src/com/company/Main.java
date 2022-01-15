package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        int a = scanner.nextInt();

        if(a%2==0){
            System.out.println("Girilen sayı çift sayıdır.\n");
        }else {
            System.out.println("Girilen sayı tek sayıdır\n");
        }
    }
}
