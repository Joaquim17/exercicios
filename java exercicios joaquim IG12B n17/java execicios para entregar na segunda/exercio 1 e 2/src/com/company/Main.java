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
        System.out.println("digite o valor 4");
        int valor4 = scanner.nextInt();
        int soma = valor1 + valor2 + valor3 + valor4;
        int sub = valor2 - valor1;
        System.out.println("a soma dos valores e = "+soma);
        System.out.println("a subtraçao do 2ª pelo 1ª  = "+ sub);
    }
}
