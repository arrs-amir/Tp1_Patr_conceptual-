package mediatheque;

public class PrintCatalogue implements Visiteur {
	@Override
	public void visit(Book book) {
		System.out.println(book);
	}

	@Override
	public void visit(CD cd) {
		System.out.println(cd);
	}
}
