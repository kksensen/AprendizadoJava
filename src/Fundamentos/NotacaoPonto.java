package Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		s = s.replace("dia", "tarde");
		s = s.concat("!!!!");
		s = s.replace("X", "moça");
		System.out.println(s);
	}
}
