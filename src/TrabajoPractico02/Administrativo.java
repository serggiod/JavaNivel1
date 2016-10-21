package TrabajoPractico02;
import  TrabajoPractico02.Empleado;
import  TrabajoPractico02.Servicio;
import  TrabajoPractico02.Constantes;

public class Administrativo extends Empleado{
	private float sbruto;
	private float sneto;
	private int categoria;

	public Administrativo(int l, String n, String a, String ec, String s,String f, int c) {
		super(l, n, a, ec, s, f);
		this.setCategoria(c);
		this.setSbruto(Constantes.BASICO);
		this.setSneto(Constantes.BASICO);
		if(this.getEstadoCivil()==Constantes.CASADO) this.setSneto(Servicio.calculoPorcentual(this.getSbruto(),Constantes.ADDCASADOP));
		this.setSneto((Servicio.calculoPorcentual(this.getSbruto(),Constantes.DELJUBILATORIOP)) *-1);
		this.setSneto((Servicio.calculoPorcentual(this.getSbruto(),Constantes.DELSEGUROVP)) *-1);
	}

	@Override
	public String toString() {
			String empleado  = "Legajo: "+this.getLegajo();
			   empleado += "\nEmpleado: "+this.getApellido()+" "+this.getNombre();
			   empleado += "\nEstado Civil: "+this.getEstadoCivil();
			   empleado += "\nCategoria o Función: "+this.getCategoria();
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
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
}
