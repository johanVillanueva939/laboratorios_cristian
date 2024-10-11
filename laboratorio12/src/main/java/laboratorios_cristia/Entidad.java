package laboratorios_cristia;

import javax.swing.JOptionPane;

public class Entidad {
        /*Se definen las variables de los lados, se utilizaran 
	solo en esta clase al ser 'private'*/
	private double ladoa;
	private double ladob;
        
        // Metodo para traer las variables que se van a utilizar
	public void ingresarDatos() {
            // Se define la variable de 'cadena'
		String cadena;
                // Se traen las variables de los lados de la cancha 'A' y 'B'
		cadena = JOptionPane.showInputDialog(null, "ingrese la medida del lado A: ");
		ladoa = Double.parseDouble(cadena);
		
		cadena = JOptionPane.showInputDialog(null, "ingrese la medida del lado B: ");
		ladob = Double.parseDouble(cadena);
                
	}
        // Metodo donde se realizara el procesamiento de los datos obtenidos para encontrar el area de la cancha
	public void calcularArea() {
		double result;
		result = ladoa * ladob;
		JOptionPane.showInputDialog(null, "El resultado es: "+result);
	}
}
