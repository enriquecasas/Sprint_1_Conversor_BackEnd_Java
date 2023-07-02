import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		ImageIcon icono = new ImageIcon("src/image/coins-789.svg");
 
        Object resp = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Menu", JOptionPane.INFORMATION_MESSAGE,
                icono, new Object[] { "Conversor de Moneda","Conversor de Temperatura"},
                "Opción 2");
        
        JOptionPane.showMessageDialog(null, resp,
                "Selección", JOptionPane.INFORMATION_MESSAGE);
	}
}
