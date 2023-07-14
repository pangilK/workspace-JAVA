package exam02;

public class Container<T,M> {
	private T key;
	private M value;
	public T getKey() {
		return key;
	}
	public void set(T key,M value) {
		this.key = key;
		this.value = value;
	}
	public M getValue() {
		return value;
	}
	public void setValue(M value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Container [key=" + key + ", value=" + value + "]";
	}
	
}

