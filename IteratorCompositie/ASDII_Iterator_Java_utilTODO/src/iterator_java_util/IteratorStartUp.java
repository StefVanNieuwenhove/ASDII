package iterator_java_util;

import java.util.Arrays;
import java.util.List;

import domein.DinerMenu;
import domein.Menu;
import domein.PancakeHouseMenu;
import domein.Waitress;

public class IteratorStartUp {
	public static void main(String args[]) {

		//PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		//DinerMenu dinerMenu = new DinerMenu();		
		List<Menu> menus = Arrays.asList(new PancakeHouseMenu(), new DinerMenu());
		
		//Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		Waitress waitress = new Waitress(menus);

		waitress.printMenu();

	}
}
