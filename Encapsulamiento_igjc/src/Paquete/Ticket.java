package Paquete;
import java.util.Date;

public class Ticket {
	
	String ubiccion;
	Date fechaHora;
	int folio;
	double monto;
	String cuentaOrigen;
	String cuentaDestino;
	
	
	public Ticket(String ubiccion, Date fechaHora, int folio, double monto, String cuentaOrigen, String cuentaDestino) {
		super();
		this.ubiccion = ubiccion;
		this.fechaHora = fechaHora;
		this.folio = folio;
		this.monto = monto;
		this.cuentaOrigen = cuentaOrigen;
		this.cuentaDestino = cuentaDestino;
	}
	public Ticket(String ubiccion, Date fechaHora, int folio, double monto, String numCuenta) {
		super();
		this.ubiccion = ubiccion;
		this.fechaHora = fechaHora;
		this.folio = folio;
		this.monto = monto;
		this.cuentaOrigen = numCuenta;
		
	}
	public String getUbiccion() {
		return ubiccion;
	}
	public void setUbiccion(String ubiccion) {
		this.ubiccion = ubiccion;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public String getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	@Override
	public String toString() {
		return "Tiket [ubiccion=" + ubiccion + ", fechaHora=" + fechaHora + ", folio=" + folio + ", monto=" + monto
				+ ", cuentaOrigen=" + cuentaOrigen + ", cuentaDestino=" + cuentaDestino + "]";
	}
	
	
	

}
	
	
	

