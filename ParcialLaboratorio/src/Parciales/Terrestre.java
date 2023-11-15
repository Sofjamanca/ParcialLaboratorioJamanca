package Parciales;

public abstract class Terrestre extends Vehiculo {

}

class Auto extends Terrestre{
	private Motor miMotor;
	private Odometro miOdometro;
	private TanqueCombustible miTanque;
	
	public Auto(int capacidad)
	{
		this.miMotor = new Motor();
		this.miOdometro = new Odometro();
		this.miTanque = new TanqueCombustible(capacidad);
	}
	
	public void arrancarAuto() {
	}
	
	public void apagarAuto() {
	}
	
	public void avanzarAuto() {
	}
	
}

class Motor{
	private boolean enciendeMotor;
	
	public Motor()
	{
		this.enciendeMotor = false;
	}
	
	public void apagarMotor()
	{
		if(enciendeMotor == true)
		{
			enciendeMotor = false;
		}
	}
	
	public void encenderMotor()
	{
		if(enciendeMotor == false)
		{
			enciendeMotor = true;
		}
	}
	
	public boolean getEnciendeMotor() {
		return enciendeMotor;
	}
	
}

class Odometro{
	private int distanciaRecorrida;
	
	public Odometro()
	{
		this.distanciaRecorrida = 0;
	}
	
	
	public int getDistanciaRecorrida (){
		return distanciaRecorrida;
	}
	
	public void setDistanciaRecorrida(int distancia) {
		distanciaRecorrida = distancia;
	}
}

class TanqueCombustible{
	private int capacidadTanque;
	private double cantidadCombustibleTanque;
	
	
	public TanqueCombustible(int capacidad)
	{
		this.capacidadTanque = capacidad;
		this.cantidadCombustibleTanque = 0;
	}
	
	public void setCantidadCombustibleTanque(double cantidad)
	{
		cantidadCombustibleTanque = cantidad;
	}
	
	public double getCantidadCombustibleTanque()
	{
		return cantidadCombustibleTanque;
	}
	
	public void agregarCombustible(double cantidad)
	{
		double total;
		if(cantidad < 0)
		{
			System.out.println("La cantidad no puede ser menor a 0");
		}
		else {
			total = getCantidadCombustibleTanque() + cantidad;
			if(total > capacidadTanque)
			{
				System.out.println("No puede superar la capacidad del tanque, no se ha podido agregar");
			}
			else {
				this.cantidadCombustibleTanque = total;
			}
		}
	}
}