package laboratorios_cristian;

public class Aplicacion_3 {
	public static void main(String args[]) {
            // Crea la variable 'rectangulo' que almacena los datos de 'Entidad'
		Entidad rectangulo;
                // Crea la instancia de 'rectangulo', un objeto de la clase 'Entidad'
		rectangulo = new Entidad();
                /* Los metodos de la clase 'Entidad', se realizan los procesos de obtencion
		de datos y procesamiento para encontrar el area*/
		rectangulo.ingresarDatos();
		rectangulo.calcularArea();
                
	}
}
