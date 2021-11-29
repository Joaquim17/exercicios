package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.print("digite a primeira nota ");
        float n1 = leitor.nextFloat();
        System.out.println("informe o peso da nota1 ");
        float p1 = leitor.nextFloat();
        System.out.println("digite a nota 2");
        float n2 = leitor.nextFloat();
        System.out.println("informe o peso da nota 2" );
        float p2 = leitor.nextFloat();
        System.out.println("informe o valor da nota 2");
        float n3 = leitor.nextFloat();
        System.out.println("informe o peso da nota 3");
        float p3 = leitor.nextFloat();
        float mp = (n1*p1*n2*p2*n3*p3)/ p1+p2+p3;
        System.out.println("A media pondera é ="+mp);
    }
}
