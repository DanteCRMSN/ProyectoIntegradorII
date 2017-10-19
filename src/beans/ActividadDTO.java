package beans;

import java.sql.Date;

public class ActividadDTO 
{
	private int codigo;
	private int cod_institucion;
	private String nombre;
	private String nom_institucion;
	private String descripcion;
	private Date fecha;
	private String horaInicio;
	private String horaFin;
	private String cod_docente;
	private String nom_docente;
	private int codEstado;
	private String nombreEstado;
	private String motivoEstado;
	
	private int[] vacantes; // en 0:min en 1: max
	

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCod_institucion() {
		return cod_institucion;
	}
	public void setCod_institucion(int cod_institucion) {
		this.cod_institucion = cod_institucion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNom_institucion() {
		return nom_institucion;
	}
	public void setNom_institucion(String nom_institucion) {
		this.nom_institucion = nom_institucion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	public String getCod_docente() {
		return cod_docente;
	}
	public void setCod_docente(String cod_docente) {
		this.cod_docente = cod_docente;
	}
	public String getNom_docente() {
		return nom_docente;
	}
	public void setNom_docente(String nom_docente) {
		this.nom_docente = nom_docente;
	}
	public int getCodEstado() {
		return codEstado;
	}
	public void setCodEstado(int codEstado) {
		this.codEstado = codEstado;
	}
	public String getNombreEstado() {
		return nombreEstado;
	}
	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}
	public String getMotivoEstado() {
		return motivoEstado;
	}
	public void setMotivoEstado(String motivoEstado) {
		this.motivoEstado = motivoEstado;
	}
	
	
	
	
	public ActividadDTO() {
		super();
		vacantes = new int[2];
	}
	public int getVacantesMin() {
		return vacantes[0];
	}
	
	public int getVacantesMax() {
		return vacantes[1];
	}
	public void setVacantesMin(int vacantesMin) {
		this.vacantes[0] = vacantesMin;
	}
	
	public void setVacantesMax(int vacantesMax) {
		this.vacantes[0] = vacantesMax;
	}
	
	
	
}
