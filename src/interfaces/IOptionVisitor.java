package interfaces;

public interface IOptionVisitor<T, U> {
	public U onSome(T value);
	public U onNone();
}
