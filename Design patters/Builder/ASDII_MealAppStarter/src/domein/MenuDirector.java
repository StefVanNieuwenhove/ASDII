package domein;

public class MenuDirector {

	private MenuBuilder builder;

	public void buildMenu() {
		// TODO - implement MenuDirector.buildMenu
		builder.createNewMenu();
		builder.applyDrink();
		builder.serveMainDish();
		builder.serveSideDish();
	}

	public Menu getMenu() {
		// TODO - implement MenuDirector.getMenu
		return builder.getMenu();
	}

	public MenuDirector(MenuBuilder builder) {
		// TODO - implement MenuDirector.MenuDirector
		this.builder = builder;
	}

}