import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField father_height;
	private JTextField mother_height;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton prediction = new JButton("Prediction");
		prediction.setBackground(Color.PINK);
		prediction.setForeground(Color.BLACK);
		prediction.setFont(new Font("210 ��ǻŸ��Ź R", Font.PLAIN, 17));
		prediction.setBounds(5, 221, 422, 27);
		prediction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "MAN / 174.5cm / 65.3kg");
			}
		});
		contentPane.setLayout(null);
		contentPane.add(prediction);
		
		JLabel lblFathersHeight = new JLabel("Father's height");
		lblFathersHeight.setFont(new Font("a���������B", Font.PLAIN, 11));
		lblFathersHeight.setBounds(121, 85, 106, 18);
		contentPane.add(lblFathersHeight);
		
		JLabel label_1 = new JLabel("Mother's height");
		label_1.setFont(new Font("a���������B", Font.PLAIN, 11));
		label_1.setBounds(121, 160, 106, 18);
		contentPane.add(label_1);
		
		father_height = new JTextField();
		father_height.setBounds(241, 82, 65, 24);
		contentPane.add(father_height);
		father_height.setColumns(10);
		
		mother_height = new JTextField();
		mother_height.setColumns(10);
		mother_height.setBounds(241, 157, 65, 24);
		contentPane.add(mother_height);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("red.png"));
		label_4.setBounds(110, 149, 211, 35);
		contentPane.add(label_4);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("blue.png"));
		label_3.setBounds(110, 76, 211, 35);
		contentPane.add(label_3);
		
		JLabel lblPredictYourChilds = new JLabel("Predict Your Child's Height");
		lblPredictYourChilds.setHorizontalAlignment(SwingConstants.CENTER);
		lblPredictYourChilds.setFont(new Font("210 ��ǻŸ��Ź L", Font.PLAIN, 20));
		lblPredictYourChilds.setBounds(38, 9, 338, 35);
		contentPane.add(lblPredictYourChilds);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("yellow.png"));
		label_6.setBounds(-15, 9, 442, 35);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("yellow.png"));
		label_7.setBounds(0, 217, 442, 46);
		contentPane.add(label_7);
		
		JLabel icon_father = new JLabel("");
		icon_father.setIcon(new ImageIcon("father.png"));
		icon_father.setBounds(15, 56, 81, 77);
		contentPane.add(icon_father);
		
		JLabel icon_mother = new JLabel("");
		icon_mother.setIcon(new ImageIcon("mother.png"));
		icon_mother.setBounds(15, 125, 81, 84);
		contentPane.add(icon_mother);
		
		JLabel icon_height = new JLabel("");
		icon_height.setIcon(new ImageIcon("height.png"));
		icon_height.setBounds(335, 125, 81, 84);
		contentPane.add(icon_height);


		
			//Gender radio button
			JRadioButton rdbtnMan = new JRadioButton("MAN");
			rdbtnMan.setBounds(331, 56, 139, 27);
			contentPane.add(rdbtnMan);
			
			
			JLabel icon_background = new JLabel("");
			icon_background.setIcon(new ImageIcon("background.png"));
			contentPane.add(icon_background);
			icon_background.setBounds(335, 113, 92, 96);
			contentPane.add(icon_background);
			
			JRadioButton rdbtnWoman = new JRadioButton("WOMAN");
			rdbtnWoman.setBounds(331, 87, 139, 27);
			contentPane.add(rdbtnWoman);
			
			// button grouping
			ButtonGroup  radio_gender_group = new ButtonGroup(); 
			radio_gender_group.add(rdbtnMan);
			radio_gender_group.add(rdbtnWoman);
		
			JLabel icon_background2 = new JLabel("");
			icon_background2.setIcon(new ImageIcon("background.png"));
			contentPane.add(icon_background2);
			icon_background2.setBounds(9, 55, 326, 154);
			contentPane.add(icon_background2);
			// END - button grouping
		
		
			
	}
}
