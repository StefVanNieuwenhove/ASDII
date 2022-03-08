package domein;

import java.util.*;

public class Screen {
	
	private GuiFactory guiFactory;
	private Collection<Component> components;

    public Screen(GuiFactory factory) {
        this.guiFactory = factory;
        components = new ArrayList<>();
    }

    public void addButton() {
        components.add(guiFactory.createButton());
    }

    public void addLabel() {
        components.add(guiFactory.createLabel());
    }

    public void viewComponents() {
        components.forEach(Component::show);
    }

	
}
