package se.smu;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class TodoAddError extends JFrame{
	//private Font f = new Font("돋움", Font.BOLD, 20);
	
	public TodoAddError() {
		setTitle("실행 오류");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(new Color(184,255,255));
		c.setLayout(null);
		
		JLabel em = new JLabel("실제 마감일을 제외한 등록 정보를 전부 입력해주세요");
		JButton ob = new JButton("확인");
		
		c.add(em);
		c.add(ob);
		
		em.setLocation(20, 15);
		em.setSize(350, 50);
		ob.setLocation(140, 85);
		ob.setSize(70, 25);
		
		JLabel em2 = new JLabel("(请填写除实际截止日期以外的所有注册信息。)");
		c.add(em2);
		em2.setLocation(35, 35);
		em2.setSize(350, 50);
		
		JLabel em3 = new JLabel("(确认。)");
		c.add(em3);
		em3.setLocation(155, 95);
		em3.setSize(150, 50);
		
		setSize(360, 180);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//TodoAddError todoAddError = new TodoAddError();
	}

}
