package component;

import java.util.*;

public class SumInt implements Visitor {
	private int sum = 0;

	public void visitItemInt(ItemInt i) {
		sum = sum + i.getInt();
	}

	public void visitItemStrg(ItemStrg s) {	}

	public void visitComplex(Complex c) {
		LinkedList<Component> list = new LinkedList<Component>();
		list = c.getList();

		for ( Component cmp : list) {
			cmp.accept(this);
		}			
	}

	public int getSum() {
		return sum;
	}
}
