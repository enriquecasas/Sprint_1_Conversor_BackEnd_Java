package monedas;
import javax.swing.JOptionPane;

public class TipoMoneda {
	
	ConvertirModeda monedas = new ConvertirModeda();
	ConvertirMonedaASoles aSoles = new ConvertirMonedaASoles();
	
	public void ConvertirMonedas(double valorInput) {
		
		Object[] tipoCambioValues = { "De Sol a Dólar", "De Sol a Euro", "De Sol a Libras", "De Sol a Yen", 
        		"De Sol a Won Coreano", "De Dólar a Sol","De Euro a Sol","De Libras a Sol","De Yen a Sol","De Won Coreano a Sol" };

		String selectedValue = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero","Monedas",
                JOptionPane.PLAIN_MESSAGE, null,
                tipoCambioValues, tipoCambioValues[0])).toString();
    
		switch(selectedValue) {
        case "De Sol a Dólar":
        	aSoles.ConvertirSolesADolares(valorInput);
        	break;
        case "De Sol a Euro":
        	aSoles.ConvertirSolesAEuros(valorInput);
        	break;
        case "De Sol a Libras":
        	aSoles.ConvertirSolesALibras(valorInput);
        	break;
        case "De Sol a Yen":
        	aSoles.ConvertirSolesAYen(valorInput);
        	break;
        case "De Sol a Won Coreano":
        	aSoles.ConvertirSolesAWon(valorInput);
        	break;    	    	                          
        case "De Dólar a Sol":
        	monedas.ConvertirDolaresASoles(valorInput);
        	break;
        case "De Euro a Sol":
        	monedas.ConvertirEurosASoles(valorInput);
        	break;
        case "De Libras a Sol":
        	monedas.ConvertirLibrasASoles(valorInput);
        	break;
        case "De Yen a Sol":
        	monedas.ConvertirYenASoles(valorInput);
        	break;
        case "De Won Coreano a Sol":
        	monedas.ConvertirWonASoles(valorInput);
            break;
        }   
		
		
	}
	
	
}
