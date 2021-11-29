package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o peso de uma pessoa em kilogrmas(Kg)");
        float p = leitor.nextFloat();
        float pg = (p*1000)/1;
        System.out.println("O peso da pessoa em grmas(g) é ="+pg);
    }
}
