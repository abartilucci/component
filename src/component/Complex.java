package component;

import java.util.*;

public class Complex implements Component {
	private LinkedList<Component> itemComponents = new LinkedList<Component>();

	public void add(Component component) {
		itemComponents.add(component);
	}

	public void remove(Component component) {
		itemComponents.remove(component);
	}

	public boolean equals(Object c) {
		
		if ( this == c) return true;

		if ( c == null) return false;

		if ( getClass() != c.getClass() ) return false;

		else return true;
	}
	
	public LinkedList<Component> getList(){
		return itemComponents;
	}

	public void accept (Visitor v) {
		v.visitComplex(this);
	}
	
}
