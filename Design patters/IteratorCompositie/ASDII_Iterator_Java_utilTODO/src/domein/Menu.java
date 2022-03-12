package domein;

import java.util.Iterator;

public interface Menu {

	Iterator<MenuItem> createIterator();
	String getTitle();	
}
