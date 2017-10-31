package Parqueadero.clases.good.be.alejo;

public class Parqueadero {
	private int id;
	private String direccion;
	private String telefono;
	public final int MAX_CAPACIDAD_CARROS=20;
	public final int MAX_CAPACIDAD_MOTOS=10;
	private int puestosDisponiblesCarros;
	private int puestosDisponiblesMotos;
	private String[] zonaParqueoMotos;
	private String[] zonaParqueCarros;
	public final double PRECIO_HORA_MOTO=500;
	public final double PRECIO_HORA_CARRO=1000;
	public final double PRECIO_DIA_MOTO=600;
	public final double PRECIO_DIA_CARRO=8000;
	public final double incrementoCilindrajeMayor=2000;
}
