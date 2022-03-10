package domein;

import java.util.Iterator;

public abstract class MenuComponent {

	private String name;
	private String description;
	
	public MenuComponent(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// methode die overal voorkomen met dezeflde implementatie
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	// methode dke niet overak voorkomen
	public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
    	throw new UnsupportedOperationException();
    }
	
    public void add(MenuComponent menuComponent) {
    	throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
    	throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
    	throw new UnsupportedOperationException();
    }
    
    // methode die overal voorkomen en niet dezelfde implementatie
    public abstract void print();
    
    // iterator-pattern
    public abstract Iterator<MenuComponent> createIterator();
}