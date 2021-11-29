package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner lt = new Scanner(System.in);
        System.out.println("infotme o peso do saco de ração(em kilos )");
        float s = lt.nextFloat();
        float sg = s*1000;
        System.out.println("informe a quantidade dada a cada gato (em gramas)");
        float qg = lt.nextFloat();
        float qg1 = qg*2;
        float f = sg -qg1*5;
        System.out.println("após 5 dias restará "+ f+"gramas de ração");
    }
}
