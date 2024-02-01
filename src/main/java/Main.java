import model.City;
import service.city.CityService;
import utility.ApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext.initialize();
        CityService cityService = ApplicationContext.getCityService();
        System.out.println("test");
//        cityService.save(new City("tehran"));

//        System.out.println(cityService.findById(1));
//        cityService.update(new City(1,"TEHRAN"));
//        cityService.delete(1);
    }
}
