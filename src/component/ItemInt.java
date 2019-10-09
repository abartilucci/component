package component;

public class ItemInt implements Component {
	private int value;

	public ItemInt ( int value) {
		this.value = value;
	}

	public int getInt() {
		return value;
	}

	public boolean equals (Object c) {

		if ( this == c) return true;

		if ( c == null) return false;

		if ( getClass() != c.getClass() ) return false;

		ItemInt intg = (ItemInt)c;
		return value == intg.value;

	}

	public void accept (Visitor v) {
		v.visitItemInt(this);
	}

}
