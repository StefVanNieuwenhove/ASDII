package domein;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    //private String name;
    //private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
    	super(name, description);
        this.vegetarian = vegetarian;
        this.price = price;
    }

    /*public String getName() {
        return name;
    }*/

    /*public String getDescription() {
        return description;
    }*/

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
    
    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }

	@Override
	public Iterator<MenuComponent> createIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}

}
