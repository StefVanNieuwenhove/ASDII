package domein;

public abstract class MenuBuilder {

	private Menu menu;

	public void createNewMenu() {
		// TODO - implement MenuBuilder.createNewMenu
		menu = new Menu();
	}

	public Menu getMenu() {
		return this.menu;
	}

	public abstract void applyDrink();

	public abstract void serveMainDish();

	public abstract void serveSideDish();

}