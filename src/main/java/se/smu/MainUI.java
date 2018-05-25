package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MainUI extends JFrame{
	private Font f = new Font("돋움", Font.BOLD, 20);
	private Font f2 = new Font("돋움", Font.BOLD, 9);
	Container c;
	public MainUI() {
		setTitle("To do list");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);

		
		JPanel wl = new JPanel();
		c.add(wl);
		wl.setSize(1080, 3);
		wl.setLocation(0,60);
		wl.setBackground(new Color(255,255,255));
		
		
		JLabel title = new JLabel("To - Do List");
		c.add(title);
		title.setLocation(430, 12);
		title.setSize(350,40);
		title.setFont(f);
		
		JButton btn1 = new JButton("로그아웃(退出)");
		c.add(btn1);
		btn1.setLocation(930,10);
		btn1.setSize(120,25);
		btn1.setBackground(new Color(255,255,255));
		JButton btn2 = new JButton("수강과목(课程)");
		c.add(btn2);
		btn2.setLocation(20,10);
		btn2.setSize(120,25);
		btn2.setBackground(new Color(255,255,255));
		ImageIcon image = new ImageIcon("images/pic1.png");

		JButton todofavor = new JButton("즐겨찾기(我的最爱)");
		c.add(todofavor);
		todofavor.setLocation(20,80);
		todofavor.setSize(170,40);
		todofavor.setBackground(new Color(255,255,255));		
		JButton SubjectName = new JButton("과목명(课程名称)");
		c.add(SubjectName);
		SubjectName.setLocation(220,80);
		SubjectName.setSize(150,40);
		SubjectName.setBackground(new Color(255,255,255));
		JButton todolistDeadline = new JButton("마감기한(期限)");
		c.add(todolistDeadline);
		todolistDeadline.setLocation(400,80);
		todolistDeadline.setSize(170,40);
		todolistDeadline.setBackground(new Color(255,255,255));
		JButton todolistFinishDate = new JButton("실제마감일(实际截止日期)");
		c.add(todolistFinishDate);
		todolistFinishDate.setLocation(600,80);
		todolistFinishDate.setSize(200,40);
		todolistFinishDate.setBackground(new Color(255,255,255));		
		JButton todolistCompleted = new JButton("완료여부(状态完)");
		c.add(todolistCompleted);
		todolistCompleted.setLocation(830,80);
		todolistCompleted.setSize(190,40);
		todolistCompleted.setBackground(new Color(255,255,255));

		
		
		JButton todoedit1 = new JButton("편집(汇编)");
		c.add(todoedit1);
		todoedit1.setLocation(10,200);
		todoedit1.setSize(95,40);
		todoedit1.setBackground(new Color(255,255,255));		
		JButton tododel1 = new JButton("삭제(删除)");
		c.add(tododel1);
		tododel1.setLocation(130,200);
		tododel1.setSize(95,40);
		tododel1.setBackground(new Color(255,255,255));
		JLabel label1 = new JLabel(image, SwingConstants.CENTER);
		c.add(label1);
		label1.setLocation(240, 196);
		label1.setSize(50,50);
		JTextField text1 = new JTextField();
		c.add(text1);
		text1.setLocation(350, 196);
		text1.setSize(600,50);
		

		JButton todoedit2 = new JButton("편집(汇编)");
		c.add(todoedit2);
		todoedit2.setLocation(10,300);
		todoedit2.setSize(95,40);
		todoedit2.setBackground(new Color(255,255,255));		
		JButton tododel2 = new JButton("삭제(删除)");
		c.add(tododel2);
		tododel2.setLocation(130,300);
		tododel2.setSize(95,40);
		tododel2.setBackground(new Color(255,255,255));
		JLabel label2 = new JLabel(image, SwingConstants.CENTER);
		c.add(label2);
		label2.setLocation(240, 296);
		label2.setSize(50,50);
		JTextField text2 = new JTextField();
		c.add(text2);
		text2.setLocation(350, 296);
		text2.setSize(600,50);
		
		JButton todoedit3 = new JButton("편집(汇编)");
		c.add(todoedit3);
		todoedit3.setLocation(10,400);
		todoedit3.setSize(95,40);
		todoedit3.setBackground(new Color(255,255,255));		
		JButton tododel3 = new JButton("삭제(删除)");
		c.add(tododel3);
		tododel3.setLocation(130,400);
		tododel3.setSize(95,40);
		tododel3.setBackground(new Color(255,255,255));
		JLabel label3 = new JLabel(image, SwingConstants.CENTER);
		c.add(label3);
		label3.setLocation(240, 396);
		label3.setSize(50,50);
		JTextField text3 = new JTextField();
		c.add(text3);
		text3.setLocation(350, 396);
		text3.setSize(600,50);
		
		JButton todoedit4 = new JButton("편집(汇编)");
		c.add(todoedit4);
		todoedit4.setLocation(10,500);
		todoedit4.setSize(95,40);
		todoedit4.setBackground(new Color(255,255,255));		
		JButton tododel4 = new JButton("삭제(删除)");
		c.add(tododel4);
		tododel4.setLocation(130,500);
		tododel4.setSize(95,40);
		tododel4.setBackground(new Color(255,255,255));
		JLabel label4 = new JLabel(image, SwingConstants.CENTER);
		c.add(label4);
		label4.setLocation(240, 496);
		label4.setSize(50,50);
		JTextField text4 = new JTextField();
		c.add(text4);
		text4.setLocation(350, 496);
		text4.setSize(600,50);
		
		JButton todoedit5 = new JButton("편집(汇编)");
		c.add(todoedit5);
		todoedit5.setLocation(10,600);
		todoedit5.setSize(95,40);
		todoedit5.setBackground(new Color(255,255,255));		
		JButton tododel5 = new JButton("삭제(删除)");
		c.add(tododel5);
		tododel5.setLocation(130,600);
		tododel5.setSize(95,40);
		tododel5.setBackground(new Color(255,255,255));
		JLabel label5 = new JLabel(image, SwingConstants.CENTER);
		c.add(label5);
		label5.setLocation(240, 596);
		label5.setSize(50,50);
		JTextField text5 = new JTextField();
		c.add(text5);
		text5.setLocation(350, 596);
		text5.setSize(600,50);
		
		JButton todoedit6 = new JButton("편집(汇编)");
		c.add(todoedit6);
		todoedit6.setLocation(10,700);
		todoedit6.setSize(95,40);
		todoedit6.setBackground(new Color(255,255,255));		
		JButton tododel6 = new JButton("삭제(删除)");
		c.add(tododel6);
		tododel6.setLocation(130,700);
		tododel6.setSize(95,40);
		tododel6.setBackground(new Color(255,255,255));
		JLabel label6 = new JLabel(image, SwingConstants.CENTER);
		c.add(label6);
		label6.setLocation(240, 696);
		label6.setSize(50,50);
		JTextField text6 = new JTextField();
		c.add(text6);
		text6.setLocation(350, 696);
		text6.setSize(600,50);
		
		JButton todoedit7 = new JButton("편집(汇编)");
		c.add(todoedit7);
		todoedit7.setLocation(10,800);
		todoedit7.setSize(95,40);
		todoedit7.setBackground(new Color(255,255,255));		
		JButton tododel7 = new JButton("삭제(删除)");
		c.add(tododel7);
		tododel7.setLocation(130,800);
		tododel7.setSize(95,40);
		tododel7.setBackground(new Color(255,255,255));
		JLabel label7 = new JLabel(image, SwingConstants.CENTER);
		c.add(label7);
		label7.setLocation(240, 796);
		label7.setSize(50,50);
		JTextField text7 = new JTextField();
		c.add(text7);
		text7.setLocation(350, 796);
		text7.setSize(600,50);
		
		JCheckBox hideTodo = new JCheckBox("  완료된 To do 항목 숨기기");
		c.add(hideTodo);
		hideTodo.setLocation(850, 850);
		hideTodo.setSize(200, 50);
		hideTodo.setBackground(new Color(184,255,255));
		
		JLabel hideTodo2 = new JLabel("(已完成 To-do list 藏)");
		c.add(hideTodo2);
		hideTodo2.setLocation(890, 880);
		hideTodo2.setSize(300,50);
		
		
		
		setSize(1080, 960);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//MainUI mainUi = new MainUI();
	}

}
