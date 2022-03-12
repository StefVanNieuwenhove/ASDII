package domein;

public class JapanMenuBuilder extends MenuBuilder {

	public void applyDrink() {
		// TODO - implement JapanMenuBuilder.applyDrink
		getMenu().setDrink("sake");
	}

	public void serveMainDish() {
		// TODO - implement JapanMenuBuilder.serveMainDish
		getMenu().setMainCourse("sushi");
	}

	public void serveSideDish() {
		// TODO - implement JapanMenuBuilder.serveSideDish
		getMenu().setSide("miso-soup");
	}

}