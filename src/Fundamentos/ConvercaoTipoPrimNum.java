package Fundamentos;

public class ConvercaoTipoPrimNum {
    public static void main(String[] args){
        double a = 1; //implicita
        System.out.println(a);

        float b = (float) 1.123456789; // explícita
        System.out.println(b);

        int x = 340;
        byte d = (byte) x; //explícita (CAST)
        System.out.println(b);

        double e = 1.99999;
        int f = (int) e; //explícita (CAST)
        System.out.println(f);
    }
}
