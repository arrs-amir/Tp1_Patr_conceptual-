package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		accept(new PrintCatalogue());
	}

	public void accept(Visiteur visiteur) {
		for (Item item : items)
			item.accept(visiteur);
	}
	
	public void printOnlyBooks() {
		accept(new PrintBook());
	}

	public void printOnlyCDs() {
		accept(new PrintCd());
	}

}
