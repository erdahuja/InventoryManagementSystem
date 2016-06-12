package com.brainmentors.ui.welcomescreen;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;

public class IMSSplashScreen extends JWindow {

	
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		
					IMSSplashScreen frame = new IMSSplashScreen();
					frame.setVisible(true);
					frame.doProgress();
				
	}
	JProgressBar progressBar_1 = new JProgressBar();
	JLabel projectlbl = new JLabel("Inventory Management System");
	JLabel welcomelbl = new JLabel("");
	private boolean isVisible=true;
	private Timer timer;
	private int counter=1;
	private void doProgress(){
		ActionListener al=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				projectlbl.setVisible(isVisible);
				isVisible=!isVisible;
				progressBar_1.setValue(counter);
				counter++;
				if(counter>=100){
					timer.stop();
					IMSSplashScreen.this.setVisible(false);
					IMSSplashScreen.this.dispose();
					
					MainScreen.startMainScreen();
					
				}
				
			}
			
		};
		timer= new Timer(10,al);
		timer.start();
	}
	
	
	public IMSSplashScreen() {
		setBackground(UIManager.getColor("window"));
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBounds(500, 250, 450, 300);
		getContentPane().setLayout(null);
		
		progressBar_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		progressBar_1.setStringPainted(true);
		progressBar_1.setForeground(Color.YELLOW);
		progressBar_1.setBackground(Color.GREEN);
		progressBar_1.setBounds(20, 251, 418, 37);
		getContentPane().add(progressBar_1);
				
		welcomelbl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		welcomelbl.setBounds(123, 28, 228, 221);
		welcomelbl.setIcon(new ImageIcon("/home/deepak/Workspace/IMS/src/download.jpg"));
		getContentPane().add(welcomelbl);
		
		projectlbl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		projectlbl.setHorizontalTextPosition(SwingConstants.CENTER);
		projectlbl.setHorizontalAlignment(SwingConstants.CENTER);
		projectlbl.setBounds(85, 12, 308, 15);
		getContentPane().add(projectlbl);
		}
	}

