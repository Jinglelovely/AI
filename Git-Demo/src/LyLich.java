

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;




public class LyLich extends JFrame{
	ActionLL a=new ActionLL (this);
	SaveActionLL s=new SaveActionLL(this);
	OpenActionLL o  =new OpenActionLL(this);
	JTextField text;
	JLabel []label;
	JPanel[]panel;
	JComboBox day,month,year;
	JRadioButton nam;
	JRadioButton nu;
	public JTextField getText() {
		return text;
	}


	public void setText(String s) {
		text.setText(s);
	}


	public LyLich (){
		setTitle("Ly Lich");
		Container container=this.getContentPane();//tao thung chua 
		container.setLayout(new GridLayout(6,1));//sap xep cac thanh phan thanh 6 hang 1 cot
		panel=new JPanel[8];//tao mang gom 8 panel
		label=new JLabel[5];//tao mang gom 5 label
		JButton[]but=new JButton[3];//tao mang gom 3 button
		
		//tao menuBar
		JMenuBar menuBar=new JMenuBar();
		JMenu file=new JMenu("File");
		JMenuItem New =new JMenuItem("New");
		JMenuItem save=new JMenuItem("Save");
		save.addActionListener(s);
		
		JMenuItem open=new JMenuItem("Open");
		open.addActionListener(o);
		JMenuItem exit=new JMenuItem("Exit");
		exit.addActionListener(a);
		/*exit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
			
		});*/
		
		//add vao frame
		file.add(New);//add menuItem vao menu file
		file.add(save);
		file.add(open);
		file.add(exit);
		menuBar.add(file);//add menu file vao menuBar
		setJMenuBar(menuBar);//setJMenuBar cho frame
		
		//tao ly lich
		label[0]=new JLabel("Ly Lich");
		label[0].setFont(Font.getFont("arial"));//setFont cho label
		label[0].setForeground(Color.RED);//tao mau cho label
		panel[0]=new JPanel();
		panel[0].setLayout(new FlowLayout(FlowLayout.CENTER));//cho panel[0] canh giua
		panel[0].add(label[0]);
		container.add(panel[0]);//add panel[0] vao container
		
		//ho ten
		label[1]=new JLabel("Ho va ten");
		text=new JTextField(15);//kich thuoc cua textfield la 15ki tu
		panel[1]=new JPanel();
		panel[1].setLayout(new FlowLayout(FlowLayout.LEFT));//cho panel canh tu trai sang
		panel[1].add(label[1]);
		panel[1].add(text);
		container.add(panel[1]);
		
		//ngay sinh va combo box
		panel[2]=new JPanel();
		label[2]=new JLabel("Ngay sinh");
		 day=new JComboBox();//hop chon chua danh sach cac gia tri, chi dc chon mot gia tri
		for (int i=1;i<32;i++){
			day.addItem(i);
		}//khi gia tri i chay tu 1 den 31 thi combobox day se add gia tri i do vao ds cac gia tri  
		 month=new JComboBox();
		for (int i=1;i<13;i++){
			month.addItem(i);
		}//tuong tu
		 year=new JComboBox();
		for(int i=1990;i<2011;i++){
			year.addItem(i);
		}//tuong tu
		panel[2].setLayout(new FlowLayout(FlowLayout.LEFT));//cho panel canh tu trai sang
		panel[2].add(label[2]);
		panel[2].add(day);//add comboBox day, month,year vao panel
		panel[2].add(month);
		panel[2].add(year);
		container.add(panel[2]);
		
		//gioi tinh 
		panel[3]=new JPanel();
		panel[4]=new JPanel();
		label[3]=new JLabel("Gioi tinh");
		ButtonGroup bg=new ButtonGroup();//chon 1 trong nhieu gt ,chi duoc chon mot gt 
		nam =new JRadioButton("Nam");//radioButton ten nam
		nu =new JRadioButton("Nu");//............nu
		bg.add(nam);//add cac radioButton nam ,nu vao ButtonGroup
		bg.add(nu);
		panel[3].setLayout(new FlowLayout(FlowLayout.LEFT));
		panel[3].add(label[3]);
		panel[4].add(nam);//add radioButton nam,nu vao panel[4]
		panel[4].add(nu);
		panel[4].setLayout(new GridLayout(2,1));//bo dong nay => radioButton nam, nu xep thanh 1 hang ngang
		panel[3].add(panel[4]);
		container.add(panel[3]);
		
		//So thich
		panel[5]=new JPanel();
		label[4]=new JLabel("So thich");
		JCheckBox muaSam=new JCheckBox("Mua Sam");//voi JcheckBox co the chon mot luc nhieu gia tri
		JCheckBox theThao=new JCheckBox("The Thao");
		panel[6]=new JPanel();
		panel[6].add(muaSam);
		panel[6].add(theThao);
		panel[6].setLayout(new GridLayout(2,1));//cac checkBox muaSam, theThao xep thanh 2hang 1 cot, bo dong nay xep thanh 1 hang ngang
		panel[5].setLayout(new FlowLayout(FlowLayout.LEFT));
		panel[5].add(label[4]);
		panel[5].add(panel[6]);
		container.add(panel[5]);
		
		//cac button
		panel[7]=new JPanel();
		but[0]=new JButton("Save");
		but[0].addActionListener(s);
		but[1]=new JButton("open");
		but[1].addActionListener(o);
		but[2]=new JButton("Exit");
		but[2].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
			
		});
		panel[7].add(but[0]);
		panel[7].add(but[1]);
		panel[7].add(but[2]);
		panel[7].setLayout(new FlowLayout(FlowLayout.CENTER));
		container.add(panel[7]);
		
		//add action cho button
	//	but[2].setActionCommand("Exit");//setActionCommand va addActionListener cho button exit
	//	but[2].addActionListener(a);
		//exit.setActionCommand("Exit");//setActionCommand va addActionListener cho JMenuItem exit
		//exit.addActionListener(a);		
		
	//	but[1].setActionCommand("open");
	//	but[2].addActionListener(a);
		
		
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	



public static void main(String[] args) {
	LyLich l=new LyLich();
}
}
