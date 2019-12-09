package P1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Operation extends JFrame implements ActionListener{//学生选课端
	JButton Select = new JButton("选课");
	JButton Printing = new JButton("输出信息");
	JLabel wel = new JLabel("欢迎！请进行以下操作");
	
	Operation(){
		setTitle("学生选课显示");
		setSize(250,250);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		add("North",wel);
		add("West",Select);
		add("East",Printing);
		validate();
		Select.addActionListener(this);
		Printing.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Select) {
			new Select();
		}
		if(e.getSource()==Printing) {
			try {
				Runtime.getRuntime().exec("C:\\Users\\Thinkpad\\Desktop\\学生选课.txt");
				} catch (Exception e1) {
					System.out.println("txt打开失败！");
					e1.printStackTrace();
				}
				} 
	   
	}
	}
