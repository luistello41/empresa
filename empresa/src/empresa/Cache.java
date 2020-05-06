package empresa;

public enum Cache {
  
	/* JUNIOR,
	 SEMISENIOR,
	 SENIOR,*/
	 //METODOS IMPORTANTES
     /* Cache junior = Cache.JUNIOR;    // Instancia de un enum de la clase Demarcación
	 junior.name();    // Devuelve un String con el nombre de la constante (JUNIOR)
	 junior.toString();    // Devuelve un String con el nombre de la constante (JUNIOR)
	 junior.ordinal();    // Devuelve un entero con la posición del enum según está declarada (3).
	 junior.compareTo(senior);    // Compara el enum con el parámetro según el orden en el que están declarados lo enum
	 Cache.values();    // Devuelve un array que contiene todos los enum*/


	 JUNIOR("JUNIOR",1585.0,12), 
	 SEMISENIOR("SEMISENIOR",1989.0,9),
	 SENIOR("SENIOR",2898.25,8); 
		
		private String nombre;
		private double Sueldo;
		private int horas;
		
		
		private Cache (String nombre, double Sueldo,int horas){
			this.nombre=nombre;
			this.Sueldo = Sueldo;
			this.horas= horas;
		}


		public String getNombre() {
			return nombre;
		}
        public double getSueldo() {
			return Sueldo;
		}
        public int getHoras() {
			return horas;
		}


		
}
		
