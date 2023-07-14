package exam04;

import java.util.Arrays;

/**
 *  ArrayTest class를 완성하시오.
 */
public class ArrayTest<E>{
	private E[] array;
	private int capacity;
	
	@SuppressWarnings("unchecked")
	public ArrayTest (int capacity) {
		this.array = (E[]) new Object[capacity]; 
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}

	public void add(E e) {
		for(int i = 0 ; i < array.length; i++) {
			if(array[i] == null) {
				array[i] = e;
				break;
			}
		}
		if(array.length >= this.capacity) {
			E[] newArray = Arrays.copyOf(array, array.length+1);
			for(int i = 0 ; i < newArray.length ; i++) {
				if(newArray[i] == null) {
					newArray[newArray.length-1] = e;
					break;
				}
			}
			array = newArray;
		}
	}

	public int size() {
		return array.length;
	}

	public void remove(E e) {
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] == e) {
				
			}
		}
		
	}

	

	
}


