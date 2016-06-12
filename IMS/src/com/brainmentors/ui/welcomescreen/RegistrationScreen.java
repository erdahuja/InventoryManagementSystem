package com.brainmentors.ui.welcomescreen;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class RegistrationScreen extends JFrame {

	private static final long serialVersionUID = 5328405179740350110L;
private JTextField nameField,addressField,contactField;
private JTable table;
private JTable table_1;
	@SuppressWarnings("unchecked")
	RegistrationScreen() {
		

		addWindowListener(new WindowAdapter() {
 			@Override
 		public void windowClosing(WindowEvent e) {
 				int choice = JOptionPane.showConfirmDialog(RegistrationScreen.this,"Do u really wanna to close this window","IMS-Business Registration Screen",JOptionPane.YES_NO_OPTION);
 				if(choice==JOptionPane.YES_OPTION){
 					RegistrationScreen.this.setVisible(false);
 				}
 				else
 				{
 					
 				}
 			}
 		});		
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JPanel	contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("window"));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel nametxt = new JLabel("Business Name");
		nametxt.setVerticalTextPosition(SwingConstants.TOP);
		nametxt.setVerticalAlignment(SwingConstants.TOP);
		nametxt.setAlignmentY(Component.TOP_ALIGNMENT);
		nametxt.setBounds(47, 182, 137, 21);
		contentPane.add(nametxt);
		
		JLabel address = new JLabel("Business Address");
		address.setVerticalTextPosition(SwingConstants.TOP);
		address.setVerticalAlignment(SwingConstants.TOP);
		address.setAlignmentY(Component.TOP_ALIGNMENT);
		address.setBounds(47, 215, 161, 15);
		contentPane.add(address);
		
		JLabel contact = new JLabel("Contact Number");
		contact.setVerticalTextPosition(SwingConstants.TOP);
		contact.setVerticalAlignment(SwingConstants.TOP);
		contact.setAlignmentY(Component.TOP_ALIGNMENT);
		contact.setBounds(47, 380, 176, 21);
		contentPane.add(contact);
		
		nameField = new JTextField();
		nameField.setAlignmentY(Component.TOP_ALIGNMENT);
		nameField.setAlignmentX(Component.LEFT_ALIGNMENT);
		nameField.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		nameField.setBounds(226, 182, 150, 21);
		contentPane.add(nameField);
		nameField.setColumns(5);
		
		addressField = new JTextField();
		addressField.setAlignmentY(Component.TOP_ALIGNMENT);
		addressField.setAlignmentX(Component.LEFT_ALIGNMENT);
		addressField.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		addressField.setColumns(5);
		addressField.setBounds(226, 212, 150, 21);
		contentPane.add(addressField);
		
		contactField = new JTextField();
		contactField.setAlignmentY(Component.TOP_ALIGNMENT);
		contactField.setAlignmentX(Component.LEFT_ALIGNMENT);
		contactField.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		contactField.setColumns(5);
		contactField.setBounds(226, 378, 150, 21);
		contentPane.add(contactField);
		
		
		JLabel lblAdd = new JLabel("Register your Business");
		lblAdd.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdd.setFont(new Font("Dialog", Font.BOLD, 20));
		lblAdd.setBackground(UIManager.getColor("textHighlightText"));
		lblAdd.setBounds(104, 12, 612, 200);
		contentPane.add(lblAdd);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setIcon(new ImageIcon("/home/deepak/Workspace/IMS/src/SaveIcon.png"));
		 		
		 		btnNewButton.setBounds(47, 450, 127, 60);
		 		getContentPane().add(btnNewButton);		 
		 		 
		 		JButton btnClear = new JButton("Clear");
		 		btnClear.setIcon(new ImageIcon("/home/deepak/Workspace/IMS/src/reset.png"));
		 		
		 		btnClear.setBounds(180, 450, 132, 60);
		 		getContentPane().add(btnClear);
		 		
		 		
		 		String[] cities={"Choose a city","Mumbai","Delhi","Kolkata","Bengaluru","Pune"};
		 		JComboBox comboBox = new JComboBox(cities);
		 		comboBox.setBounds(226, 240, 150, 24);
		 		contentPane.add(comboBox);
		 		
		 		JLabel lblCity = new JLabel("City");
		 		lblCity.setBounds(47, 248, 70, 15);
		 		contentPane.add(lblCity);
		 		
		 		
		 		String [] columnNames={"S No.","Business Name","Business Address","Contact Number"};
		 		Object[] data=new Object[4];

		 		DefaultTableModel model=new DefaultTableModel();
		 		table_1 = new JTable(model);
		 		 table_1.setBackground(Color.LIGHT_GRAY);
		         table_1.setForeground(Color.black);
		        
		         table_1.setRowHeight(30);
		 		table_1.setBackground(SystemColor.activeCaptionBorder);
		 		model.setColumnIdentifiers(columnNames);
		 		
		 
		 		 btnNewButton.addActionListener(new ActionListener() {
		 			///int k=0;
@Override
		             public void actionPerformed(ActionEvent e) {
	
	
		            	if(nameField.getText().equals("")||addressField.getText().equals( "")||contactField.getText().equals( "")||comboBox.getSelectedItem().equals("Choose a city")){
		            		//System.out.println("flag"); 
		            		JOptionPane.showMessageDialog(null, "Empty Field", "Error", JOptionPane.ERROR_MESSAGE);
		            		
		            	}
		            	else{

			            	data[0]=table_1.getRowCount()+1;
			            	data[1]=nameField.getText();
			            	//System.out.println(data[1]);
			            	
			            	data[2]=addressField.getText()+" ,City :"+(String)comboBox.getSelectedItem();
			            	
			            	data[3]=contactField.getText();
			            	model.addRow(data);
			            	
			            	
			            	
		            	}
		               
		             }
		           });
		 		 
		 		 btnClear.addActionListener(new ActionListener() {
		 		
		 			@Override
		 					             public void actionPerformed(ActionEvent e) {
		 					            	


removeRows: {
    int[] lines = table_1.getSelectedRows();
    if(lines.length==0)
        break removeRows;
    for(int i=0; i<lines.length; i++) {
        lines[i]=table_1.convertRowIndexToModel(lines[i]);
    }
    Arrays.sort(lines);
    for(int i=lines.length-1; i>=0; i--) {
        model.removeRow(lines[i]);    
    }
}            
		 					             }
		 					           });
		 		
		 		
		 		table_1.setBounds(436, 167, 14, 139);
		 		table_1.setPreferredScrollableViewportSize(new Dimension(400,100));
		 
		 		JScrollPane scrollPane=new JScrollPane(table_1);
		 		scrollPane.setBounds(517, 168, 732, 493);
		 		contentPane.add(scrollPane);
		 		scrollPane.setVisible(true);
		 		//contentPane.add(table_1);
		 	
		 		
		
	}
}
