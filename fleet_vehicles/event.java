package fleet_vehicles;


abstract class event {
	private int vehicleId;
	
	public event(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	public int getvehicleId() { return vehicleId; }
}

//En esta clase se implementa la "D" de los métodos SOLID (Dependecy Inversion), el cual es una clase que esta en el intermedio de la clase vehicle y la clase controler_vehicle para su correcto funcionamiento.