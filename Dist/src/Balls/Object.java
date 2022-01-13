package Balls;

public class Object {
	
	String name;
	int Type;
	int pos = 0;
	
	Object(String name, int Type){
		this.name = name;
		this.Type = Type;
		this.pos = pos;
	}
	
	public int Position(int a[]) {
		int max = a.length;
		int min = a.length - a.length;
		int range = max - min +1;
		int i;
		for(i =0; i<max; i++) {
			pos = (int)(Math.random()*range)+ min;
		}
		a[pos] = this.Type;
		return pos;
	} 
	
	public void viewPosition() {
		System.out.println("[[ "+this.name+" "+"is at position:"+" "+pos+".x ]]");
	}
	
	public void getDistance(int x, int y) {
		int dist = x - y;
		System.out.println("--->the distance between:"+" "+this.name+" "+"and the vertex is:"+" "+dist+".d<---\n");
	}
}
