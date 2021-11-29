package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o ano actual");
        int at = leitor.nextInt();
        System.out.println("digite os seu ano de nascimento ");
        int an = leitor.nextInt();
        int id = at - an ;
        int idm = id * 12;
        int idd = id*365;
        int ids = idm * 4;
        System.out.println("A idade em anos é = "+id);
        System.out.println("A idade em meses é ="+idm);
        System.out.println("A idade em dias é ="+idd);
        System.out.println("A idade da pessoa em semanas é = "+ids);

    }
}
