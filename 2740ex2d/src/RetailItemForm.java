import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;

import rhoganEx2C.Person;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DecimalFormat;


public class RetailItemForm extends JFrame {


	private JPanel contentPane;
	private JTextField descriptionTxt;
	private JTextField onHandTxt;
	private JTextField textField_2;
	private JButton btnEnter;
	private JList retailItemList;
	private JLabel Totallbl;
	private RetailItem retailItem1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetailItemForm frame = new RetailItemForm();
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
	public RetailItemForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Description");
		lblNewLabel.setBounds(30, 20, 79, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Units On Hand");
		lblNewLabel_1.setBounds(30, 50, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setBounds(30, 80, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		descriptionTxt = new JTextField();
		descriptionTxt.setBounds(110, 16, 86, 20);
		contentPane.add(descriptionTxt);
		descriptionTxt.setColumns(10);
		
		onHandTxt = new JTextField();
		onHandTxt.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				do_onHandTxt_focusGained(arg0);
			}
		});
		onHandTxt.setText("0");
		onHandTxt.setBounds(110, 46, 86, 20);
		contentPane.add(onHandTxt);
		onHandTxt.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				do_textField_2_focusGained(e);
			}
		});
		textField_2.setText("0.00");
		textField_2.setBounds(110, 76, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		btnEnter = new JButton("Enter Item");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnEnter_actionPerformed(e);
			}
		});
		btnEnter.setBounds(23, 115, 200, 50);
		contentPane.add(btnEnter);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(271, 20, 200, 179);
		contentPane.add(scrollPane);
		
		retailItemList = new JList();
		scrollPane.setViewportView(retailItemList);
		
		JLabel lblNewLabel_3 = new JLabel("Total all items");
		lblNewLabel_3.setBounds(270, 225, 97, 14);
		contentPane.add(lblNewLabel_3);
		
		Totallbl = new JLabel("0.00");
		Totallbl.setBounds(360, 225, 46, 14);
		contentPane.add(Totallbl);
	}
	protected void do_btnEnter_actionPerformed(ActionEvent e) {
		int Units = Integer.parseInt(onHandTxt.getText());
		double Price = Double.parseDouble(textField_2.getText());
		retailItem1 = new RetailItem(descriptionTxt.getText(), Units, Price);
		double total =0.0;
		total += retailItem1.getTotal();
		DecimalFormat fmt = new DecimalFormat("$#,###,.00");
		this.Totallbl.setText(fmt.format(total));
		descriptionTxt.setText("");
		onHandTxt.setText("0");
		textField_2.setText("0.00");
		descriptionTxt.requestFocus();
			//...;
	}
	protected void do_onHandTxt_focusGained(FocusEvent arg0) {
		onHandTxt.selectAll();
	}
	protected void do_textField_2_focusGained(FocusEvent e) {
		textField_2.selectAll();
	}
}
