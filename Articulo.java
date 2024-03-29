package biblioteca;

import java.util.ArrayList;

public class Articulo extends materialL {
    private boolean disponible;
    private static ArrayList<Articulo> arrayArticulos = new ArrayList<>();
    
    public Articulo(int id, String titulo, String autor, String tematica) {
        super(id, titulo, autor, tematica);
        this.disponible = true;
    }

    // Getters y Setters
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Métodos
    @Override
    public String cadena() {
        return super.cadena() + ", Disponible: " + (disponible ? "Sí" : "No");
    }
    
    public static void verificarDisponibilidad(Articulo articulo) {
        if (articulo.isDisponible()) {
            System.out.println("El Artículo : "+articulo.getTitulo()+", está disponible.");
        } else {
            System.out.println("El Artículo : "+articulo.getTitulo()+", no está disponible. Contactar al autor: " + articulo.getAutor());
        }
    }
    
    // AÑADIR ARTICULO
    public static void añadirArticulo(Articulo articulo) {
        arrayArticulos.add(articulo);
    }
    
    // ELIMINAR ARTICULO
    
    public static void eliminarArticulo(String titulo) {
        for(Articulo articulo : arrayArticulos){
        	if(articulo.getTitulo().equals(titulo)){
        		arrayArticulos.remove(articulo);
        		System.out.println("El Articulo : "+titulo+", ha sido eliminado.");
        		return;
        	}       	
        }
    	System.out.println("El Articulo con el Titulo : "+titulo+",No ha sido encontrada en la biblioteca.");
    	
    }
    
    // MODIFICAR UN ARTICULO
    public static void modificarArticulo(String titulo, int nuevoId, String nuevoTitulo, String nuevoAutor, String nuevoTematica, boolean nuevoDisponible) {
        for (Articulo articulo : arrayArticulos) {
            if (articulo.getTitulo().equals(titulo)) {
                articulo.setId(nuevoId);
                articulo.setTitulo(nuevoTitulo);
                articulo.setAutor(nuevoAutor);
                articulo.setTematica(nuevoTematica);
                articulo.setDisponible(nuevoDisponible);
                System.out.println("El Artículo : " + titulo + ", ha sido modificado exitosamente.");
                return;
            }
        }
        System.out.println("El Artículo : "+ titulo +" no ha sido encontrado en la biblioteca.");
    }
    
    // MÉTODOS PARA BUSCAR ARTICULOS POR: TITULO, AUTOR, TEMATICA
    public static void buscarArticuloPorTitulo(String tituloBuscar) {
        for (Articulo articulo : arrayArticulos) {
            if (articulo.getTitulo().equals(tituloBuscar)) {
                articulo.mostrar();
                return;
            }
        }
        System.out.println("El Artículo : "+ tituloBuscar +", no ha sido encontrado en la biblioteca.");
    }
    
    public static void buscarArticuloPorAutor(String autorBuscar) {
        
    	boolean encontrar = false;
    	
    	for (Articulo articulo : arrayArticulos) {
            if (articulo.getAutor().equals(autorBuscar)) {
                articulo.mostrar();
                System.out.println();
                encontrar = true;
            }
        }
    	if(!encontrar){
        System.out.println("Los Artículos del Autor : " + autorBuscar + ", no han sido encontrados en la biblioteca.");
    	}
    }
    
    public static void buscarArticuloPorTematica(String tematicaBuscar) {
        
    	boolean encontrar = false;
    	
    	for (Articulo articulo : arrayArticulos) {
            if (articulo.getTematica().equals(tematicaBuscar)) {
                articulo.mostrar();
                System.out.println();
                encontrar = true;
            }
        }
    	if(!encontrar){
        System.out.println("Los Artículos de la Temática : " + tematicaBuscar + ", no han sido encontrados en la biblioteca.");
    	}
    }
    
    // MÉTODO SIMPLE PARA MOSTRAR VALORES DEL ARTICULO
    public void mostrar() {        
        System.out.println("Información del libro:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Tematica: " + getTematica());
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
}

