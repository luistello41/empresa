package empresa;

/**
* Programa para crear objetos de distintas clases y 
* crear un array de la clase  compuestos por los objetos 
*
* @author  Luis Tello Pernas
* @version 1.0
* @since   2020-02-12
*/
public class Analista extends Empleado {

	  //atributos propios
	 private String herramienta;
	 private Cache cache;
	  //metodo constructor por defecto
	   public Analista() {
		   super();
	   }
      //metodo constructor parametrizado
	   public Analista(String nombre,String sexo,double salario,String herramienta,Cache cache) {
		    
		   super(nombre,sexo,salario);
	       this.herramienta=herramienta;
	       this.cache=cache;
	   }
       //metodo constructor copia
	   public Analista(Analista analista) {
		   super();
		   this.herramienta=analista.herramienta;
		   this.cache=analista.cache;
	   }
	public Cache getCache() {
		return cache;
	}
	
	public String getHerramienta() {
		return herramienta;
	}
	public void setHerramienta(String herramienta) {
		this.herramienta = herramienta;
	}

    public String toString() {
    	
    	return ("\n"+"NOMBRE DEL EMPLEADO="+getNombre()+"\n"+"SEXO DEL EMPLEADO="+getSexo()+
    			"\n"+"SALARIO DEL EMPLEADO ="+getSalario()+"\n"+"LA HERRAMIENTA DEL ANALISTA ES:"+getHerramienta()+"\n"
    			+"ES UN ANALISTA "+cache.name()+"\n"+" TIENE UN SUELDO MEDIO DE: "
    			+cache.getSueldo()+"\n"+"Y TIENE QUE TRABAJAR UNA MEDIA DE "+cache.getHoras()+" HORAS");
    }
    public void pedirVacaciones() {
    	super.pedirVacaciones();
    }
   
    	 public void avandonarEmpresa(int años) {
   		  double indemnizacion=getSalario()/22; 
   		  double finiquito=30*(indemnizacion)*años;  
   	      System.out.println("el despido de un analista son 30 dias por "+años+" años  de trabajo en "+"\n"
   	      		+ "la empresa dando una indemnizacion por año de "+indemnizacion*30+"\n"+" y su finiquito asciende a:  "+finiquito);
   	  }
    
    public void ponerseEnHuelga(int dias) {
    	System.out.println("el salario de un analista es"+getSalario());
    	int descuento=(int) (getSalario()/22);
    	setSalario(getSalario() - (descuento*dias));
       System.out.println("los "+ dias+" dias que se ha tomado el analista de huelga"+"\n"
       		+ " le resta "+descuento*dias+" euros "+"\n"+ "y  el salario total seria:"+getSalario());
    }
}  
