package biblioteca;

import java.util.Scanner;

public class reservas {

	public static Scanner scan = new Scanner(System.in);
	
public static void main(String[] args){

int opcion = 0 ;	
int opcion1 = 0 ;
int opcion2 = 0 ;
int opcion3 = 0 ;

	while(opcion != 3){
		
		System.out.println();
		System.out.println("Que tipo de gestion les gustaria realizar en Libros:");
		System.out.println("Opcion 1: Reservar Libro");		
		System.out.println("Opcion 2: Cancelar Reserva");
		System.out.println("Opcion 3: Finalizar Programa");
		
		opcion = scan.nextInt();
		
		if(opcion == 1){
			String titulo;
			System.out.print("Introduzca el Titulo del Libro que quiere Reservar :");
			titulo = scan.nextLine();
			
			Libro.reservarLibro(titulo);
				
		}else if(opcion == 2){
			String titulo;
			
			System.out.print("Introduzca el Titulo del Libro con que quiere Cancelar la Reserva :");
			titulo = scan.nextLine();
			
			Libro.eliminarReserva(titulo);
			
		}else if(opcion == 3){
			System.out.println("Finalizar el Programa");
		}else{
			System.out.println("Eliga una opcion entre 1 - 4");
		}	
			
	}

}

}