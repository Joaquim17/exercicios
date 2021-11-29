package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner (System.in);
        System.out.println("informe o ano atual");
        int at = leitor.nextInt();
        System.out.println("informe o seu ano de nascimento");
        int an = leitor.nextInt();
        int id = at - an;
        int idf = 2050 - an;
        System.out.println("A idade da pessoa é = "+id);
        System.out.println("A idade da pessoa em 2050 será = "+ idf);
    }
}
