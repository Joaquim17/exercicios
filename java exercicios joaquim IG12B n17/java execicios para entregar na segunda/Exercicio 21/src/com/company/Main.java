package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o salario base do funcionario");
        float sb = leitor.nextFloat();
        float gt = (sb * 5)/ 100;
        float sb1 =sb+ gt;
        float imp = (sb1 * 7)/100;
        float sbf = sb1 -imp;
        System.out.println("temdo em conta a gratificação de 5% e o imposto de 7% o salario será ="+sbf);
    }
}
