


public abstract class Shape {
	public int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	abstract void calculateArea(int value);
}