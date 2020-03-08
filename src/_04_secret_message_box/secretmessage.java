package _04_secret_message_box;

import javax.swing.JOptionPane;

public class secretmessage {
	public static void main(String[] args) {
		String password = JOptionPane.showInputDialog("Enter Password");
		String message = JOptionPane.showInputDialog("Enter Message");
		for (int i=1;i<= 3;i++) {
			String passwordAttempt = JOptionPane.showInputDialog("Enter Password");
					if (passwordAttempt.equals(password)) {
						JOptionPane.showMessageDialog(null, message);
						boolean correct = true
						break;
						
					
					} else {
						JOptionPane.showMessageDialog(null, "you have" + i + "attempts remaining" );
					}
		}
		
				
	}
}
