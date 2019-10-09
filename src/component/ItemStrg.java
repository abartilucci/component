package component;

public class ItemStrg implements Component {
	private String value;

	public ItemStrg(String value) {
		this.value = value;
	}

	public String getString() {
		return value;
	}

	public boolean equals(Object c) {
		
		if ( this == c) return true;
		
		if ( c == null) return false;
		
		if ( getClass() != c.getClass() ) return false;
		
		ItemStrg str = (ItemStrg)c;
		
		return value.equals(str.getString());
				
	}
	
	public void accept (Visitor v) {
		v.visitItemStrg(this);
	}

}
