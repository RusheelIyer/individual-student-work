
public abstract class InheritParent {
	protected float value;
	protected String name; //Protected means that it can be accessed within the class and from its subclasses or inheritors
	
	public InheritParent(float value, String name){
		this.setValue(value);
		this.setName(name);
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
