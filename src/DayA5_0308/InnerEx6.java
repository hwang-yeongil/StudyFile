package DayA5_0308;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx6 {
	Object iv = new Object() {void method(){}};
	static Object lv = new Object() {void method(){}};
	
	void myMethod() {
		Object lv = new Object() {void method(){}};
	}
}
class InnerEx7{
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}
}
class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ActionEvent occurred!");
	}
}
class InnerEx8{
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ActionEvent occurred!");
			}
		});
	}
}