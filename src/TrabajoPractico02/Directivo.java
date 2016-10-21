package TrabajoPractico02;
import  TrabajoPractico02.Empleado;
import  TrabajoPractico02.Constantes;
import  TrabajoPractico02.Servicio;

public class Directivo extends Empleado{
	
	private float sbruto;
	private float sneto;

	public Directivo(int l, String n, String a, String ec, String s, String f) {
		super(l, n, a, ec, s, f);
		this.setSbruto(Constantes.BASICO);
		this.setSneto(Constantes.BASICO);
		this.setSneto(Constantes.ADDDIRECTIVOF);
		if(this.getEstadoCivil()==Constantes.CASADO) this.setSneto(Servicio.calculoPorcentual(this.getSbruto(),Constantes.ADDCASADOP));
		this.setSneto((Servicio.calculoPorcentual(this.getSbruto(),Constantes.DELJUBILATORIOP)) *-1);
		this.setSneto((Servicio.calculoPorcentual(this.getSbruto(),Constantes.DELSEGUROVP)) *-1);
	}

	@Override
	public String toString() {
		String empleado  = "Legajo: "+this.getLegajo();
			   empleado += "\nEmpleado: "+this.getApellido()+" "+this.getNombre();
			   empleado += "\nEstado Civil: "+this.getEstadoCivil();
			   empleado += "\nCategoria o Función: Directivo";
			   empleado += "\nFecha de Ingreso: "+this.getFalta();
			   empleado += "\nSexo: "+this.getSexo();
			   empleado += "\nSueldo Bruto: "+this.getSbruto();
			   empleado += "\nSueldo Neto: "+this.getSneto();
		return empleado;
	}

	public float getSbruto() {
		return sbruto;
	}
	public void setSbruto(float sbruto) {
		this.sbruto += sbruto;
	}
	public float getSneto() {
		return sneto;
	}
	public void setSneto(float sneto) {
		this.sneto += sneto;
	}
	
	

}
