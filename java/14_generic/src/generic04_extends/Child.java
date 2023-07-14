package generic04_extends;

public class Child<T,M,C> extends Parent<T,M> {
	
	private C compnay;

	// getter setter
	public C getCompnay() {
		return compnay;
	}

	public void setCompnay(C compnay) {
		this.compnay = compnay;
	}
	
	
}
