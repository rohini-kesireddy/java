
public class HotelRoom {
	private String hotelName;
	private Integer numberOfSqFeet;
	private boolean hasTv;
	private boolean hasWifi;
	
	public HotelRoom(String hotelName, Integer numberOfSqFeet, boolean hasTv, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTv = hasTv;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff(int sqfeet, int cost) {
		return 0;
	}
	
	public int getRatePerSqFeet(){
		
		return 0;
	}
}
