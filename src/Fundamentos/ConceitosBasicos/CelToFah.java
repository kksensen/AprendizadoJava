package Fundamentos.ConceitosBasicos;

//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

import java.util.Scanner;

public class CelToFah {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor em Celsius: ");
        double c = entrada.nextDouble();

        double f = (1.8 * c) + 32;

        System.out.println("O valor em Fahrenheit é: " + f);
        entrada.close();
    }
}
