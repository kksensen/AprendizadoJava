package Fundamentos.ConceitosBasicos;

//Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

import java.util.Scanner;
import java.lang.Math;

public class ResolveBhaskara {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de 'a': ");
        double a = entrada.nextDouble();

        System.out.println("Digite o valor de 'b': ");
        double b = entrada.nextDouble();

        System.out.println("Digite o valor de 'c': ");
        double c = entrada.nextDouble();

        double delta = (b * b) - (4*a*c);

        System.out.printf("\nSua equação é: %.2f + %.2f + %.2f = 0", a, b, c);

        System.out.println("\nO valor de delta é: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nO x2 da equação é: %.2f", x2);


        entrada.close();
    }
}
