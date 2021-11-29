package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o valor em pés");
        float pes = leitor.nextFloat();
        float pol = pes *12;
        float jar = pes / 3 ;
        float milhas = jar / 1760;
        System.out.print("O valor convertido para polegadas é ="+pol);
        System.out.print("O valor convertido em Jardas é "+jar);
        System.out.print("O valor convertido em milhas é"+milhas);
    }
}
