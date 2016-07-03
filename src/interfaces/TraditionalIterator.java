package interfaces;

public interface TraditionalIterator<T> {
	public T getCurrent();
	public boolean hasNext();
	public void next();
}
