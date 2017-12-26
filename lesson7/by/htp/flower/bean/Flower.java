package by.htp.flower.bean;

public class Flower {

	private String title;
	private Bud bud;
	private Stem stem;

	public Flower(String title, int stemh, int stemW) {
		this.title = title;
		stem = new Stem(10, 1);
		bud = new Bud();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Bud getBud() {
		return bud;
	}

	public void setBud(Bud bud) {
		this.bud = bud;
	}

	public Stem getStem() {
		return stem;
	}

	public void setStem(Stem stem) {
		this.stem = stem;
	}

	public void grow(int newStemH, int newStemW, int newBudSize) {
		this.stem.setHeight(newStemH);
		this.stem.setWidth(newStemW);
		bud.setSize(newBudSize);
	}

	public void bloom(int newBudSize, String newBudColor) {
		bud.setSize(newBudSize);
		bud.setColor(newBudColor);
		bud.addFreshLeaves(7, "White", "ellipce");
	}

	public void wither(int newStemH, int newStemW, int newBudSize, String newBudColor) {
		bud.setSize(newBudSize);
		bud.setColor(newBudColor);
		this.stem.setHeight(newStemH);
		this.stem.setWidth(newStemW);
		bud.fallLeaves();
		
		
	}
	
}
