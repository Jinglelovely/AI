

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class OpenActionLL implements ActionListener{
	LyLich l;

	public OpenActionLL(LyLich l) {
		super();
		this.l = l;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFileChooser choose = new JFileChooser();
		int open = choose.showOpenDialog(null);
		
		while (open==choose.APPROVE_OPTION){
			FileReader fr = null;
			
			try {
				fr = new FileReader(choose.getSelectedFile().getPath());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedReader in = new BufferedReader(fr);
			String data ="";
			
			while (true){
				String line = null;
				
				try {
					line = in.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(line==null){
					break;
				}
				data+= line +"\n";
				l.getText().setText(data);
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
				
			}
			
		}
		
	}
	

}
