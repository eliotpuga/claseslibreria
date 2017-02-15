package models;

public class Libro {
 private int nPaginas;
 private String color;
  private String titulo;
  private String autor;


 
 // Constructor
 	public Libro(int nPaginas, String color,  String titulo,String autor) {
 		this.nPaginas = nPaginas;
 		this.color = color;
 		this.titulo = titulo;
 		this.autor = autor;
 		
}
 
 	
 	
 // Comportamientos (métodos) 
 	
 	
 	
 	public String getcolor(){
 		return this.color;
 	}
 	


	public int getnPaginas() {
		return nPaginas;
	}



	public String getColor() {
		return color;
	}



	public String getTitulo() {
		return titulo;
	}



	public String getAutor() {
		return autor;
	}
	public String abrirLibro (int n){
 		return "Libro abierto por la página "+n;
 	}

}
