package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o preço do produto");
        int p = leitor.nextInt();
        float PP = (p * 10) / 100;
        float p2 = p - PP;
        System.out.println("tendo em conta o desconto de 10% o valor cai de "+p+ " para " +p2);

    }
}
