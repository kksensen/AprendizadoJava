package Fundamentos;

public class InferenciadeTipos {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		//c = 4.5;
		
		double d; //variavel foi declarada
		d = 123.65;//variavel foi inicializada
		System.out.println(d);// usada!
		
		var e = 1;
		System.out.println(e);
		
		var f = 12; //inteiro
		//f = 12.01; diferente não dá certo
		System.out.println(f);
		
		
	}
}
