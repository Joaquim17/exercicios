package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o salario do funcionario");
        float sa = leitor.nextFloat();
        System.out.println("Informe o percentual de aumento");
        float au = leitor.nextFloat();
        float p = (sa*au) / 100;
        float pn = sa + p;
        System.out.println("O novo salario é de "+pn);
    }
}
