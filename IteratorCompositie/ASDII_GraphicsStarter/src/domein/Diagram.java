package domein;

import java.util.ArrayList;
import java.util.List;

public class Diagram extends Graphic {
	
	private List<Graphic> graphics = new ArrayList<>();
	
	public void add(Graphic graphic) {
		graphics.add(graphic);
	}
	
	public void remove(Graphic graphic) {
		graphics.remove(graphic);
	}
	
	public Graphic getGraphic(int i) {
		return graphics.get(i);
	}
	
	@Override
	public void draw() {
		graphics.forEach(Graphic::draw);
	}
}
