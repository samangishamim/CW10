import model.City;
import service.city.CityService;
import utility.ApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext.initialize();
        CityService cityService= ApplicationContext.getCityService();
        cityService.save(new City("tehran"));

    }
}
