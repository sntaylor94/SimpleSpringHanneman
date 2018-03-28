package beans;

public class Hotel {
	private long id;
	private String hotelName;
	private double pricePerNight;
	private int rooms;
	private boolean booked;
	
	public Hotel() {
		
	}
	
	public Hotel(long id, String hotelName, double pricePerNight, int rooms) {
		this.setId(id);
		this.setHotelName(hotelName);
		this.setPricePerNight(pricePerNight);
		this.setRooms(rooms);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public boolean isBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}
}
