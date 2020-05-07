package empresa;

public class Programador extends Empleado {
	
	private String ide;
	private Cache cache;
	//metodo constructor por defecto
	public Programador() {
		super();
	}
   //metodo constructor parametrizado
	public Programador(String nombre,String sexo,double salario, String ide,Cache cache) {
		super(nombre,sexo,salario);
		this.ide=ide;
		this.cache=cache;
	}
    //metodo constructor copia
	public Programador(Programador programador) {
		super();
		this.ide=programador.ide;
	    this.cache=programador.cache;
	}
     
	
	//GENEREAR METODOS GETTER AND SETTER
     public Cache getCache() {
 		return cache;
 	}
     
     public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}
	//METODO TOSTRING
	public String toString() {
		
		return("\n"+"NOMBRE DEL EMPLEADO="+getNombre()+"\n"+"SEXO DEL EMPLEADO="
		+getSexo()+"\n"+"SALARIO DEL EMPLEADO ="+getSalario()+"\n"+
		"EL ENTORNO DE DESARROLLO USADO POR EL PROGRMADOR ES:"+getIde()+"\n"
		+"ES UN PROGRAMADOR "+cache.name()+"\n"+" TIENE UN SUELDO MEDIO DE: "
		+cache.getSueldo()+"\n"+"Y TIENE QUE TRABAJAR UNA MEDIA DE "+cache.getHoras()+" HORAS");
	}
  
	 public void ponerseEnHuelga(int dias) {
	    	System.out.println("el salario de un progarmador es"+getSalario());
	    	int descuento=(int) (getSalario()/22);
	    	setSalario(getSalario() - (descuento*dias));
	       System.out.println("los "+ dias+" dias que se ha tomado el programador de huelga"+"\n"
	       		+ " le resta "+(descuento*dias)*1.25+" euros "+"\n"+" y  el salario total seria:"+getSalario());
	    }
	 public void pedirVacaciones() {
	    	super.pedirVacaciones();
	    }
      
	  public void avandonarEmpresa(int años) {
		  double indemnizacion=getSalario()/22; 
		  double finiquito=25*(indemnizacion)*años;  
		  System.out.println("//FINIQUITO INDEMNINIZACION//");
	      System.out.println("el despido de un programador son 20 dias por "+años+" años  de trabajo en "+"\n"
	      		+ "la empresa dando una indemnizacion por año de "+indemnizacion*20+"\n"+" y su finiquito asciende a:  "+finiquito);
	  }

}
