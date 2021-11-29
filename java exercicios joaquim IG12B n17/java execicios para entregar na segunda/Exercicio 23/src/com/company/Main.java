package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o peso ");
        float p = leitor.nextInt();
        float pn0 =(p * 15)/100;
        float pn1 = p + pn0;
        float pn01 = (p * 20)/100;
        float pn2 = p- pn01;
        System.out.println("O novo peso com o aumento de 15% será ="+pn1);
        System.out.println("O novo peso com o emagrecimento de 20% será ="+pn2);

    }
}
