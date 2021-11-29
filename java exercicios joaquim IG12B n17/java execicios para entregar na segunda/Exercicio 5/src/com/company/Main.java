package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor da nota 1");
        float nota1 = scanner.nextFloat();
        System.out.println("digite o valor da nota 2");
        float nota2 = scanner.nextFloat();
        System.out.println("digite o valor da nota 3");
        float nota3 = scanner.nextFloat();
        float media = (nota1+nota2+nota3)/3 ;

        System.out.println("a media e = a "+media);

    }
}
