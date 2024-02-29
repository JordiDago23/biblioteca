package biblioteca;

import java.util.Scanner;

public class manejo {

	public static Scanner scan = new Scanner(System.in);
	
public static void main(String[] args){

int opcion = 0 ;	
int opcion1 = 0 ;
int opcion2 = 0 ;
int opcion3 = 0 ;

	while(opcion != 4){
		
		System.out.println();
		System.out.println("En que apartado le interesa (Añadir/Eliminar/Modificar) algo :");
		System.out.println("Opcion 1: Libros");
		System.out.println("Opcion 2: Revistas");
		System.out.println("Opcion 3: Articulos");
		System.out.println("Opcion 4: Volver al Menu");
		
		opcion = scan.nextInt();
		scan.nextLine();
		
		if(opcion == 1){
			
				while(opcion1 != 4){
					
					System.out.println();
					System.out.println("Que le gustaria hacer en Libros");
					System.out.println("Opcion 1: Añadir");
					System.out.println("Opcion 2: Eliminar");
					System.out.println("Opcion 3: Modificar");
					System.out.println("Opcion 4: Volver Atras");
					
					opcion1 = scan.nextInt();
					scan.nextLine();
					
				if(opcion1 == 1){
					
					int nuevoId = 0;  String nuevoTitulo;  String nuevoAutor;  String nuevoTematica;
					
					System.out.println("Introduzca los datos de este Nuevo Libro : ");
					System.out.print("Que Id tendra este Libro : ");
					nuevoId = scan.nextInt();
					scan.nextLine();
					System.out.println();
					System.out.print("Que Titulo tendra el Libro : ");
					nuevoTitulo = scan.nextLine();
					System.out.println();
					System.out.print("A Que Autor pertenecera el Libro : ");
					nuevoAutor = scan.nextLine();
					System.out.println();
					System.out.print("Que Temática tendra este Libro : ");
					nuevoTematica = scan.nextLine();
					System.out.println();
					
					Libro libro = new Libro(nuevoId, nuevoTitulo, nuevoAutor, nuevoTematica);
					
					
					Libro.añadirLibro(libro);
					
				}else if(opcion1 == 2){
					
					String titulo;
					
					System.out.print("Introduzca el Titulo del Libro que desea Eliminar : ");
					titulo = scan.nextLine();
					
					Libro.eliminarLibro( titulo);
					
				}else if(opcion1 == 3){
					
					String titulo; int nuevoId; String nuevoTitulo; String nuevoAutor; String nuevoTematica; boolean nuevoReservado; 
					
					
					System.out.print("Cual es el titulo del libro que quiere modificar : ");
					titulo = scan.next();
					System.out.println();			
					System.out.print("Cual es el nuevo Id del libro a implementar : ");
					nuevoId = scan.nextInt();
					System.out.println();
					scan.nextLine();
					System.out.print("Cual es el nuevo Titulo del libro a implementar : ");
					nuevoTitulo = scan.next();
					System.out.println();
					System.out.print("Cual es el nuevo Autor del libro a implementar : ");
					nuevoAutor = scan.next();
					System.out.println();
					System.out.print("Cual es el nuevo Temática del libro a implementar : ");
					nuevoTematica = scan.next();
					System.out.println();
					System.out.print("Cual es el nuevo estado de Reservado del libro a implementar (false: no reservado / true: reservado) ?");
					nuevoReservado = scan.nextBoolean();
					System.out.println();
				
				Libro.modificarLibro( titulo,  nuevoId,  nuevoTitulo,  nuevoAutor,  nuevoTematica,  nuevoReservado );
					
				}else if(opcion1 == 4){
					System.out.println("Volviendo Atras");
				}else{
					System.out.println("Eliga una opcion entre 1 - 4");
				}	
					
				}
				
		}else if(opcion == 2){
			
			while(opcion2 != 4){
					
				System.out.println();
				System.out.println("Que le gustaria hacer en Revistas");
				System.out.println("Opcion 1: Añadir");
				System.out.println("Opcion 2: Eliminar");
				System.out.println("Opcion 3: Modificar");
				System.out.println("Opcion 4: Volver Atras");
					
					opcion2 = scan.nextInt();
					scan.nextLine();
					
				if(opcion2 == 1){
						
					int nuevoId = 0;  String nuevoTitulo;  String nuevoAutor;  String nuevoTematica; double nuevoPrecio;
					
					System.out.println("Introduzca los datos de esta Nueva Revista : ");
					System.out.print("Que Id tendra esta Revista : ");
					nuevoId = scan.nextInt();
					System.out.println();
					scan.nextLine();
					System.out.print("Que Titulo tendra la Revista : ");
					nuevoTitulo = scan.nextLine();
					System.out.println();					
					System.out.print("A Que Autor pertenecera la Revista : ");
					nuevoAutor = scan.nextLine();
					System.out.println();
					System.out.print("Que Temática tendra esta Revista  : ");
					nuevoTematica = scan.nextLine();
					System.out.println();
					System.out.print("Que Precio tendra esta Revista : ");
					nuevoPrecio = scan.nextDouble();
					System.out.println();
					
					Revista revista = new Revista(nuevoId, nuevoTitulo, nuevoAutor, nuevoTematica ,nuevoPrecio);
					
					Revista.añadirRevista(revista);
					
				}else if(opcion2 == 2){
					
					String titulo;
					System.out.print("Introduzca el Titulo de la Revista que desea Eliminar : ");
					titulo = scan.nextLine();
					
					Revista.eliminarRevista( titulo);
					
				}else if(opcion2 == 3){
							
					String titulo; int nuevoId; String nuevoTitulo; String nuevoAutor; String nuevoTematica; double nuevoPrecio; 
					
					
					System.out.print("Cual es el titulo de la Revista que quiere modificar : ");					
					titulo = scan.next();
					System.out.println();
					System.out.print("Cual es el nuevo Id de la Revista a implementar : ");
					nuevoId = scan.nextInt();
					scan.nextLine();
					System.out.println();					
					System.out.print("Cual es el nuevo Titulo de la Revista a implementar : ");
					nuevoTitulo = scan.next();
					System.out.println();					
					System.out.print("Cual es el nuevo Autor de la Revista a implementar : ");
					nuevoAutor = scan.next();
					System.out.println();					
					System.out.print("Cual es el nuevo Temática de la Revista a implementar : ");
					nuevoTematica = scan.next();
					System.out.println();				
					System.out.print("Cual es el nuevo Precio de la Revista a implementar : ");
					nuevoPrecio = scan.nextDouble();
					System.out.println();
				
					Revista.modificarRevista( titulo,  nuevoId,  nuevoTitulo,  nuevoAutor,  nuevoTematica,  nuevoPrecio );
					
				}else if(opcion2 == 4){
					System.out.println("Volviendo Atras");
				}else{
					System.out.println("Eliga una opcion entre 1 - 4");
				}	
					
				}
			
		}else if(opcion == 3){
			
			while(opcion3 != 4){
					
				System.out.println();
				System.out.println("Que le gustaria hacer en Articulos");
				System.out.println("Opcion 1: Añadir");
				System.out.println("Opcion 2: Eliminar");
				System.out.println("Opcion 3: Modificar");
				System.out.println("Opcion 4: Volver Atras");
					
					opcion3 = scan.nextInt();
					scan.nextLine();
					
				if(opcion3 == 1){
					
					int nuevoId = 0;  String nuevoTitulo;  String nuevoAutor;  String nuevoTematica;
					
					System.out.println("Introduzca los datos de este Nuevo Articulo : ");
					System.out.print("Que Id tendra este Articulo : ");
					nuevoId = scan.nextInt();
					scan.nextLine();
					System.out.println();
					System.out.print("Que Titulo tendra el Articulo : ");
					nuevoTitulo = scan.nextLine();
					System.out.println();					
					System.out.print("A Que Autor pertenecera el Articulo : ");
					nuevoAutor = scan.nextLine();
					System.out.println();					
					System.out.print("Que Temática tendra este Articulo : ");
					nuevoTematica = scan.nextLine();
					System.out.println();					
					
					Articulo articulo = new Articulo(nuevoId, nuevoTitulo, nuevoAutor, nuevoTematica );
					Articulo.añadirArticulo(articulo);
					
				}else if(opcion3 == 2){
					
					String titulo;
					System.out.print("Introduzca el Titulo del Articulo que desea Eliminar : ");
					titulo = scan.nextLine();
					
					Articulo.eliminarArticulo(titulo);
					
				}else if(opcion3 == 3){					
					String titulo; int nuevoId; String nuevoTitulo; String nuevoAutor; String nuevoTematica; boolean nuevoDisponible; 					
					
					System.out.print("Cual es el titulo del Articulo que quiere modificar : ");
					titulo = scan.next();
					System.out.println();									
					System.out.print("Cual es el nuevo Id del Articulo a implementar : ");
					nuevoId = scan.nextInt();
					scan.nextLine();
					System.out.println();					
					System.out.print("Cual es el nuevo Titulo del Articulo a implementar : ");
					nuevoTitulo = scan.next();
					System.out.println();					
					System.out.print("Cual es el nuevo Autor del Articulo a implementar : ");
					nuevoAutor = scan.next();
					System.out.println();					
					System.out.print("Cual es el nuevo Temática del Articulo a implementar : ");
					nuevoTematica = scan.next();
					System.out.println();				
					System.out.print("Cual es la Disponibilidad del Articulo a implementar (false: No Disponible / true: Disponible)?");
					nuevoDisponible = scan.nextBoolean();
					System.out.println();
				
					Articulo.modificarArticulo( titulo,  nuevoId,  nuevoTitulo,  nuevoAutor,  nuevoTematica,  nuevoDisponible);
					
				}else if(opcion3 == 4){
					System.out.println("Volviendo Atras");
				}else{
					System.out.println("Eliga una opcion entre 1 - 4");
				}	
					
				}
			
		}else if(opcion == 4){
			System.out.println("Finalizar el Programa");
		}else{
			System.out.println("Eliga una opcion entre 1 - 4");
		}	
			
	}

}

}