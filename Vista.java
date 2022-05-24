package provincias;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Vista {
	
	
	public String input(String mensaje){
		return JOptionPane.showInputDialog(mensaje);
	}
	
	
	public void output(String mensaje){
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public void outputHome() throws MalformedURLException{
		
		String [] botones = { "INICIAR" };
		
		 ImageIcon icon = new ImageIcon(new URL(
			        "https://icons-for-free.com/iconfiles/png/512/globe+location+world+icon-1320196720329899980.png"));
		JOptionPane.showOptionDialog (null, "","Matrices Programacion II",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,botones,botones[0]);
	}
}
