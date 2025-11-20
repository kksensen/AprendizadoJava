package Fundamentos.ConceitosBasicos;

//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

import java.util.Scanner;
import java.lang.Math;

public class CalculaIMC {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso do usuário: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite a altura do usuário: ");
        double altura = entrada.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        System.out.println("O valor do IMC do usuário é: " + imc);
        entrada.close();

    }
}
