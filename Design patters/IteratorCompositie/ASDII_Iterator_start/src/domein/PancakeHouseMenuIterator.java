package domein;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

	private List<MenuItem> list;
	private int position = 0;
	
	public PancakeHouseMenuIterator(List<MenuItem> list) {
		this.list = list;
	}
	
	@Override
	public boolean hasNext() {
		return this.position < list.size();
	}

	@Override
	public MenuItem next() {
		MenuItem item = list.get(position);
		position += 1;
		return item;
	}

}
