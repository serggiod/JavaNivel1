package TrabajoPractico02;
import  TrabajoPractico02.Empleado;
import  TrabajoPractico02.Constantes;
import  java.util.List;

public class Servicio {
 
	public static void CalcularSueldo(Empleado e){
		float sueldo = Constantes.BASICO;
		if(e.getEstadoCivil()==Constantes.CASADO) sueldo = sueldo + ((sueldo *Constantes.ADDCASADOP) /100);
		System.out.println(e.toString()+" "+sueldo+"  |");
	}
	
	public static void BuscarEmpleado(int l,Empleado[] e){
		for(int i=0;i<e.length;i++){
			if(l==e[i].getLegajo()) Servicio.CalcularSueldo(e[i]);
		}
	}
	
	public static void BuscarEmpleado(int l,List<Empleado> e){
		for(int i=0; i<e.size();i++){
			if(l==e.get(i).getLegajo()) System.out.println(e.get(i).toString());
		}
	};
	

}
