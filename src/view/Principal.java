package view;
import controller.DividirController;
public class Principal {

	public static void main(String[] args) {
		
		DividirController dc = new DividirController();
		
		int dividendo = 322;
		int divisor = 70;
		
		System.out.println("Resto igual a: " + dc.fnMod(dividendo, divisor));
		
	}
	
}