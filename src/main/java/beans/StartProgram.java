package beans;

import java.text.DecimalFormat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartProgram {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		HotelService hotelService = applicationContext.getBean("hotelService", HotelService.class);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Before adding rooms and changing room price");
		System.out.println("Hotel: " + hotelService.getHotel(1).getHotelName()
				+ " Rooms: " + hotelService.getHotel(1).getRooms()
				+ " Price: $" + df.format(hotelService.getHotel(1).getPricePerNight()));
		System.out.println("Hotel: " + hotelService.getHotel(2).getHotelName()
				+ " Rooms: " + hotelService.getHotel(2).getRooms()
				+ " Price: $" + df.format(hotelService.getHotel(2).getPricePerNight()));
		
		hotelService.addRooms(1, 20);
		hotelService.changePrice(1, 165.55);
		hotelService.addRooms(2, 35);
		hotelService.changePrice(2, 95.00);
		
		System.out.println("After adding rooms and changing room price");
		System.out.println("Hotel: " + hotelService.getHotel(1).getHotelName()
				+ " Rooms: " + hotelService.getHotel(1).getRooms()
				+ " Price: $" + df.format(hotelService.getHotel(1).getPricePerNight()));
		System.out.println("Hotel: " + hotelService.getHotel(2).getHotelName()
				+ " Rooms: " + hotelService.getHotel(2).getRooms()
				+ " Price: $" + df.format(hotelService.getHotel(2).getPricePerNight()));
		
		applicationContext.close();
	}
}
