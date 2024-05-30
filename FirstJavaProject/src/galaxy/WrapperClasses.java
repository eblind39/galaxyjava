package galaxy;

/*
 * Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
 */
public class WrapperClasses {
	private Integer myInt;
	private Double myDouble;
	private Boolean isTemplate;
	
	public WrapperClasses() {
		this.myInt = 7;
		this.myDouble = 3.141592;
		this.isTemplate = true;
	}
	
	public void AutoboxingUnboxing() {
		this.Autoboxing();
		this.Unboxing();
	}
	
	/*
	 * Converting a primitive value (an int, for example) into an object of the corresponding wrapper class (Integer) is called autoboxing. 
	 * The Java compiler applies autoboxing when a primitive value is:
	 * Passed as a parameter to a method that expects an object of the corresponding wrapper class.
	 * Assigned to a variable of the corresponding wrapper class.
	 */
	private void Autoboxing() {
		int primitivo = 42;
		this.myInt = primitivo;
		System.out.println("Autoboxing: " + Integer.toString(primitivo));
	}
	
	/*
	 * Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value is called unboxing. 
	 * The Java compiler applies unboxing when an object of a wrapper class is:
	 * Passed as a parameter to a method that expects a value of the corresponding primitive type.
	 * Assigned to a variable of the corresponding primitive type. 
	 */
	private void Unboxing() {
		Integer myWrapped = 10;
		int myPrimitive = myWrapped;
		System.out.println("Unboxing: " + Integer.toString(myPrimitive));
	}

	public Integer getMyInt() {
		return myInt;
	}

	public void setMyInt(Integer myInt) {
		this.myInt = myInt;
	}

	public Double getMyDouble() {
		return myDouble;
	}

	public void setMyDouble(Double myDouble) {
		this.myDouble = myDouble;
	}

	public Boolean getIsTemplate() {
		return isTemplate;
	}

	public void setIsTemplate(Boolean isTemplate) {
		this.isTemplate = isTemplate;
	}
}
