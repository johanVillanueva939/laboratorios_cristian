package laboratorio_14;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		ArrayList<Producto> listaProductos = new ArrayList<>();
		
		listaProductos.add(new Producto("Monster",10000,40));
		listaProductos.add(new Producto("RedBull",6000,12));
		listaProductos.add(new Producto("Spartan",5000,100));
		
		// Muestra los datos que se ingresaron en el arraylist
		for(Producto prod: listaProductos) {
			prod.mostrarProducto();
			System.out.println(">-----------------------<");
		}
		// Modifica y elimina productos
		listaProductos.get(0).setPrecio(300);
		listaProductos.remove(2);
		
		// Crea la consulta
		String consulta = JOptionPane.showInputDialog("ingrese el nombre del producto a buscar");

	}
	/* Metodo que trae la lista de productos y el valor de la consulta para compararlos
	y poder mostrar la informacion de este en caso de que la encuentre*/
	public static Producto consultar(ArrayList<Producto> listaProductos, String consulta) {
        for (Producto prod : listaProductos) {
            // Busca el nombre del producto y lo compara con el ingresado para hacer consultar
            if (prod.getNombre().equalsIgnoreCase(consulta)) {
            	System.out.println("Producto encontrado:");
                prod.mostrarProducto();
                return prod; 
            }
        }
        return null; 
    }
}
