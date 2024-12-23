package fleet_vehicles;

public class updatedLocation extends event{
	
	private String location;

	public updatedLocation(int getvehicleId, String location) {
		super(getvehicleId);
		this.location = location;
	}
	
	public String location() { return location;}


	
}

//En esta clase se implementa la "O" de los métodos SOLID (Open - Close), ya que este al igual que los demas es un código cerrado para su modificación pero abierto para su expansión.