package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor 1");
        int valor1 = scanner.nextInt();
        System.out.println("digite o valor 2");
        int valor2 = scanner.nextInt();
        System.out.println("digite o valor 3");
        int valor3 = scanner.nextInt();
        int mult = valor1 * valor2 * valor3;
        System.out.println("A multipliçao dos numeros é = "+mult);
    }
}
