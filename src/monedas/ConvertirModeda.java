package monedas;
import javax.swing.JOptionPane;

public class ConvertirModeda {
	public void ConvertirDolaresASoles(double valor) {
		double solesDolar = valor * 3.62;
		solesDolar = (double) Math.round(solesDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +solesDolar+ " Soles");
	}
	
	public void ConvertirEurosASoles(double valor) {
		double solesEuro = valor * 3.95;
		solesEuro = (double) Math.round(solesEuro *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +solesEuro+ " Soles");
	}
	
	public void ConvertirLibrasASoles(double valor) {
		double solesLibra = valor * 4.60;
		solesLibra = (double) Math.round(solesLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +solesLibra+ " Soles");
	}
	
	public void ConvertirYenASoles(double valor) {
		double solesYen = valor * 0.025;
		solesYen = (double) Math.round(solesYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +solesYen+ " Soles");
	}
	
	public void ConvertirWonASoles(double valor) {
		double solesWon = valor * 0.0028;
		solesWon = (double) Math.round(solesWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes S/. " +solesWon+ " Soles");
	}
}
