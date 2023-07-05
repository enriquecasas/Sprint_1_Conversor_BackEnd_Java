package main;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import monedas.TipoMoneda;
import temperatura.TipoTemperatura;

public class Principal {
public static void main(String[] args) {
		
		TipoMoneda monedas = new TipoMoneda();
		TipoTemperatura temperatura = new TipoTemperatura();
		
		ImageIcon icono = new ImageIcon("src/image/coins-789.svg");
		int respuesta = 0;
		
		//Menu inicial
		Object[] tipoAccionValues = {"Conversor de Moneda","Conversor de Temperatura"};
		
        Object option = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Menu", JOptionPane.QUESTION_MESSAGE,
                null, tipoAccionValues,
                tipoAccionValues[0]);
        
	    while (respuesta == 0) {
	    	switch (option.toString()) {
			case "Conversor de Moneda":
				
				String valorInput = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
				
				if (ValidarNumeroInput(valorInput) == true) {
					double vInput = Double.parseDouble(valorInput);
					monedas.ConvertirMonedas(vInput);
					respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
					
                    if (JOptionPane.OK_OPTION == respuesta){
                    	System.out.println("Selecciona opción Afirmativa");
                    }else{
                       	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                    }
					
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");   
				}
								
				break;

			case "Conversor de Temperatura":
				
				// code here
	             
				break;
				
			default:
				break;
			}
		}   
  
	}

	
	public static boolean ValidarNumeroInput(String valor) {
        try {
	            double x = Double.parseDouble(valor);
	            if(x >= 0 || x < 0);
	                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
