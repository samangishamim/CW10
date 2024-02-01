package utility;

import connection.DBConfig;
import repository.city.CityRepository;
import repository.city.CityRepositoryImpl;
import repository.team.TeamRepository;
import repository.team.TeamRepositoryImpl;
import service.city.CityService;
import service.city.CityServiceImpl;
import service.team.TeamService;
import service.team.TeamServiceImpl;

import java.sql.Connection;

public class ApplicationContext {
    private  static Connection CONNECTION;
    private  static CityRepository CITY_REPOSITORY;
    private  static CityService CITY_SERVICE;
    private static TeamRepository TEAM_REPOSITORY;
    private static TeamService TEAM_SERVICE;


    public static void initialize(){
        if (CONNECTION == null){
            CONNECTION= DBConfig.getConnection();
        }
        if (CITY_REPOSITORY == null){
            CITY_REPOSITORY= new CityRepositoryImpl(CONNECTION);
            CITY_SERVICE=new CityServiceImpl(CITY_REPOSITORY);
        }
        if (TEAM_REPOSITORY == null){
            TEAM_REPOSITORY = new TeamRepositoryImpl(CONNECTION);
            TEAM_SERVICE = new TeamServiceImpl(TEAM_REPOSITORY);
        }
    }

    public  static  CityService getCityService(){
        return CITY_SERVICE;
    }
    public static TeamService getTeamService(){
        return TEAM_SERVICE;
    }
}
