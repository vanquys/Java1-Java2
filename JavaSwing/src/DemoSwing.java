import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class DemoSwing extends JFrame {

	private JPanel contentPane;
	private JButton num1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoSwing frame = new DemoSwing();
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
	public DemoSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton cong = new JButton("+");
		cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cong.setBounds(223, 42, 62, 23);
		contentPane.add(cong);
		
		JTextPane inpuCacular = new JTextPane();
		inpuCacular.setBounds(10, 11, 275, 20);
		contentPane.add(inpuCacular);
		
		num1 = new JButton("1");
		num1.setBounds(10, 42, 62, 23);
		contentPane.add(num1);
		
		JButton num2 = new JButton("2");
		num2.setBounds(85, 42, 62, 23);
		contentPane.add(num2);
		
		JButton num3 = new JButton("3");
		num3.setBounds(157, 42, 62, 23);
		contentPane.add(num3);
		
		JButton num4 = new JButton("4");
		num4.setBounds(10, 76, 62, 23);
		contentPane.add(num4);
		
		JButton num5 = new JButton("5");
		num5.setBounds(85, 76, 62, 23);
		contentPane.add(num5);
		
		JButton num6 = new JButton("6");
		num6.setBounds(157, 76, 62, 23);
		contentPane.add(num6);
		
		JButton num7 = new JButton("7");
		num7.setBounds(10, 110, 62, 23);
		contentPane.add(num7);
		
		JButton num8 = new JButton("8");
		num8.setBounds(85, 110, 62, 23);
		contentPane.add(num8);
		
		JButton num9 = new JButton("9");
		num9.setBounds(10, 144, 62, 23);
		contentPane.add(num9);
		
		JButton num0 = new JButton("0");
		num0.setBounds(85, 144, 62, 23);
		contentPane.add(num0);
		
		JButton nhan = new JButton("*");
		nhan.setBounds(157, 110, 62, 23);
		contentPane.add(nhan);
		
		JButton tru = new JButton("-");
		tru.setBounds(223, 76, 62, 23);
		contentPane.add(tru);
		
		JButton chia = new JButton("/");
		chia.setBounds(223, 110, 62, 23);
		contentPane.add(chia);
		
		JButton bang = new JButton("=");
		bang.setBounds(157, 144, 128, 23);
		contentPane.add(bang);
	}
}
