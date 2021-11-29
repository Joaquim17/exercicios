package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor do lado 1");
        float lado1 = leitor.nextFloat();
        System.out.println("Informe o valor do lado 2");
        float lado2 = leitor.nextFloat();
        float A = lado1*lado2;
        System.out.println("A area do quadrado é = a "+A);
    }
}
