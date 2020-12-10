package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave m= new Microwave();
	String flavor=JOptionPane.showInputDialog("What flavor popcorn do you want?");
	Popcorn popcorn=new Popcorn(flavor);
	String Time= JOptionPane.showInputDialog("How long do you want to cook the popcorn?");
	int t=Integer.parseInt(Time);
	m.putInMicrowave(popcorn);
	m.setTime(t);
	m.startMicrowave();
	popcorn.applyHeat();
	
	
	
}
	

}
