package TrabajoPractico02;
import  TrabajoPractico02.Empleado;
import  TrabajoPractico02.Directivo;
import  TrabajoPractico02.Administrativo;
import  TrabajoPractico02.Constantes;
import  TrabajoPractico02.Servicio;
import  java.util.List;
import  java.util.ArrayList;

public class Application {

	public void Run(){
		
		List <Empleado> empleados = new ArrayList<Empleado>();
		
		empleados.add(new Directivo(100,"Mario","López",Constantes.CASADO,Constantes.MASCULINO,"01-01-2000"));
		empleados.add(new Directivo(101,"Marcos","Juarez",Constantes.SOLTERO,Constantes.MASCULINO,"01-01-2001"));
		empleados.add(new Administrativo(102,"Maria","Martinez",Constantes.SOLTERO,Constantes.FEMENINO,"01-02-2000",5));
		empleados.add(new Administrativo(103,"Antonia","Luna",Constantes.CASADO,Constantes.FEMENINO,"01-03-2000",4));
		empleados.add(new Administrativo(104,"Carlos","Ontiveros",Constantes.SOLTERO,Constantes.MASCULINO,"01-01-2016",1));
		
		// Mostrar Empleado con calculo de sueldo.
		System.out.println("Item 4: Mostrar empleados con calculo de sueldos brutos y neto");
		System.out.println("____ __ _______ _________ ___ _______ __ _______ ______ _ ____");
		for(int i=0;i<empleados.size();i++){
			System.out.println(empleados.get(i).toString()+"\n");
		}
		System.out.println();
		System.out.println();
		
		
		// Mostrar Empleado con nuevo calculo de sueldo.
		System.out.println("Item 5: Mostrar empleados con nuevo calculo de sueldos brutos y neto");
		System.out.println("____ __ _______ _________ ___ _____ _______ __ _______ ______ _ ____");
		for(int i=0;i<empleados.size();i++){
			float bruto   = 8000;
			if(empleados.get(i).getEstadoCivil()==Constantes.CASADO) bruto = bruto + ((bruto *10) /100);
			if(empleados.get(i) instanceof Directivo) bruto += 2000;
			float descLey = ((bruto *8) /100) + ((bruto *6) /100);
			empleados.get(i).setSbruto(bruto);
			empleados.get(i).setSneto(bruto -descLey);
			System.out.println(empleados.get(i).toString()+"\n");
		}
		System.out.println();
		System.out.println();
		
		
		// Buscar Empleado por número de legajo.
		int legajo = 102;
		System.out.println("Item 6: Buscar Empleado Por Número de Legajo (Con legajo: "+legajo+")");
		System.out.println("____ _");
		Servicio.BuscarEmpleado(legajo,empleados);
		System.out.println();
		System.out.println();
	}
	
}
