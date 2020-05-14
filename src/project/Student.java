package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class Student extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Student(String name,String rollNo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 752, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentPortal = new JLabel("STUDENT PORTAL ");
		lblStudentPortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentPortal.setForeground(new Color(255, 255, 255));
		lblStudentPortal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblStudentPortal.setBounds(88, 36, 532, 27);
		panel.add(lblStudentPortal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(0, 90, 752, 333);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 721, 121);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(10, 11, 250, 33);
		panel_2.add(lblName);
		
		JLabel lblRollNo = new JLabel("ROLL NO");
		lblRollNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRollNo.setBounds(10, 45, 250, 33);
		panel_2.add(lblRollNo);
		
		JLabel lblClass = new JLabel("CLASS");
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClass.setBounds(396, 11, 149, 33);
		panel_2.add(lblClass);
		
		JLabel lblStartDate = new JLabel("START DATE");
		lblStartDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStartDate.setBounds(10, 84, 149, 37);
		panel_2.add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("END DATE");
		lblEndDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEndDate.setBounds(396, 84, 138, 26);
		panel_2.add(lblEndDate);
		
		JLabel label = new JLabel("1-11-19");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(143, 89, 169, 21);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("10-11-19");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(532, 84, 138, 26);
		panel_2.add(label_1);
		
		JLabel lblCseB = new JLabel("CSE B");
		lblCseB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCseB.setBounds(532, 11, 100, 33);
		panel_2.add(lblCseB);
		
		JLabel label_2 = new JLabel(rollNo);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(143, 45, 169, 33);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel(name);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(155, 11, 161, 33);
		panel_2.add(label_3);
	}

	public Student() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 752, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentPortal = new JLabel("STUDENT PORTAL ");
		lblStudentPortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentPortal.setForeground(new Color(255, 255, 255));
		lblStudentPortal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblStudentPortal.setBounds(88, 36, 532, 27);
		panel.add(lblStudentPortal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(0, 90, 752, 333);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 721, 121);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(10, 11, 250, 33);
		panel_2.add(lblName);
		
		JLabel lblRollNo = new JLabel("ROLL NO");
		lblRollNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRollNo.setBounds(10, 45, 250, 33);
		panel_2.add(lblRollNo);
		
		JLabel lblClass = new JLabel("CLASS");
		lblClass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblClass.setBounds(396, 11, 149, 33);
		panel_2.add(lblClass);
		
		JLabel lblStartDate = new JLabel("START DATE");
		lblStartDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStartDate.setBounds(10, 84, 149, 37);
		panel_2.add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("END DATE");
		lblEndDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEndDate.setBounds(396, 84, 138, 26);
		panel_2.add(lblEndDate);
		
		JLabel label = new JLabel("1-11-19");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(143, 89, 169, 21);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("10-11-19");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(532, 84, 138, 26);
		panel_2.add(label_1);
		
		JLabel lblCseB = new JLabel("CSE B");
		lblCseB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCseB.setBounds(532, 11, 100, 33);
		panel_2.add(lblCseB);
		
		JLabel label_2 = new JLabel("rollNo");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(143, 45, 169, 33);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("name");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(155, 11, 161, 33);
		panel_2.add(label_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 143, 721, 179);
		panel_1.add(panel_3);
		
		JTable jTable1=new JTable();
		
        jTable1.setModel(new javax.swing.table.DefaultTableModel( new Object [][] { {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                },
                new String [] {
                    "DATE (day)", "PERIOD 1", "PERIOD 2"
                }
	) {
              
                //public Class getColumnClass(int columnIndex) {
                //    return [columnIndex];
                //}
        } );
     panel_3.add(jTable1);   
	}
}
