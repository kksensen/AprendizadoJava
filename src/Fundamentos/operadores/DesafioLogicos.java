package Fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        // Operador Unário!
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTV50);
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);

        System.out.println("Mais saudável? " + maisSaudavel);

/*
        //Sistema com IFs
        if (trabalho1 == true && trabalho2 == true) {
            System.out.println("Todos vão ao Shopping, compram a TV de 50\" e tomam sorvete");
        } else if (trabalho1 == false && trabalho2 == false) {
            System.out.println("Todos vão ao Shopping e apenas tomam sorvete");
        } else {
            System.out.println("Todos vão ao Shopping, compram a TV de  32\" e tomam sorvete");
        }*/

    }
}