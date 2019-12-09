package P1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
public class Select extends JFrame implements  ActionListener{
	JLabel a = new JLabel("请选择课程：");
	JButton r = new JButton("确定");
	JCheckBox jc1 = new JCheckBox("老师名称：张师    老师编号： 1  所授课程：高数   学分：2 地点：教101   时间：08:00-09:00am");
	JCheckBox jc2 = new JCheckBox("老师名称：李师    老师编号： 2  所授课程：英语   学分：5 地点：教102   时间：09:25-10:25am");
	JCheckBox jc3 = new JCheckBox("老师名称：王师    老师编号： 3  所授课程：物理   学分：4 地点：教103  时间：10:50-11:00am");
	
	Select(){
		setTitle("学生选课");
		setSize(600,250);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		add(a);
		add(jc1);
		add(jc2);
		add(jc3);
		add(r);
		jc1.addActionListener(this);
		jc2.addActionListener(this);
		jc3.addActionListener(this);
		r.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==r) {
				JOptionPane.showMessageDialog(null, "选课成功！");
				new Operation();
				try {
					FileWriter fw1=new FileWriter("C:\\Users\\Thinkpad\\Desktop\\学生选课.txt",true);
					BufferedWriter fw=new BufferedWriter(fw1);
					fw.write("已选课程：");
					fw.newLine();
					fw.write("老师名称：张师    老师编号： 1  所授课程：高数   学分：2 地点：综101   时间：08:00-09:00am");
					fw.newLine();
					fw.write("老师名称：李师    老师编号： 2  所授课程：英语   学分：5 地点：教102   时间：09:25-10:25am");
					fw.newLine();
					fw.write("老师名称：王师   老师编号：  3  所授课程：物理   学分：4  地点：教103  时间：10:50-11:50am");					
					fw.close();
				}
				catch (IOException n) 
				{
				n.printStackTrace();
				}
			}
		}
		
}
