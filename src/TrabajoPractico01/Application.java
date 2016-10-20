package TrabajoPractico01;
import  TrabajoPractico01.Empleado;
import  TrabajoPractico01.Constantes;
import  TrabajoPractico01.Servicio;

public class Application {

	public void Run(){
		
		Empleado[] empleado = new Empleado[5];
		// legajo(int), nombre(String), apellido(String), stadoCivil(String),sexo(String)
		empleado[0] = new Empleado(234,"Fernado Matias","Subelza",Constantes.CASADO,Constantes.MASCULINO);
		empleado[1] = new Empleado(235,"Pablo Oscar","Superate",Constantes.SOLTERO,Constantes.MASCULINO);
		empleado[2] = new Empleado(236,"Miguel Angel","Artista",Constantes.CASADO,Constantes.MASCULINO);
		empleado[3] = new Empleado(237,"Veroni Camila","Salvation",Constantes.SOLTERO,Constantes.FEMENINO);
		empleado[4] = new Empleado(238,"Agustina Luci","Superarte",Constantes.CASADO,Constantes.FEMENINO);
		
		// Mostrar Empleado con calculo de sueldo.
		System.out.println("Item 1: Calcular Sueldo");
		System.out.println("---- -- -------- ------");
		System.out.println("___________________________________________________________");
		System.out.println("|  Empleado  |  Legajo  |  Estado C.  |  Sexo  |  Sueldo  |");
		System.out.println("̣̣̣̣̣-----------------------------------------------------------");
		for(int i=0;i<empleado.length;i++){
			Servicio.CalcularSueldo(empleado[i]);
		}
		System.out.println("̣̣̣̣̣-----------------------------------------------------------");
		System.out.println();
		System.out.println();
		
		// Buscar Empleado por número de legajo.
		int legajo = 236;
		System.out.println("Item 2: Buscar Empleado Por Número de Legajo (Con legajo: "+legajo+")");
		System.out.println("---- -- ------ -------- --- ------ -- ------ ---- -----------");
		System.out.println("___________________________________________________________");
		System.out.println("|  Empleado  |  Legajo  |  Estado C.  |  Sexo  |  Sueldo  |");
		System.out.println("̣̣̣̣̣-----------------------------------------------------------");
		Servicio.BuscarEmpleado(legajo,empleado);
		System.out.println("̣̣̣̣̣-----------------------------------------------------------");
		System.out.println();
		System.out.println();
	}
	
}
