package by.htp.flower.bean;

public class Leaf {
	private String color;
	private String shape;
	
	 Leaf (String color, String shape) {
		this.color=color;
		this.shape=shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
}
