package P1;
import java.awt.FlowLayout;

import javax.swing.*;
public class Teachers extends JFrame {
	JLabel j1 = new JLabel("选课学生：");
	JLabel  name = new JLabel("教师名称：张师");
	JLabel  ID = new JLabel("老师编号： 1");
	JLabel  course = new JLabel("所授课程：高数 "+"学分：2"+"地点：综101"+"时间：08:00-11:00am");
	JTextField jtf1 = new JTextField("刘爱华",15);
	Teachers(){
		setSize(400,200);
		setTitle("教师课表展示");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new FlowLayout(5));    
		add(name);
		System.out.print("\n");
		add(ID);  
		add(course);
		add(j1);
		add(jtf1);
		validate();
	}
}
