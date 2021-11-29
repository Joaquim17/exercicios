package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner lt = new Scanner(System.in);
        System.out.println("informe o numero de horas trabalhadas ");
        float ht = lt.nextFloat();
        System.out.println("informe o valor do salario minimo ");
        float sm = lt.nextFloat();
        float ht1 = (sm/2);
        float bt = (ht*ht1);
        float im = (bt*3)/100;
        float sr = bt - im ;
        System.out.println("O salario a receber é de " +sr);
    }
}
