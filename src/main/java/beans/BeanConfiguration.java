package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public HotelDao hotelDao() {
		HotelDaoInMemoryImpl bean = new HotelDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public HotelService hotelService() {
		HotelServiceImpl bean = new HotelServiceImpl();
		bean.setHotelDao(hotelDao());
		return bean;
	}
}
