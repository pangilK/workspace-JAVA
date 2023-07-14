package generic04_extends;

public interface Storage<E> {
	// 저장소에 아이템 추가
	void add(E item, int index);
	// 저장소에 값 읽기
	E get(int index);
}
