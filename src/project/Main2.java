package project;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import datart.CreateTable;
import datart.PasswordChecker;

public class Main2 {

	private JFrame frmMain;
	private JTextField txtEx;
	private JPasswordField passwordField;
	private JTextField textField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        Main2 window = new Main2();
                        window.frmMain.setVisible(true);
                    } catch (Exception e) {
                    }
                });
	}

	/**
	 * Create the application.
	 */
	public Main2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMain = new JFrame();
		frmMain.setTitle("MAIN");
		frmMain.getContentPane().setForeground(Color.GREEN);
		frmMain.setBounds(100, 100, 779, 500);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setForeground(SystemColor.inactiveCaption);
		panel_1.setBounds(0, 0, 1600, 800);
		frmMain.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 5, 762, 52);
		panel_1.add(panel);
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(Color.GRAY);
		panel.setLayout(null);
		
		JLabel lblVasaviCollegeOf = new JLabel("VASAVI COLLEGE OF ENGINEERING");
		lblVasaviCollegeOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblVasaviCollegeOf.setBounds(239, 11, 321, 27);
		lblVasaviCollegeOf.setForeground(new Color(255, 255, 255));
		lblVasaviCollegeOf.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblVasaviCollegeOf.setBackground(Color.CYAN);
		panel.add(lblVasaviCollegeOf);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(224, 255, 255));
		panel_2.setBounds(10, 53, 303, 333);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtEx = new JTextField();
		txtEx.setBounds(145, 55, 96, 20);
		panel_2.add(txtEx);
		txtEx.setColumns(10);
		
		JLabel lblStudentLogin = new JLabel("STUDENT LOGIN");
		lblStudentLogin.setBounds(64, 22, 146, 22);
		panel_2.add(lblStudentLogin);
		lblStudentLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudentLogin.setBackground(new Color(255, 255, 255));
		
		JLabel lblRollNo = new JLabel("ROLL NO:");
		lblRollNo.setBounds(23, 58, 75, 17);
		panel_2.add(lblRollNo);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(145, 104, 96, 20);
		panel_2.add(passwordField);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(23, 107, 96, 17);
		panel_2.add(lblPassword);
		
		JLabel label = new JLabel("");
		label.setBounds(77, 218, 107, 29);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Scanner sc = new Scanner(System.in);
	  	   		  Schedule s=new Schedule();
	                
	                HashMap<String,Boolean> day = null;
	                Date dt =new Date();
	                SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
	                switch(sdf.format(dt))
	                {
	                case "Monday":
	              	  	day=s.createMSchedule();
	              	  	break;
	                case "Tuesday":
	            	  	day=s.createTUSchedule();
	            	  	break;
	                case "Wednesday":
	            	  	day=s.createWSchedule();
	            	  	break;
	                case "Thursday":
	            	  	day=s.createTHSchedule();
	            	  	break;
	                case "Friday":
	            	  	day=s.createFSchedule();
	            	  	break;
	                case "Saturday":
	            	  	day=s.createSSchedule();
	            	  	break;
	                }
	                String str[]=new String[2];
	        		  SimpleDateFormat f= new SimpleDateFormat("yyyyMMdd");
	        		  String date = f.format(dt);
	        		  Iterator<String> itr=day.keySet().iterator();
	        		  int j=0;
	        		  while(itr.hasNext())
	        		  {
	        			  str[j]=itr.next();
	        			  j++;
	        		  }
	        		  try {
						CreateTable t=new CreateTable(date,str[0],str[1]);
					} catch (Exception e1) {
					}
	        		 String rno=txtEx.getText();
	        		 String pass=passwordField.getText();
	        		 PasswordChecker pc =new PasswordChecker(rno,pass);
				try {
	           	  if(pc.check()==true)
	           	  {
	           		  //
	           		  
	           		  label.setText("CORRECT");
	           		frmMain.dispose();
	           		Student1 std=new Student1(date,pc.name,rno,str[0],str[1]);
	           		std.setVisible(true);
	           	  }
	           	  else
	           	  {
	           		  label.setText("wrong password");
	           	  }
	           	  	  }
	           	  catch(SQLException ex)
	           	  {
	           		  
	           		  label.setText("user rollno is wronge");
	           	  } catch (Exception e1) {
					
					e1.printStackTrace();
				}
				}
				
				
			
		});
		
		
		panel_2.add(label);
		btnNewButton.setBounds(84, 149, 89, 23);
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(224, 255, 255));
		panel_3.setBounds(447, 63, 267, 323);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblFacultyLogin = new JLabel("FACULTY LOGIN");
		lblFacultyLogin.setBounds(68, 18, 160, 22);
		panel_3.add(lblFacultyLogin);
		lblFacultyLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblRollNo_1 = new JLabel("ROLL NO:");
		lblRollNo_1.setBounds(34, 51, 61, 17);
		panel_3.add(lblRollNo_1);
		
		textField = new JTextField();
		textField.setBounds(132, 49, 96, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword_1 = new JLabel("PASSWORD:");
		lblPassword_1.setBounds(34, 81, 91, 17);
		panel_3.add(lblPassword_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setEchoChar('*');
		passwordField_1.setBounds(135, 79, 93, 17);
		panel_3.add(passwordField_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(77, 216, 107, 29);
		panel_3.add(label_1);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner sc = new Scanner(System.in);
	  	   		  Schedule s=new Schedule();
	                
	                HashMap<String,Boolean> day = null;
	                Date dt =new Date();
	                SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
	                switch(sdf.format(dt))
	                {
	                case "Monday":
	              	  	day=s.createMSchedule();
	              	  	break;
	                case "Tuesday":
	            	  	day=s.createTUSchedule();
	            	  	break;
	                case "Wednesday":
	            	  	day=s.createWSchedule();
	            	  	break;
	                case "Thursday":
	            	  	day=s.createTHSchedule();
	            	  	break;
	                case "Friday":
	            	  	day=s.createFSchedule();
	            	  	break;
	                case "Saturday":
	            	  	day=s.createSSchedule();
	            	  	break;
	                }
	                String str[]=new String[2];
	        		  SimpleDateFormat f= new SimpleDateFormat("yyyyMMdd");
	        		  String date = f.format(dt);
	        		  Iterator<String> itr=day.keySet().iterator();
	        		  int j=0;
	        		  while(itr.hasNext())
	        		  {
	        			  str[j]=itr.next();
	        			  j++;
	        		  }
	        		  try {
						CreateTable t=new CreateTable(date,str[0],str[1]);
					} catch (Exception e1) {
					}
	        		 String rno=textField.getText();
	        		 String pass=passwordField_1.getText();
	        		 PasswordChecker pc =new PasswordChecker(rno,pass);
	           	  try {
	           	  if(pc.check()==true)
	           	  {
	           		frmMain.dispose();
	           		  Faculty fac=new Faculty(pc.name,rno,date);
	           		 fac.setVisible(true);
	           	  }
	           	  else
	           	  {
	           		label_1.setText("Password is wronge");
	           	  }
	           	  	  }
	           	  catch(SQLException ex)
	           	  {
	           		label_1.setText("user rollno is wronge");
	           	  } catch (Exception e1) {
					
					e1.printStackTrace();
				}
				}
	           	  
			
		});
		btnNewButton_1.setBounds(90, 138, 89, 23);
		panel_3.add(btnNewButton_1);
	}
}
