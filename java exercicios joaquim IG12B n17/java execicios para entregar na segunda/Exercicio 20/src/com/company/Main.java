package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o custo do espetaculo");
        float vp = leitor.nextFloat();
        System.out.println("informe o valor dos bilhetes");
        float b = leitor.nextFloat();
        float es = vp / b;
        System.out.println("Deveram ser vendidos "+es+" bilhetes ");
    }
}
