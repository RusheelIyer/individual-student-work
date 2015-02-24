
public class InheritChild extends InheritParent{ //Extends means that it inherits all methods from the parent

	public InheritChild(float value, String name) {
		super(value, name); //Using the "super" method means that creating InheritChild with value and name creates
								//an InheritParent with value and name as parameters and uses it for this.
		
	}
	
	@Override
	public float getValue(){
		return (float) ((11.0/10.0)*this.value);
		//To override a method of a parent
	}

}
