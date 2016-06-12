package com.brainmentors.ui.welcomescreen;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

import IMSLogic.ReadWriteObject;
import IMSLogic.ReadWriteUser;

public class LoginScreen extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
				/*	LoginScreen frame = new LoginScreen();
					frame.setVisible(true);*/
					}


	public LoginScreen(MainScreen mainscreen) {
		ReadWriteUser user=new ReadWriteUser();	
		addWindowListener(new WindowAdapter() {
 			@Override
 		public void windowClosing(WindowEvent e) {
 				LoginScreen.this.setVisible(false);
 				LoginScreen.this.dispose();
 			
 			}
 		});		setBounds(500, 250, 627, 336);
		JPanel	contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("window"));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel useridtxt = new JLabel("User Id");
		useridtxt.setBounds(129, 63, 56, 21);
		contentPane.add(useridtxt);
		
		JLabel password = new JLabel("Password");
		password.setBounds(115, 102, 70, 15);
		contentPane.add(password);
		
		textField = new JTextField();
		textField.setBounds(203, 63, 139, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 99, 143, 21);
		contentPane.add(passwordField);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		lblLogin.setBackground(UIManager.getColor("textHighlightText"));
		lblLogin.setBounds(182, 12, 70, 39);
		contentPane.add(lblLogin);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ReadWriteUser currentUser=new ReadWriteUser();
				currentUser.setName(textField.getText());
				currentUser.setPwd(passwordField.getText());
				
				
				try {
					if(ReadWriteObject.readObject(currentUser))
					{
						JOptionPane.showMessageDialog(null,"Welcome "+ currentUser.getName());
						
						JMenu operations = new JMenu("Operations");
						operations.setMnemonic('O');
						mainscreen.menuBar.add(operations);
						mainscreen.menuBar.revalidate();
						mainscreen.mntmLogin.setEnabled(false);
						mainscreen.setTitle("Welcome "+currentUser.getName());
						
						LoginScreen.this.setVisible(false);
						LoginScreen.this.dispose();
					
						
						
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect Login Credentials!!");
					}
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}

		
		});
		btnNewButton.setIcon(new ImageIcon("/home/deepak/Workspace/IMS/src/loginlogo.png"));
		 		
		 		btnNewButton.setBounds(48, 166, 127, 60);
		 		getContentPane().add(btnNewButton);
		 		
		 		JButton btnRegister= new JButton("Register");
		 		btnRegister.setFont(new Font("Dialog", Font.BOLD, 9));
		 		
		 		btnRegister.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						ReadWriteUser user = new ReadWriteUser();
						
					user.setName(textField.getText());
					user.setPwd(passwordField.getText());
					
					try {
						if(ReadWriteObject.createObject(user))
						System.out.println(user.getName());
						JOptionPane.showMessageDialog(null,"Welcome "+user.getName());
						
						JMenu operations = new JMenu("Operations");
						operations.setMnemonic('O');
						mainscreen.menuBar.add(operations);
						mainscreen.menuBar.revalidate();
						mainscreen.mntmLogin.setEnabled(false);
						mainscreen.setTitle("Welcome "+user.getName());
						
						LoginScreen.this.setVisible(false);
						LoginScreen.this.dispose();
						
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null,"Error while Registering..");
					}
					
						
					}
				
				});
		 		
		 		btnRegister.setIcon(new ImageIcon("/home/deepak/Workspace/IMS/src/registeruserlogo.png"));		
				btnRegister.setBounds(334, 166, 137, 60);
				 		getContentPane().add(btnRegister);
				 		
				 		JButton btnClear = new JButton("Clear");
				 		btnClear.setIcon(new ImageIcon("/home/deepak/Workspace/IMS/src/reset.png"));
				 		btnClear.setBounds(191, 166, 132, 60);
				 		btnClear.addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent e) {
								textField.setText("");
								passwordField.setText("");					
								
							}
				 			
				 		});
				 		
				 		
				 		getContentPane().add(btnClear);
		 		
		 			
				 		
		 		
	}

	
	

	
}
