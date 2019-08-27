package com.unama;

import java.util.Scanner;

public class LetraB {

    public static void main(String[] args) {
	double numero;
	double dobro;
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Informe o número:");
        numero = Scanner.nextDouble();
        dobro = numero * 2;

        System.out.print("O dobro do número é:"+ dobro);

    }
}
