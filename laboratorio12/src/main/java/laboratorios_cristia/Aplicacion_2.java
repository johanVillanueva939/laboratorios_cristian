package laboratorios_cristia;

import javax.swing.*;

public class Aplicacion_2 {
	public static void main (String args[]) {
            // Se definen las variables que se van a utilizar
		double ladoa;
		double ladob;
                // Se traen las funciones de 'ingresarDatos' para obtener el valor de los lados de la cancha
		ladoa = ingresarDatos("ingrese la medida del lado A: ");
		ladob = ingresarDatos("ingrese la medida del lado B: ");
                // Se ejecuta el metodo para calcular el area de la cancha
		calcularArea(ladoa,ladob);
                
	}
        /*Se define la funcion que tendra como objetivo obtener los datos 
	 * de los lados de la cancha, obteniendo como parametro el mensaje
	 * correspondiente de cada lado.*/
	public static double ingresarDatos(String mensaje) {
            // Se definen las variables del metodo
		String texto;
		double valor;
                // Se traen los datos
		texto = JOptionPane.showInputDialog(null, mensaje);
		valor = Double.parseDouble(texto);
                // Retorna el valor asignado al lado correspondiente
		return valor;
                
	}
        // Se crea el metodo con el objetivo de hallar el area de la cancha
	public static void calcularArea (double a, double b) {
		double result;
		result = a * b;
		JOptionPane.showMessageDialog(null, "El resultado es: "+result);
                
	}
}
