package component;

public interface Component {

	public default void add(Component component) {
		throw new UnsupportedOperationException();
	}

	public default void remove(Component component) {
		throw new UnsupportedOperationException();
	}

	public boolean equals(Object c) throws UnsupportedOperationException;

	public void accept(Visitor v);

}
