

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SaveActionLL implements ActionListener{
	LyLich l;

	public SaveActionLL(LyLich l) {
		super();
		this.l = l;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFileChooser choose = new JFileChooser();
		int save = choose.showSaveDialog(null);
		
		while(save==choose.APPROVE_OPTION){
			FileWriter fr = null;	
			
			try {
				fr = new FileWriter(choose.getSelectedFile().getPath());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			BufferedWriter out = new BufferedWriter(fr);
			PrintWriter output = new PrintWriter(out);
			output.println("ho va ten :  " +l.getText().getText());
			
			output.println("ngay Sinh: "+ l.day.getSelectedItem() + "-"+l.month.getSelectedItem()+"-" + l.year.getSelectedItem());
			
			if (l.nam.isSelected()){
				output.println("gioi tinh : Nam");
			}
			else{
				output.println("Gioi tinh : Nu");
			}
			output.close();
			
	}
		// Reder

	//@Override
	/*public void actionPerformed(ActionEvent arg0) {
		JFileChooser chooser=new JFileChooser();
		int save =chooser.showSaveDialog(null);
		while (save==chooser.APPROVE_OPTION){
			FileWriter file=null;
			try {
				file=new FileWriter(chooser.getSelectedFile());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PrintWriter out=new PrintWriter(file);
			String data = l.getText().getText();
			out.println(data);
			out.close();
			break;
		
		}*/
	}
	

}
