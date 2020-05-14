package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datart.AttandancePoster;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Faculty extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
        JRadioButton rdbtnPresent;
        JRadioButton rdbtnAbsent; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty frame = new Faculty("","","");
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
	public Faculty(String name,String rno,String date) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 436);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 696, 102);
		panel.setBackground(Color.GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFaculityPortal = new JLabel("FACULITY PORTAL");
		lblFaculityPortal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblFaculityPortal.setForeground(Color.WHITE);
		lblFaculityPortal.setBackground(Color.WHITE);
		lblFaculityPortal.setBounds(224, 11, 196, 58);
		panel.add(lblFaculityPortal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 104, 696, 294);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setBounds(36, 25, 77, 28);
		panel_1.add(lblName);
		
		JLabel lblNewLabel = new JLabel("FACUlTY NO:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(33, 58, 117, 28);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(name);
		lblNewLabel_1.setBounds(137, 27, 145, 28);
		panel_1.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel(rno);
		lblNewLabel_2.setBounds(160, 58, 136, 28);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(91, 97, 324, 171);
		panel_1.add(panel_2);
		
		JLabel lblStudentRollno = new JLabel("Student rollno:");
		lblStudentRollno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		JLabel label = new JLabel("");
		label.setText("1602-18-733-001");
		ArrayList<String>st=new ArrayList<String>();
		st.add("1602-18-733-001");
		st.add("1602-18-733-002");
		st.add("1602-18-733-003");
		st.add("1602-18-733-004");
		st.add("1602-18-733-005");
		st.add("1602-18-733-006");
		st.add("1602-18-733-007");
		st.add("1602-18-733-008");
		st.add("1602-18-733-009");
		st.add("1602-18-733-010");
		
		JButton btnPost = new JButton("POST");
		btnPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AttandancePoster ap=new AttandancePoster(name,date);
                rdbtnPresent = new JRadioButton("PRESENT");
		rdbtnPresent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		rdbtnAbsent = new JRadioButton("ABSENT");
		rdbtnAbsent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
				if(rdbtnPresent.isSelected()==true)
				{
					try {
						ap.post(st.get(0), true);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else
				{
					try {
						ap.post(st.get(0), false);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			try {
			label.setText(st.get(1));
			st.remove(0);
			}
			catch (Exception e1)
			{}
			if(st.isEmpty())
			{
				dispose();
			}
			}
		});
		btnPost.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JPanel panel_3 = new JPanel();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblStudentRollno, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(110)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(51)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addGap(237))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(114)
					.addComponent(btnPost, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblStudentRollno, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnPost))
		);
		
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rdbtnPresent);
		bg.add(rdbtnAbsent);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(6)
					.addComponent(rdbtnPresent)
					.addGap(15)
					.addComponent(rdbtnAbsent, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(7)
					.addComponent(rdbtnPresent))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(9)
					.addComponent(rdbtnAbsent, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
		);
		panel_3.setLayout(gl_panel_3);
		panel_2.setLayout(gl_panel_2);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
