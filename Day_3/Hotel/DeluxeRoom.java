
public class DeluxeRoom extends HotelRoom {
	private Integer ratePerSqFeet;

	public DeluxeRoom(String hotelName, Integer numberOfSqFeet, boolean hasTv, boolean hasWifi, Integer ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		this.ratePerSqFeet = ratePerSqFeet;
	}
	
	public int getRatePerSqFeet() {
		if()
			return (ratePerSqFeet+2);
		else
			return ratePerSqFeet;
	}
	
}
