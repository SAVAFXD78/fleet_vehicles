package fleet_vehicles;

public class administrator implements observer {
	private String name;
	
	public administrator(String name) {
		this.name = name;
	}

	@Override
	public void update(event event) {
		if (event instanceof updatedLocation) {
			updatedLocation locationEvent = (updatedLocation)event;
			System.out.println("Dueño del vehiculo: " + name + ", vehiculo " + locationEvent.getvehicleId() + " la ubicación ha sido actualizada a " + locationEvent.location());
		}
		
	}
	
	
	

}

//Esta clase se encarga de mostrar la información de un administrador(dueño) de un vehiculo registrado.

//Esta aplica la "L" de los métodos SOLID(Liskov substitution), el cual utilizamos una clase administrador que se conecta a la clase "location" y esta a su vez se conecta a la clase "vehicle"; la cual presenta una conexion con la clase "controler_vehicle".

