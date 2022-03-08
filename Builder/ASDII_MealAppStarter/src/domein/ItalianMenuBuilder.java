package domein;

public class ItalianMenuBuilder extends MenuBuilder {

	public void applyDrink() {
		// TODO - implement ItalianMenuBuilder.applyDrink
		getMenu().setDrink("red wine");
	}

	public void serveMainDish() {
		// TODO - implement ItalianMenuBuilder.serveMainDish
		getMenu().setMainCourse("pizza margherita");
	}

	public void serveSideDish() {
		// TODO - implement ItalianMenuBuilder.serveSideDish
		getMenu().setSide("bread");
	}

}