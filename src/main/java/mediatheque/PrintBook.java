package mediatheque;

public class PrintBook implements Visiteur {
	@Override
	public void visit(Book book) {
		System.out.println(book);
	}

	@Override
	public void visit(CD cd) {
	}
}
