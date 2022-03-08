package mealapp;

import domein.ItalianMenuBuilder;
import domein.JapanMenuBuilder;
import domein.Menu;
import domein.MenuBuilder;
import domein.MenuDirector;

public class MealApp {

   public static void main(String[] args) {
      new MealApp();
   }
   
   public MealApp() {
       
        //TODO
        System.out.printf("menu is: %s%n", getMenu(new ItalianMenuBuilder()));
        
        System.out.printf("menu is: %s%n", getMenu(new JapanMenuBuilder()));
    }
   
   public Menu getMenu(MenuBuilder builder) {
	   MenuDirector director = new MenuDirector(builder);
	   director.buildMenu();
	   return director.getMenu();
   }

   
}
