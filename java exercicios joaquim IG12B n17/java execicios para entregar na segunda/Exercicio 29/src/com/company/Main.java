package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner lt = new Scanner(System.in);
        System.out.println("informe o valor depositado");
        float dp = lt.nextFloat();
        float im =(dp * 0,38)/100;
        float f = dp -im - im;
        System.out.println("o valor restante na conta depois das duas operações é = "+f);
    }
}
