package generic.exam04;

import java.util.Arrays;

/**
 *  ArrayTest class를 완성하시오.
 */
public class ArrayTest<E>{
	
	private int capacity; 		// 저장 가능한 배열의 크기
	private int length; 		// 배열에 저장된 실제 항목의 크기
	private E[] array;			// generic으로 저장된 type의 배열
	
	public ArrayTest() {
		this(10);
	}
	
	public ArrayTest(int capacity) {
		this.capacity = capacity;
		array = (E[]) new Object[capacity];
	}
	
	// 배열에 값 추가
	public void add(E e) {
		
		// 실제 저장된 항목과 배열의 크기가 동일
		if(this.length >= this.capacity) {
			// 더이상 저장할 공간이 없음
			// 새로운 배열 생성
			E[] newArray = (E[]) new Object[capacity + 1];
			this.capacity = newArray.length;
			// this.array.length == capacity
			// 기존 배열의 항목들을 새로운 배열 항목에 복사
			for(int i = 0; i < this.array.length ; i++) {
				newArray[i] = this.array[i];
			}
			newArray[capacity - 1] = e;
			this.array = newArray;
		}else {
			// 기존 배열에 값 추가
			for(int i = 0 ; i < capacity ; i++) {
				if(null == this.array[i]) {
					this.array[i] = e;
					break;
				}
			}
		}

		this.length++;
		
	}
	
	// 배열에 값 삭제
	public void remove(E e) {
		for(int i = 0; i < capacity ; i++) {
			// 원본 배열에서 동일한 값을 가지고 있는 항목을 검색
			if(array[i] != null && array[i].equals(e)) {
				// e == 홍길동
				// 	  0     1  	   2     3      4
				// [최기근][이기근][홍길동][김유신][최기근]
				// [최기근][이기근][김유신][최기근]
				// 동일한 항목을 가진 배열을 찾았다면
				// 크기가 1 감소된 배열
				E[] newArray = (E[])new Object[--capacity];
				for(int j = 0; j < capacity; j++) {
					if(j < i) {
						newArray[j] = this.array[j];
					}else {
						newArray[j] = this.array[j+1];
					}
				} // end for - 새배열 항목 복제 완료
				this.array = newArray;
				this.length--;
				break;
			}
			
		}
	}

	// 실제 저장된 항목의 크기 반환
	public int size() {
		return this.length;
	}
	
	public String toString() {
		String result = "[";
		for(int i = 0 ; i < this.length ; i++) {
			if(i != 0) {
				result += ", ";
			}
			result += array[i];
		}
		result += "]";
		return result;
	}

	
	
}


