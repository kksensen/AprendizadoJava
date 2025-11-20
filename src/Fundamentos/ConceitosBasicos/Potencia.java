package Fundamentos.ConceitosBasicos;

//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

import java.lang.Math;
import java.util.Scanner;

public class Potencia {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor que deseja potencializar: ");
        int num = entrada.nextInt();

        double aoQuadrado = Math.pow(num, 2);
        double aoCubo = Math.pow(num, 3);

        System.out.println("O número " + num + " ao quadrado é: " + aoQuadrado);
        System.out.println("O número " + num + " ao cubo é: " + aoCubo);

        entrada.close();

    }
}
