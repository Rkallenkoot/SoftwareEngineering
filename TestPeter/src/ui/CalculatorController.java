package ui;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;
import multiformat.*;
/*
 * Deze klasse maakt en regelt de control van het paneel
 */
public class CalculatorController extends JPanel implements ActionListener{
	Calculator calc;
	private JButton n1 = new JButton("1");
	private JButton n2 = new JButton("2");
	private JButton n3 = new JButton("3");
	private JButton n4 = new JButton("4");
	private JButton n5 = new JButton("5");
	private JButton n6 = new JButton("6");
	private JButton n7 = new JButton("7");
	private JButton n8 = new JButton("8");
	private JButton n9 = new JButton("9");
	private JButton n0 = new JButton("0");
	private JButton comma = new JButton(",");
	private JButton submit = new JButton("Submit");

	public CalculatorController(Calculator c){
		calc = c;
		this.add(n1);
		n1.addActionListener(this);
		this.add(n2);
		n2.addActionListener(this);
		this.add(n3);
		n3.addActionListener(this);
		this.add(n4);
		n4.addActionListener(this);
		this.add(n5);
		n5.addActionListener(this);
		this.add(n6);
		n6.addActionListener(this);
		this.add(n7);
		n7.addActionListener(this);
		this.add(n8);
		n8.addActionListener(this);
		this.add(n9);
		n9.addActionListener(this);
		this.add(n0);
		n0.addActionListener(this);
		this.add(comma);
		comma.addActionListener(this);
		this.add(submit);
		submit.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == n1){
			calc.setInputOperand("1");
		}
		if(e.getSource() == n2){
			calc.setInputOperand("2");
		}
		if(e.getSource() == n3){
			calc.setInputOperand("3");
		}
		if(e.getSource() == n4){
			calc.setInputOperand("4");
		}
		if(e.getSource() == n5){
			calc.setInputOperand("5");
		}
		if(e.getSource() == n6){
			calc.setInputOperand("6");
		}
		if(e.getSource() == n7){
			calc.setInputOperand("7");
		}
		if(e.getSource() == n8){
			calc.setInputOperand("8");
		}
		if(e.getSource() == n9){
			calc.setInputOperand("9");
		}
		if(e.getSource() == n0){
			calc.setInputOperand("0");
		}
		if(e.getSource() == comma){
			calc.setInputOperand(".");
		}
		if(e.getSource() == submit){
			try{
			calc.addOperand(calc.getInputOperand());
			calc.emptyInputOperand();
			
			}
			catch(Exception Ex){
				System.out.println("Add operand failed");
			}
		}
	}
}
