package mediatheque;

public class PrintCd implements Visiteur {
	@Override
	public void visit(Book book) {
	}

	@Override
	public void visit(CD cd) {
		System.out.println(cd);
	}
}
