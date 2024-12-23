package fleet_vehicles;

import java.util.ArrayList;
import java.util.List;

public class controler_vehicle{
	private vehicle vehicle;
	private String location;
	private List<observer>observer = new ArrayList<>();
	
	public controler_vehicle (vehicle vehicle, String location) {
		this.vehicle = vehicle;
		this.location = location;
	}
	
	public void update(String location) {
		this.location = location;
		notify(new updatedLocation(this.vehicle.getvehicleId(),location));
	}
	
	public vehicle getvehicle() {return vehicle;}
	public String location() {return location;}
	
	public void add(observer observer) {
		((controler_vehicle) observer).add(observer);
	}
	
	public void remove(observer observer) {
		((controler_vehicle) observer).remove(observer);
	}
	
	public void notify (event event) {
		for (observer observer : observer) {
			observer.update(event);
		}
	}
}

//En esta clase lo que se busca hacer es que si la ubicación de un vehiculo cambia, pues esta sera informada.

//En esta clase se implementa la "I" de los métodos SOLID (Interface Segregation), el cual vemos que esta se conecta con las interfaces necesarias para su funcionamiento.


