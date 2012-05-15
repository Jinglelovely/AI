

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;


public class ActionLL implements ActionListener{
	LyLich l;

	public ActionLL(LyLich l) {
		super();
		this.l = l;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//exit 
		System.exit(0);
		
	
}
}
	
	


