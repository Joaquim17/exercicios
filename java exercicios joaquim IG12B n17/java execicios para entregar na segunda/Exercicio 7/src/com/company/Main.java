package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o valor da Diagonal maior ");
        float dm = leitor.nextFloat();
        System.out.println("informe os valores da diagonal menor");
        float dn = leitor.nextFloat();
        float A = (dm*dn)/2;
        System.out.println("A area do losango e = a "+A);
    }
}
