package interfaces;

public interface IOption<T> {
	<U> U visit(IOptionVisitor<T,U> visitor);
}
