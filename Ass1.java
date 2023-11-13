import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ass1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ass1 window = new Ass1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ass1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 823, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(287, 11, 243, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEmployee = new JLabel("Employee Name:");
		lblEmployee.setBounds(10, 69, 136, 14);
		frame.getContentPane().add(lblEmployee);
		
		JLabel lblRate = new JLabel("Rate Per Hour:");
		lblRate.setBounds(10, 102, 136, 14);
		frame.getContentPane().add(lblRate);
		
		JLabel lblHour = new JLabel("Hour Per Day:");
		lblHour.setBounds(10, 136, 136, 14);
		frame.getContentPane().add(lblHour);
		
		JLabel lblNumber = new JLabel("Number of days worked:");
		lblNumber.setBounds(10, 173, 136, 14);
		frame.getContentPane().add(lblNumber);
		
		JLabel lblNewLabel_5 = new JLabel("GROSS SALARY :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(10, 234, 136, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setForeground(new Color(178, 34, 34));
		lblNewLabel_6.setBounds(340, 65, 142, 18);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("TAX 15% of Monthly Wage");
		lblNewLabel_7.setBounds(307, 102, 162, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Philhealth 5%");
		lblNewLabel_8.setBounds(307, 136, 162, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("SSS 2%");
		lblNewLabel_9.setBounds(307, 173, 162, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("TOTAL DEDUCTION :");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(307, 234, 162, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Gross Salary:");
		lblNewLabel_11.setBounds(589, 74, 112, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Deduction:");
		lblNewLabel_12.setBounds(589, 102, 112, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("NET SALARY :");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_13.setBounds(589, 234, 112, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		textField = new JTextField();
		textField.setBounds(156, 65, 131, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(156, 99, 131, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(156, 133, 131, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(156, 170, 131, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(156, 231, 131, 20);
		frame.getContentPane().add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(479, 99, 86, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(479, 133, 86, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(479, 170, 86, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(479, 231, 86, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(711, 69, 86, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(711, 102, 86, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(711, 234, 86, 20);
		frame.getContentPane().add(textField_12);
		
		JButton btnNewButton = new JButton("COMPUTE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,num3,tax,health,sss,deductions,totdeductions,net,sal;
				try {
					num1=Integer.parseInt(textField_1.getText());
					num2=Integer.parseInt(textField_2.getText());
					num3=Integer.parseInt(textField_3.getText());
					
					sal=num1*num2*num3;
					textField_4.setText(Integer.toString(sal));
					tax=(int)(0.15*sal);
					sss=(int)(0.02*sal);
					health=(int)(0.05*sal);
					deductions=tax+sss+health;
					totdeductions=deductions;
					net=sal-deductions;
					
					textField_6.setText(String.valueOf(tax));
					textField_7.setText(String.valueOf(health));
					textField_8.setText(String.valueOf(sss));
					textField_11.setText(String.valueOf(deductions));
					textField_9.setText(String.valueOf(totdeductions));
					textField_12.setText(String.valueOf(net));
					textField_10.setText(String.valueOf(sal));

					
			}catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Enter valid text");
			}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(20, 86, 58));
		btnNewButton.setBounds(380, 280, 102, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
