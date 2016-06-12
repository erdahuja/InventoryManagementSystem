package com.brainmentors.ui.welcomescreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class MainScreen extends JFrame {


	private static final long serialVersionUID = 1L;
private MainScreen mainscreen;
JMenuItem mntmLogin = new JMenuItem("Login/Register");
JMenuItem mntmRegister = new JMenuItem("Business");
JMenuBar menuBar = new JMenuBar();


static void startMainScreen(){
	new MainScreen();
}



	public MainScreen() {
		
		this.setVisible(true);
		addWindowListener(new WindowAdapter() {
			 			@Override
			 		public void windowClosing(WindowEvent e) {
			 				int choice = JOptionPane.showConfirmDialog(MainScreen.this,"Do u really wanna to close this window","IMS",JOptionPane.YES_NO_OPTION);
			 				if(choice==JOptionPane.YES_OPTION){
			 					System.exit(0);
			 				}
			 				else
			 				{
			 					return;
			 				}
			 			}
			 		});
		ImageIcon imageIcon = new ImageIcon("/home/deepak/Workspace/IMS/src/logo.png");
			this.setIconImage(imageIcon.getImage());
			 		
			 
			 		this.setTitle("IMS-2016");
			 		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			 		this.setBounds(100, 100, 450, 300);
		
		
		getContentPane().setBackground(UIManager.getColor("window"));
		JLabel background=new JLabel("");
		background.setForeground(UIManager.getColor("window"));
		background.setBounds(28, 27, 1015, 577);
		getContentPane().add(background);
		setBounds(100, 100, 450, 300);
		
		getContentPane().setLayout(null);
		
		
		setJMenuBar(menuBar);
		
		JMenu mnUser = new JMenu("User");
		mnUser.setMnemonic('U');
		menuBar.add(mnUser);
		
	
		mntmLogin.setMnemonic('L');
		mnUser.add(mntmLogin);
		mntmLogin.setAccelerator(KeyStroke.getKeyStroke(
				 	        java.awt.event.KeyEvent.VK_L, 
						        java.awt.Event.CTRL_MASK));
						
		mntmLogin.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				LoginScreen ls= new LoginScreen(MainScreen.this);
				
				ls.setVisible(true);
				
				
			}
			
		});
		
		JSeparator separator_1 = new JSeparator();
		mnUser.add(separator_1);
		
		
		mntmRegister.setMnemonic('R');
		mnUser.add(mntmRegister);
		mntmRegister.setAccelerator(KeyStroke.getKeyStroke(
	 	        java.awt.event.KeyEvent.VK_R, 
			        java.awt.Event.CTRL_MASK));
		mntmRegister.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				RegistrationScreen ls= new RegistrationScreen();// TODO Auto-generated method stub
				ls.setVisible(true);
			}
			
		});
		JSeparator separator = new JSeparator();
		mnUser.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setMnemonic('E');
		mnUser.add(mntmExit);
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(
	 	        java.awt.event.KeyEvent.VK_E, 
			        java.awt.Event.CTRL_MASK));
			
		
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
}
