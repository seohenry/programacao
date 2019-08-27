package com.unama;

import java.util.Scanner;

public class LetraC {
    public static void main(String [] args) {
        double base;
        double altura;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a base:");
        base = sc.nextDouble();
        System.out.print("Informe a aultura:");
        altura = sc.nextDouble();
        area =(base*altura)/2;
        System.out.println("A área do triangulo é:"  +area);
    }
}
