package beans;

public interface HotelService {
	public void addRooms(long hotelId, int numberOfRooms);
	public void changePrice(long hotelId, double newRoomPrice);
	public Hotel getHotel(long hotelId);
}
