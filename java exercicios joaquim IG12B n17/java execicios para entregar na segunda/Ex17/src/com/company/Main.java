package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o salario");
        float s = leitor.nextFloat();
        float sa =(s * 25) / 100;
        float sm = s + sa;
        System.out.print("O salario de "+ s +"com o aumento de 25% agora e ="+ sm);
    }
}
