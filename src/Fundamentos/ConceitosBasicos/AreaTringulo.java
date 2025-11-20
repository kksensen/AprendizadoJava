package Fundamentos.ConceitosBasicos;

//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

import java.util.Scanner;

public class AreaTringulo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da altura do tringulo: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite o valor da base do tringulo: ");
        double base = entrada.nextDouble();

        double area = (altura * base) / 2;

        System.out.println("A area do triangulo é de: " + area);

        entrada.close();
    }
}
