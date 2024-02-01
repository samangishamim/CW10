package utility;

import connection.DBConfig;
import repository.city.CityRepository;
import repository.city.CityRepositoryImpl;
import service.city.CityService;
import service.city.CityServiceImpl;

import java.sql.Connection;

public class ApplicationContext {
    private  static Connection CONNECTION;
    private  static CityRepository CITY_REPOSITORY;
    private  static CityService CITY_SERVICE;

    public static void initialize(){
        if (CONNECTION == null){
            CONNECTION= DBConfig.getConnection();
        }
        if (CITY_REPOSITORY == null){
            CITY_REPOSITORY= new CityRepositoryImpl(CONNECTION);
            CITY_SERVICE=new CityServiceImpl(CITY_REPOSITORY);
        }
    }

    public  static  CityService getCityService(){
        return CITY_SERVICE;
    }
}
