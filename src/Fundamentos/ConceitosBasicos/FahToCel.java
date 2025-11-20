package Fundamentos.ConceitosBasicos;

//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor em Fahrenheit: ");
        double f = entrada.nextDouble();

        double c = (f - 32) / 1.8;

        System.out.println("O valor em celsius é: " + c);
        entrada.close();
    }
}
