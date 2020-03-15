package _04_secret_message_box;

import javax.swing.JOptionPane;

public class secretmessage {
	public static void main(String[] args) {
		String password = JOptionPane.showInputDialog("Enter Password");
		String message = JOptionPane.showInputDialog("Enter Message");
		boolean correct = false;
		for (int i=1;i<= 3;i++) {
			String passwordAttempt = JOptionPane.showInputDialog("Enter Password");
			if (passwordAttempt.equals(password)) {
				JOptionPane.showMessageDialog(null, message);
				correct = true;
			}
					if (correct=true) {
							JOptionPane.showMessageDialog(null, "Password correct!");
						} else {
							JOptionPane.showMessageDialog(null, "Password incorrect. " + i + "attempts remain");
						}
					
					
		
				
	}
	}
}