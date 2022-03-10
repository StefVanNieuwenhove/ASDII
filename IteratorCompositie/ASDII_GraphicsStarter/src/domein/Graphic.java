package domein;

public abstract class Graphic {
	
	public void add(Graphic graphic) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(Graphic graphic) {
		throw new UnsupportedOperationException();
	}
	
	public Graphic getGraphic(int i) {
		throw new UnsupportedOperationException();
	}
	
	public abstract void draw();
}