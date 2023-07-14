package b_defalut;

public class Window {
	
	public void print(Printable printer) {
		printer.print();
		printer.colorPrint();
	}
	
	public static void main(String[] args) {
		Window window = new Window();
		Printable LG = new LGPrinter();
		window.print(LG);
		Printable HP = new HPPrinter();
		window.print(HP);
		
	}
}
