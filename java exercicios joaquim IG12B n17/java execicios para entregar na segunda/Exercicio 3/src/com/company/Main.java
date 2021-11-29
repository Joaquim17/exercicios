package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor 1");
        float valor1 = scanner.nextFloat();
        System.out.println("digite o valor 2");
        float valor2 = scanner.nextFloat();
        float div = valor1 / valor2;
        System.out.println("a divisão do 1ª pelo 2ª é = "+ div);
    }
}
