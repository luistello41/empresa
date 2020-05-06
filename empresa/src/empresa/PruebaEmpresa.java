package empresa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;



public class PruebaEmpresa {
	
	
	
	final static int TAM=6;//constante static fuera del main
    public static Empleado puestos[]=new Empleado[TAM];//declaracon objeto array arca estatico
   public static ArrayList<Empleado> puestosUno=new ArrayList<Empleado>();
    public static BufferedReader teclado = new BufferedReader( new InputStreamReader(System.in));
	static int contadorEmpleado=0;
    
    public static void main(String[] args) throws  NumberFormatException, IOException {
    	
    	System.out.println("''TIPOS DE CACHE''");
    	
    	for(Cache c: Cache.values()){//visualizar en un array el enum con su nombres
    		System.out.println(" - "+c.toString()+" - ");
    	}
    	System.out.println("\n");
    	System.out.println("'ANALISTAS'");
		
    	
	 
    	
    	
    	//CREACION DE LOS OBJETOS ANALISTAS
    	
	    Analista luis=new Analista("LUIS","REGULAR",1250.25,"SCROOB",Cache.SEMISENIOR);
    	  System.out.println(luis);
    	  luis.pedirVacaciones();
    	   System.out.println("////////////////////////////////////////////////////");
    	
    	Analista pepe=new Analista("JOSE","MASCULINO",1365.25,"ESPIRAL",Cache.JUNIOR);
    	System.out.println(pepe);
    	pepe.ponerseEnHuelga(5);
    	System.out.println("////////////////////////////////////////////////////");
    	
    	Analista tomy=new Analista("TOMY","MASCULINO",1287.39,"ROUND ROBIN",Cache.SENIOR);
		System.out.println(tomy);
		//tomy.ponerseEnHuelga(10);
		tomy.avandonarEmpresa(5);
    	System.out.println("////////////////////////////////////////////////////");
	    
    	System.out.println("'PROGAMADORE'S");
    	
	    //CREACION DE LOS OBJETOS PROGRAMADOR
    	
	    Programador jesus=new Programador("JESUS","MASCULINO",1858.36,"ECLIPSE",Cache.JUNIOR);
    	System.out.println(jesus);
    	jesus.ponerseEnHuelga(5);
    	
    	Programador ana=new Programador("ANA","FEMENINO",1989.25,"MYSQL",Cache.SEMISENIOR);
    	System.out.println(ana);
    	ana.pedirVacaciones();
    	
    	Programador ada=new Programador("ADA","FEMENINO",2985.36,"PYTHON++",Cache.SENIOR);
        System.out.println(ada);
        ada.avandonarEmpresa(10);
	   
        System.out.println("\n"); 
        System.out.print("BUSCANDO EMPLEADOS:"+"\n"+" CARGANDO ");
       
        int cont=0;
		while(cont!=80) {
        		try {
					TimeUnit.MILLISECONDS.sleep(cont);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
        	System.out.print("*");
        	
        	cont++;
           
		}
        System.out.println("\n"+"la busqueda ha tardado :"+cont+" segundos");
        
        arrayList(luis, pepe, tomy); 
        iteratorp();
        arrayEmpleados(puestos,luis,tomy,ada,jesus,pepe,ana);
         borrarEmpleados(cont);
         mostrarEmpleado(puestos);
         
    
    }
    
    
   
   
    public static void arrayList(Empleado luis, Empleado pepe, Empleado tomy) {
    	
    	
    	puestosUno.add(luis);
    	puestosUno.add(pepe);
    	puestosUno.add(tomy);
    	
    	
    }
    public static void iteratorp() {
    	
    	Iterator<Empleado> it= puestosUno.iterator();
    	while(it.hasNext()){
    	Empleado s=(Empleado)it.next();//puesto que next devuelve objetos
    	//Object, es necesario el casting
    	System.out.print("|"+s+"|");
    	}
    }
   
    public static void arrayEmpleados(Empleado puestos[],Analista luis, Empleado tomy, Empleado ada, Empleado jesus, Empleado pepe, Empleado ana) {
	  System.out.println("\n"+"LOS EMPLEADOS DE LA EMPRESA SON:");
	  
	  puestos[0]=luis;
	  puestos[1]=tomy;
	  puestos[2]=ada;
	  puestos[3]=jesus;
	  puestos[4]=pepe;
	  puestos[5]=ana;
	  contadorEmpleado=6;
	  for(int i=0;i<puestos.length;i++) {
		  
		  System.out.println("\n"+"|"+puestos[i]+"|"+"\n"+"ESTE EMPLEADO ESTA EN EL CUBICULO NUMERO ="+" "+i+"\n"
		  +"Y SU CODIGO ES ="+i*(int) Math.round(Math.random()+1*120+1+30)+"\n");
	  }
  }
      public static void borrarEmpleados(int indice) throws NumberFormatException, IOException {
    	 if (contadorEmpleado==0) {
    		System.out.println("la biblioteca esta vacia,compra algun libro"); 
    	 }else {
    		int select=posicion(teclado);
    		eliminar(select);
    	 }
    	 
      }
      public static int posicion(BufferedReader teclado) {
    	  int id=-1;
    	  
    		  while(id==-1 && id<=(TAM-1)) {
    		  System.out.println("indica la posicion del autor que queremos borrar");
    		  try {
				id=Integer.parseInt(teclado.readLine());
			 } catch (IOException e) {
				System.out.println("inserta un numero");
				e.printStackTrace();
			}
    	  }
        return id;
      }
      
      public static void eliminar( int select)throws IOException {
	      int contador=0;
		  Empleado[] puestosX= new Empleado[puestos.length]; 
		    for(int i=0;i<contadorEmpleado;i++) { 
		 	   if(puestos[i]==puestos[select]) {
				  puestosX[i-contador]=puestos[i]; } 
			    else {
				   contador++; 
				  } 
			    puestos=puestosX; 
		        contadorEmpleado--;
		      }
		 
	        System.out.print("\n"+" BORRANDO ");
	        int cont=0;
			while(cont!=80) {
	        		try {
						TimeUnit.MILLISECONDS.sleep(cont);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	        	System.out.print("*");
	        	cont++;
	           }
	        System.out.println("\n EMPLEADO "+"["+select+"]"+" BORRADO"); 
		    System.out.println();
	  }

   public static void mostrarEmpleado(Empleado puestos[]) {
		
		if(contadorEmpleado==0) {//primero comprobamos que la empresa tiene empleados
			
			System.out.println("La empresa necesita contratar empleados");
			
		}else {//sacamos los empleados que tiene la empresa
			
			for (int i = 0; i < puestos.length; i++) {
				if(puestos[i]!=null) {//discriminamos pustos a null
					System.out.println("En el puesto "+i+" está "+ puestos[i]);
					
				}
			}
			
		}
	}



} 
   
   
			

