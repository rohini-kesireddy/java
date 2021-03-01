
public class SuiteACRoom extends HotelRoom{
	private int ratePerSqFeet;

	public SuiteACRoom(String hotelName, Integer numberOfSqFeet, boolean hasTv, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTv, hasWifi);
		this.ratePerSqFeet = 15;
	}
	
}
