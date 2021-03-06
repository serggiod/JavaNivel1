package TrabajoPractico01;

public class Empleado {

	private int legajo;
	private String nombre;
	private String apellido;
	private String estadoCivil;
	private String sexo;
	
	public Empleado(int l, String n, String a, String ec, String s){
		this.setLegajo(l);
		this.setNombre(n);
		this.setApellido(a);
		this.setEstadoCivil(ec);
		this.setSexo(s);
	}
	
	public final String toString(){
		String string  = "|  "+this.getApellido()+" "+this.getNombre();
			   string += "  |  "+this.getLegajo();
			   string += "  |  "+this.getEstadoCivil();
			   string += "  |  "+this.getSexo();
			   string += "  |";
		return string;
	}
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
