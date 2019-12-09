package P1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Students extends JFrame implements ActionListener{//学生端选课登陆系统
	JButton login1 = new JButton("登录");
	JButton login2 = new JButton("注册");
	JLabel id = new JLabel("学号：");
	JLabel password = new JLabel("密码：");
	JTextField jtf1 = new JTextField(16); 
	JTextField jtf2 = new JTextField(16); 
	
	Students(){
		setTitle("学生");
		setSize(250,250);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		add(id);add(jtf1);
		add(password);add(jtf2);
		add(login1);add(login2);
		validate();
		login1.addActionListener(this);;
		login2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String s1 = jtf1.getText();
		String s2 = jtf2.getText();
		//若学号或密码错误，则不予通过
		if(e.getSource() ==login1&&s1.equals("1")&&s2.equals("12345")) {
			new Operation();//显示选课界面
		} 
		else if(e.getSource()==login2) {
			new Regist();
			}
		else {
			JOptionPane.showMessageDialog(null, "学号或密码错误，请核对后重新输入");
		}
	}
}
