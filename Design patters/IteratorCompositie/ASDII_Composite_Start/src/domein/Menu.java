package domein;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponents = new ArrayList<>();
    //private String name;
    //private String description;

    public Menu(String name, String description) {
       super(name, description);
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    /*public String getName() {
        return name;
    }*/
    
    /*public String getDescription() {
        return description;
    }*/
    
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        /*menuComponents.forEach( menuComponents ->
        {
        		if (menuComponents instanceof MenuItem item)
        			item.print();
        		else
        			((Menu)menuComponents).print();
        }
        );*/
        menuComponents.forEach(MenuComponent::print);
    }

	@Override
	public Iterator<MenuComponent> createIterator() {
		
		return menuComponents.iterator();
	}

}
