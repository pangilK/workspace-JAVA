package b_defalut;

public class LGPrinter implements Printable {

	@Override
	public void print() {
		System.out.println("LGPrinter가 출력합니다.");		
	}

	@Override
	public void colorPrint() {
		System.out.println("LG 프린터기가 컬러로 출력합니다.");
	}
	

	
}
