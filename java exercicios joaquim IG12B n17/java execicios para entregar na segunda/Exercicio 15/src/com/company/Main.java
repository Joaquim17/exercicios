package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int y = leitor.nextInt();
        Math.pow(x,y);
        System.out.println("O resulatdo de "+x+" elevado a "+y+" e = "+Math.pow(x,y));
    }
}
