package models;

public class CD {

		private String nombre;
		private String grupo;
		private float precio;
		private int anho;
		
		public CD(String nombre, String grupo, float precio, int año) {
			
			this.nombre = nombre;
			this.grupo = grupo;
			this.precio = precio;
			this.anho = año;
		}
		
		public String getGrupo(){
			return this.grupo;
		}
		

		public String getNombre() {
			return nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public int getAnho() {
			return anho;
		}
		public int antiguedad(int anho){
			
			return anho-this.anho;
			//return "La antiguedad del disco es "+(anhoActual-anho);
		}
}
