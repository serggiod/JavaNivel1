package TrabajoPractico01;
import  TrabajoPractico01.Empleado;
import  TrabajoPractico01.Constantes;

public class Servicio {
 
	public static void CalcularSueldo(Empleado e){
		float sueldo = Constantes.BASICO;
		if(e.getEstadoCivil()==Constantes.CASADO) sueldo = sueldo + ((sueldo *Constantes.ADICIONAL) /100);
		System.out.println(e.toString()+" "+sueldo+"  |");
	}
	
	public static void BuscarEmpleado(int l,Empleado[] e){
		for(int i=0;i<e.length;i++){
			if(l==e[i].getLegajo()) Servicio.CalcularSueldo(e[i]);
		}
	}
	
}
