package monedas;
import javax.swing.JOptionPane;

public class ConvertirMonedaASoles {
	public void ConvertirSolesADolares(double valor) {
		double solesDolar = valor / 3.62;
		solesDolar = (double) Math.round(solesDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +solesDolar+ " Dolares");
	}
	
	public void ConvertirSolesAEuros(double valor) {
		double solesEuro = valor / 3.95;
		solesEuro = (double) Math.round(solesEuro *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes € " +solesEuro+ " Euros");
	}
	
	public void ConvertirSolesALibras(double valor) {
		double solesLibra = valor / 4.60;
		solesLibra = (double) Math.round(solesLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₤ " +solesLibra+ " Libras");
	}
	
	public void ConvertirSolesAYen(double valor) {
		double solesYen = valor / 0.025;
		solesYen = (double) Math.round(solesYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ¥ " +solesYen+ " Yen");
	}
	
	public void ConvertirSolesAWon(double valor) {
		double solesWon = valor / 0.0028;
		solesWon = (double) Math.round(solesWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₩ " +solesWon+ " Won Coreano");
	}
}
