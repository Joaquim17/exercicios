package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor =new Scanner(System.in);
        System.out.println("informe o valor da base do triangulo");
        float b= leitor.nextFloat();
        System.out.println("informe a Altura do triangulo ");
        float a = leitor.nextFloat();
        float A = (b*a)/2;
        System.out.println("A area do triangulo é = "+ A);
    }
}
