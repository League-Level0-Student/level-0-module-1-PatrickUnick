package _04_secret_message_box;

import javax.swing.JOptionPane;

public class messagebox {
	public static void main(String[] args) {
		String Password = JOptionPane.showInputDialog("Enter password");
		String Message = JOptionPane.showInputDialog("input message");
		Boolean success = false;
		
		for (int i=1;i<= 3;i++) {
			
			if (JOptionPane.showInputDialog("Enter password. " + (4-i) + "attempts remain").equals(Password)) {
				JOptionPane.showMessageDialog(null, "the message is:" + Message);
				success = true;
				break;
			} else {
				JOptionPane.showMessageDialog(null, "password incorect");
			}
		}
		if (success != true) {
			JOptionPane.showMessageDialog(null, "password failed too many times");
		}
	}
}
