package mediatheque;

public interface Visiteur {
	void visit(Book book);

	void visit(CD cd);
}
