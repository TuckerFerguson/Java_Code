package clockgui;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class clockMain implements ActionListener{
	public static void main(String[] args) {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	LocalDateTime presentTime = LocalDateTime.now();
	String clockOutput = formatter.format(presentTime);
	
//frame instantiations 
	JFrame myFrame = new JFrame("clockGUI");
	
//panel instantiations
	JPanel clock = new JPanel();
	clock.setLayout(new BoxLayout(clock,BoxLayout.PAGE_AXIS));
	JPanel colorOpts = new JPanel();
	colorOpts.setLayout(new GridLayout(1,4,1,1));
	JPanel wrap = new JPanel();
	
//text field instantiations
	JTextField jClock = new JTextField(clockOutput,20);
	
//button instantiations	
	JButton optOne = new JButton(" 1 ");
	JButton optTwo = new JButton(" 2 ");
	JButton optThree = new JButton(" 3 ");
	JButton optFour = new JButton(" 4 ");
	
//layering of each JElement
	colorOpts.add(optOne);
	colorOpts.add(optTwo);
	colorOpts.add(optThree);
	colorOpts.add(optFour);
	clock.add(jClock);
	wrap.add(clock,BorderLayout.NORTH);
	wrap.add(Box.createRigidArea(new Dimension(100,100)));
	wrap.add(colorOpts,BorderLayout.SOUTH);
	myFrame.add(wrap);

//event listeners
	optOne.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent evt) {
			jClock.setForeground(new Color(249,139,53));
		}
	});
	
	optTwo.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent evt) {
			jClock.setForeground(new Color(45,240,16));
		}
	});
	
	optThree.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent evt) {
			jClock.setForeground(new Color(17,168,249));
		}
	});
	
	optFour.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent evt) {
			jClock.setForeground(new Color(246,46,27));
		}
	});
	
//styling
	//textfields
	jClock.setHorizontalAlignment(JTextField.CENTER);
	jClock.setFont(new java.awt.Font("Arial", Font.BOLD, 46));
	jClock.setForeground(Color.CYAN);
	jClock.setBackground(Color.BLACK);
	
	
	//buttons
	optOne.setForeground(new Color(249,139,53));
	optOne.setFont(new java.awt.Font("Arial",Font.BOLD, 24));
	optOne.setBackground(new Color(72,61,139));
	
	optTwo.setForeground(new Color(45,240,16));
	optTwo.setFont(new java.awt.Font("Arial",Font.BOLD, 24));
	optTwo.setBackground(new Color(72,61,139));
	
	optThree.setForeground(new Color(17,168,249));
	optThree.setFont(new java.awt.Font("Arial",Font.BOLD, 24));
	optThree.setBackground(new Color(72,61,139));
	
	optFour.setForeground(new Color(246,46,27));
	optFour.setFont(new java.awt.Font("Arial",Font.BOLD, 24));
	optFour.setBackground(new Color(72,61,139));
	
	//panels
	colorOpts.setBackground(new Color(72,61,139));
	wrap.setBackground(new Color(119,136,153));
	
	//frames
	myFrame.setSize(300,300);
	
	myFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
