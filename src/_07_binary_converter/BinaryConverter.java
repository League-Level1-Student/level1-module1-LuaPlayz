package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JTextField text= new JTextField(20);
	JLabel label= new JLabel();
	JButton button= new JButton();
void setup() {
JFrame frame= new JFrame();
JPanel panel= new JPanel();
frame.setVisible(true);
button.addActionListener(this);
button.setText("convert");
panel.add(button);
panel.add(label);
panel.add(text);
frame.add(panel);
frame.setSize(300,300);


}

public static void main(String[] args) {
	BinaryConverter binary= new BinaryConverter();
	binary.setup();
	
	
}

String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}

              


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String answer=convert(text.getText());
	label.setText(answer);
}
}
