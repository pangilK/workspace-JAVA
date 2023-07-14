package GUI;
import java.awt.Color;
import java.awt.Frame;

public class frame {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("프레임입니다");
		f.setBounds(100,100,300,300);
		f.setVisible(true);
		f.setBackground(Color.black);
	}
	
}
