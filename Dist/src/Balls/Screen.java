package Balls;

public class Screen {
	
	int x;
	String name;
	
	Screen(int x, String name){
		this.x = x;
		this.name = name;
	}
	
	void printStr(String x) {
		System.out.println(x);
	}
	
	void printInt(int x){
		System.out.println(x);
	}
	
	public int[] create1DScreen(){
		int a[] = new int[this.x];
		int i;
		for(i = 0; i<this.x; i++){
			a[i] = 1;
		}
		return a;
	}
	
	public int[] screen(boolean print, Object x){
		int[] a = create1DScreen();
		int mid = (a.length)/2;
		
		x.Position(a);
		
		if(mid%2 == 0){
			a[mid] = 0;
		}else{
			a[(int)Math.floor(mid)] = 0;
		}
		for(int i =0; i<a.length; i++){
			if(print == true) {
				printInt(a[i]);
			}
		}
		return a;
	}
		
	public int getPos() {
		int a[] = create1DScreen();
		
		int mid = (a.length)/2;
		int front = a.length - a.length;
		int distance = mid - front;
		
		System.out.println("----(The screen:"+" "+"'"+this.name+"'"+" "+"has the vertex position:"+" "+distance+".x)----\n");
		
		return distance;
	}
}
