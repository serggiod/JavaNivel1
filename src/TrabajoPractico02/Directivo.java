package TrabajoPractico02;
import  TrabajoPractico02.Empleado;
import  TrabajoPractico02.Constantes;

public class Directivo extends Empleado{
	
	private float sbruto;
	private float sneto;

	public Directivo(int l, String n, String a, String ec, String s, String f) {
		super(l, n, a, ec, s, f);
		float bruto   = Constantes.BASICO + Constantes.ADDDIRECTIVOF;
		if(this.getEstadoCivil()==Constantes.CASADO) bruto = bruto + ((bruto *Constantes.ADDCASADOP) /100);
		float descLey = ((bruto *Constantes.DELJUBILATORIOP) /100) + ((bruto *Constantes.DELSEGUROVP) /100);
		this.setSbruto(bruto);
		this.setSneto(bruto -descLey);
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
		this.sbruto = sbruto;
	}
	public float getSneto() {
		return sneto;
	}
	public void setSneto(float sneto) {
		this.sneto = sneto;
	}
	
	

}
