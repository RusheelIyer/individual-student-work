
public class Encapsulation{
	
	private String a; //Private cannot be accessed outside this class
	private int b;
	private boolean c;
	

	public Encapsulation(){}

	public String getA() { //Public getters and setters allow partial data access while the class still contains all the data
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public boolean isC() {
		return c;
	}

	public void setC(boolean c) {
		this.c = c;
	}
	
	//Allows easy changing of internal data-types witout conflict
	
	private int a2;
	
	public void setA2(String a){
		this.a2 = Integer.parseInt(a);			
	}
	
	public String getA2(){
		return String.valueOf(a2);
	}
	
	// We have a2 which is functionally identical to a for the user, but uses a different datatype internally
	// This can be maintained by encapsulation wherein we store more data and reveal only the public parts 
}
