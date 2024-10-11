package laboratorios_cristia;


import javax.swing.*;

public class Aplicacion {
	public static void main (String args[]) {
            // Se definen las variables
		String texto;
		double ladoa;
		double ladob;
		double resultado;
                
            // Se asignan de los valores a las variables
		texto = JOptionPane.showInputDialog(null, "Ingrese la medida del lado A: ");
		ladoa = Double.parseDouble(texto);
		
		texto = JOptionPane.showInputDialog(null, "Ingrese la medidia del lado B: ");
		ladob = Double.parseDouble(texto);

		resultado = ladoa * ladob;
		JOptionPane.showMessageDialog(null, "El resutlado es: "+resultado);
	}
}
