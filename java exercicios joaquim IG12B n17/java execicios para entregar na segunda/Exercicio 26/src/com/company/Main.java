package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um valor ");
        int v = leitor.nextInt();
        Math.pow(v,4);
        Math.pow(v,3);
        Math.sqrt(v);
        System.out.println("O numero digitado ao quadrado é = "+Math.pow(v,4));
        System.out.println("O numero digitado ao cubo é = "+Math.pow(v,3));
        System.out.println("A raiz quadrada do numero digitado é = "+Math.sqrt(v));
    }
}
