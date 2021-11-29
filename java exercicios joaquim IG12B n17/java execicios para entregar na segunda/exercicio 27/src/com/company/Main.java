package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o preço de fabrica do carro");
        float pfc = leitor.nextFloat();
        System.out.println("informe o percentual do lucro do distribuidor");
        float pd = leitor.nextFloat();
        System.out.println("informe o percentual de impostos ");
        float pi = leitor.nextFloat();
        float id = (pfc*(pd/100));
        float imp = (pfc *pi /100);
        float pf1 = (pfc + id +imp);
        System.out.println("o preço final do veiculo é ="+pf1);

    }
}
