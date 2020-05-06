package empresa;

/**
* Programa para crear objetos de distintas clases y 
* crear un array de la clase  compuestos por los objetos 
*
* @author  Luis Tello Pernas
* @version 1.0
* @since   2020-02-12
*/
public class Empleado implements Accionable {

	 //declaracion de los atributos
	 private String nombre;
	 private String sexo;
	 private double salario;
	 
	 //SOBRECARGA DE METODOS
	
	 //declaramos el metodo constructor por defecto de la clase
	 public Empleado() {//otra forma public Empleado(){
		 		        //            nombre=" ";
	 }                  //            sexo=" ";
	                    //            salario=0.0;	
	 //declaramos el metodo constructor parametrizado
	 public Empleado(String nombre,String sexo,double salario) {

		 this.nombre=nombre;
		 this.sexo=sexo;
		 this.salario=salario;
	 }
	
	 //declaramos el metodo constructor copia por si lo queremos usar ya que la sobrecarga nos lo permite
	 public Empleado(Empleado empleado) {//objeto empleado de la clase Empleado para hacer la cobia
		 
		 this.nombre=empleado.nombre;
		 this.sexo=empleado.sexo;
		 this.salario=empleado.salario;
	 }
	
	
	//generamos los GETTER AND SETTER

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public void ponerseEnHuelga() {
		// TODO Auto-generated method stub
		System.out.println("ESTE EMPLEADO ESTA EJERCIENDO SU DERECHO A HUELAGA");
	}
	
	@Override
	public void pedirVacaciones() {
		// TODO Auto-generated method stub
		System.out.println("ESTE EMPLEADO ESTA DE  VACACIONES Y SE LAS PAGA LA EMPRESA");
	}

	@Override
	public void avandonarEmpresa() {
		// TODO Auto-generated method stub
		System.out.println("ESTE EMPLEADO HA SIDO DESPEDIDO DE LA EMPRESA");
	    System.out.println("BORRAR EMPLEADO DE LA EMPRESA ,LIMPIAR SUS MESA Y BUSCAR NUEVO EMPLEADO");
	}
    
	public String toString() {
		
		return ("\n"+"NOMBRE DEL EMPLEADO="+getNombre()+"\n"+"SEXO DEL EMPLEADO="+getSexo()+
				"\n"+"SALARIO DEL EMPLEADO ="+getSalario());
	}
}
