package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o salario ");
        float sa = leitor.nextFloat();
        System.out.println("informe o valor de vendas ");
        float vv = leitor.nextFloat();
        float vvp = (vv * 4)/100;
        float saf = sa +vvp;
        System.out.println("O salario final final tendo em conta o valor das vendas será ="+saf);
    }
}
