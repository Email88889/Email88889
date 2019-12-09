package P1;

public class Stu{
	String id;	//定义学生的学号
	String name;	//定义学生姓名
	String password;		//定义学生登陆密码
public Stu(String i, String n,String p) {	//给学号、姓名、密码赋值
	    id = i;
	    name = n;
	    password = p;
	    }
public String getid(){
	return id;
	}
public String getname(){
	return name;
	}
public String getpassword(){
	return password;
	}
public String toString() {
		   return "  学号：" + id+ " 姓名：" + name 
				   + " 密码：" + password;
		   }
}
