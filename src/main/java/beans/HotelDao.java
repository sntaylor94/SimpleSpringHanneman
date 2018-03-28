package beans;

import java.util.List;

public interface HotelDao {

	public void insert(Hotel hotel);
	public void update(Hotel hotel);
	public void update(List<Hotel> hotels);
	public void delete(long hotelId);
	public Hotel find(long hotelId);
	public List<Hotel> find(List<Long> hotelIds);
	public List<Hotel> find(String hotelName);
	public List<Hotel> find(boolean booked);
}
