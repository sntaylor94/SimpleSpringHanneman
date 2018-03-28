package beans;

public class HotelServiceImpl implements HotelService{
	
	private HotelDao hotelDao;
	
	public HotelDao getHotelDao() {
		return hotelDao;
	}
	
	public void setHotelDao(HotelDao hotelDao) {
		this.hotelDao = hotelDao;
	}
	
	public void addRooms(long hotelId, int numRooms) {
		Hotel hotel = hotelDao.find(hotelId);
		
		hotel.setRooms(hotel.getRooms()+numRooms);
		
		hotelDao.update(hotel);
	}
	
	public void changePrice(long hotelId, double price) {
		Hotel hotel = hotelDao.find(hotelId);
		
		hotel.setPricePerNight(price);
		
		hotelDao.update(hotel);
	}
	
	public Hotel getHotel(long hotelId) {
		return hotelDao.find(hotelId);
	}
}
