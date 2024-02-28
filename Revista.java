package biblioteca;

import java.util.ArrayList;

public class Revista extends materialL {
    private double precio;
    private static ArrayList<Revista> arrayRevistas = new ArrayList<>();

    public Revista(int id, String titulo, String autor, String tematica, double precio) {
        super(id, titulo, autor, tematica);
        this.precio = precio;
    }

    // Getters y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public static ArrayList<Revista> getArrayRevistas() {
        return arrayRevistas;
    }

    public static void setArrayRevistas(ArrayList<Revista> arrayRevistas) {
        Revista.arrayRevistas = arrayRevistas;
    }

    // Método para calcular el precio total
    public double calcularPrecio(int cantidad) {
        return precio * cantidad;
    }
    
    // AÑADIR REVISTA
    public static void añadirRevista(Revista revista) {
        arrayRevistas.add(revista);
    }
    
    // ELIMINAR REVISTA
    
    public static void eliminarRevista(String titulo) {
        for(Revista revista : arrayRevistas){
        	if(revista.getTitulo().equals(titulo)){
        		arrayRevistas.remove(revista);
        		System.out.println("La Revista "+titulo+", ha sido eliminado.");
        		return;
        	}       	
        }
    	System.out.println("La Revista con el Titulo :"+titulo+", no ha sido encontrada en la biblioteca.");
    	
    }
    
    // MODIFICAR UNA REVISTA
    public static void modificarRevista(String titulo, int nuevoId, String nuevoTitulo, String nuevoAutor, String nuevaTematica, double nuevoPrecio) {
        for(Revista revista : arrayRevistas) {
            if(revista.getTitulo().equals(titulo)) {
                revista.setId(nuevoId);
                revista.setTitulo(nuevoTitulo);
                revista.setAutor(nuevoAutor);
                revista.setTematica(nuevaTematica);
                revista.setPrecio(nuevoPrecio);
                
                System.out.println("La Revista: "+ titulo +", ha sido modificada exitosamente");
                return;
            }
        }
        System.out.println("La Revista: "+ titulo +", no ha sido encontrada en la biblioteca");
    }
    
    // METODOS PARA BUSCAR REVISTA POR: TITULO, AUTOR, TEMATICA
    public static void buscarRevistaPorTitulo(String tituloBuscar ) {
        for (Revista revista : arrayRevistas) {
            if (revista.getTitulo().equals(tituloBuscar)){
                revista.mostrar();
                return;
            }
        }
        System.out.println("La Revista "+ tituloBuscar +", No ha sido encontrada en la Biblioteca.");
    }
    
    public static void buscarRevistaPorAutor(String autorBuscar) {
        for (Revista revista : arrayRevistas) {
            if (revista.getAutor().equals(autorBuscar)){
                revista.mostrar();
                return;
            }
        }
        System.out.println("Las Revistas del Autor : "+ autorBuscar +", No han sido encontradas en la Biblioteca.");
    }
    
    public static void buscarRevistaPorTematica(String tematicaBuscar) {
        for (Revista revista : arrayRevistas) {
            if (revista.getTematica().equals(tematicaBuscar)){
                revista.mostrar();
                return;
            }
        }
        System.out.println("Las Revistas de la Temática : "+ tematicaBuscar +", No han sido encontradas en la Biblioteca.");
    }
    
    // METODO SIMPLE PARA MOSTRAR VALORES DE LA REVISTA
    public void mostrar() {
        System.out.println("Revista {Titulo: "+ getTitulo() +" | Autor : "+ getAutor() +" | Temática : "+ getTematica() +" | Precio :"+ getPrecio() +" }");
    }
    
    @Override
    public String cadena() {
        return super.cadena() + ", Precio: €" + precio;
    }
}
