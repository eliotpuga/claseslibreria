package prueba;

import java.util.Arrays;

import models.CD;
import models.Libreria;
import models.Libro;

public class test {

	public static void main(String[] args) {
		
		
		Libro libro1=new Libro (300, "Azul", "Lo que el viento se llev�", "Cervantes");
		Libro libro2=new Libro (1521, "Verde", "Dos corr�an por tres calles", "Cela");
		Libro libro3=new Libro (665, "Amarillo", "Batalla naval del S�hara", "Escritor") ;
		Libro libro4=new Libro (845, "Marroncillo", "Mi barba tiene tres pelos", "Vividor");
		Libro libro5=new Libro (678, "Casi negro", "Sin t�tulo", "P�rez-Reverte");
		
		//System.out.println(l.abrirLibro(22));
		
		
		CD disco1=new CD ("Arriquitaun", "Gitanos", 0.3f, 1988);
		CD disco2=new CD ("Arsa", "Rumanos", 0.01f, 2003);
		CD disco3=new CD ("Chistes de Ar�valo", "Bosnios", 5.4f, 2005);
		CD disco4=new CD ("Frufr�", "Dominicanos", 666.66f, 2012);
		CD disco5=new CD ("Barrio Chapata", "Norcoreanos", 13.13f, 1968);
		
		
		// Crear array de discos y conocer cu�l es m�s caro
		CD [] cds={disco1,disco2,disco3,disco4,disco5};
		Libro [] libros= {libro1,libro2,libro3,libro4, libro5};
		
		
		// Crear librer�a con m�todo para saber el cd m�s caro (que est� en la librer�a)
		Libreria lib= new Libreria ("Urbano",cds,libros);
		CD cdMasCaro= lib.getCDmasCaro();
		
		System.out.println("El CD m�s caro es "+cdMasCaro.getNombre());
		System.out.println("El precio total de los CDs es: "+lib.getPrecioTotalCDs());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(disco.antiguedad(2017));
		//System.out.println(disco.getGrupo());
	}

}
