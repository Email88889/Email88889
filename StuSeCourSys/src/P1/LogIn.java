package P1;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class LogIn extends JFrame implements ActionListener{
	JButton teacher = new JButton("教师");
	JButton student = new JButton("学生");
	LogIn(){
		setSize(240,100);
		setTitle("选择你要登录的身份");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new FlowLayout());    //设置窗体为流式布局
		add(teacher);//教师和学生信息连接到窗口按钮
		add(student);//将按钮加入窗体中
		
		validate();
		teacher.addActionListener(this);
		student.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==teacher) 
			new Teachers();
		if(e.getSource()==student)
			new Students();
	}
public static void main(String[] args) {
	LogIn LogIn = new LogIn();
}
}
