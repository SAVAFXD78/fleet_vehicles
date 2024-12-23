package fleet_vehicles;



public class vehicle {
	private int vehicleId;
	private String plaque;
	private String brand;
	private String model;
	
	
	public vehicle(int vehicleId, String plaque, String brand, String model) {
		this.vehicleId = vehicleId;
		this.plaque = plaque;
		this.brand = brand;
		this.model=model;
	}
	
	public int getvehicleId() { return vehicleId; }
	public String getplaque() {return plaque;}
	public String getbrand() { return brand;}
	public String getmodel() { return model;}
}

//Esta clase se encarga de recolectar únicamente los datos de los vehiculos; recolectando datos como lo son el id, la placa, la marca y el modelo.

//Aquí se aplica la "S" de los métodos SOLID (Single Responsability).

    

