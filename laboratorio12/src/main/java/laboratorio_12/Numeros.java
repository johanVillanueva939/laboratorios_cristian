package laboratorio_12;

import javax.swing.*;

public class Numeros {
        // Se crea la variable 'number', recibira los numeros que ingresemos
	int number; 
        /* Se crean las variables de 'i' para el for,
	 junto a 'negativos' y 'pares' para contar los negativos y los pares */
	int i, negativos=0,pares=0; 
        /* Se crea el metodo de 'entrada', se pediran los datos y
	se analizaran para saber de que tipo es, si es negativo o positivio */
	public void entrada() {
            // Se ejectua el metodo de 'ingresarDatos', asignandole el resultado a la variable de 'number'
		for (i = 0; i < 5; i++) {
		// Se generan las condicionales para filtrar los numeros ingresados entre los negativo y pares
			number=ingresarDatos("digite 1 numero"); 
			if(number%2==0) {
				pares++;
			}
			if(number<0) {
				negativos++;
			}
		}
		// Se imprime el mensaje en el que se visualizatan los resultados de todo el proceso
		JOptionPane.showMessageDialog(null, "Cantidad de numeros pares es: "+pares+"\n\n"+
		"Cantidad de numeros negativos es: "+negativos);
	}
	// Metodo para retornara un entero, recibiendo un mensaje para traer un valor que se enviara al metodo 'entrada'.
	public static int ingresarDatos(String mensaje) {
            // Se definen las variables del metodo
		String texto;
		int valor;
                // Se reciben los datos por medio de JOptionPane
		texto = JOptionPane.showInputDialog(null, mensaje);
		valor = Integer.parseInt(texto);
                // Retorna el valor que se ingreso
		return valor;
	}
}