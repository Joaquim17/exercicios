package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o valor do salario minimo");
        float sm = leitor.nextFloat();
        System.out.println("informe o valor do salario do funcionario ");
        float s = leitor.nextFloat();
        float q = s/sm;
        System.out.print("A quantidade de salarios minimos existentes no salario do funcionario  é ="+q);
    }
}
