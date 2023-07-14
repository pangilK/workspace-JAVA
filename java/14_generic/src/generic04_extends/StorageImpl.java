package generic04_extends;

import java.util.Arrays;

public class StorageImpl<E> implements Storage<E>{
	
	private E[] array;
	
	@SuppressWarnings("unchecked")
	public StorageImpl(int capacity) {
		Object[] o = new Object[capacity];
		this.array = (E[])o;
	}
	
	@Override
	public void add(E item, int index) {
		this.array[index] = item;
	}

	@Override
	public E get(int index) {
		return this.array[index];
	}
	
	
}
