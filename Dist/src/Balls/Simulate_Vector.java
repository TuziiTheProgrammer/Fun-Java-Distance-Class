package Balls;

public class Simulate_Vector {

	
	public static void main(String[] args){
		Object obj = new Object("Kat", 5);
		Screen Screen1 = new Screen(20, "Kats Enviroment");
		Screen1.create1DScreen();
		Screen1.screen(true, obj);
		int x = Screen1.getPos();
		obj.getDistance(x, obj.pos);
		obj.viewPosition();
	}
}
