package controller;

public class DividirController {

	public DividirController() {
		
		super();
	
	}
	
	public int fnMod(int dividendo, int divisor) {
		
		if(divisor > dividendo) {
			
			return dividendo;
			
		} else {
			
			return 0 + fnMod(dividendo - divisor, divisor);
			
		}
		
	}
	
}