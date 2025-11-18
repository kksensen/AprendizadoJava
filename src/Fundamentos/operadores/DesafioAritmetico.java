package Fundamentos.operadores;

public class DesafioAritmetico {
    public static void main(String[] args){
        double NumA = Math.pow(6 * (3+2), 2);
        double DenA = 3 * 2;

        double NumB = (1 - 5) * (2 - 7);
        double DenB = 2;

        double superiorA = NumA /DenA;
        double superiorB = Math.pow(NumB /DenB, 2);

        double superior = Math.pow(superiorA - superiorB,3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;

        System.out.println("O total é: " + resultado);
    }
}
