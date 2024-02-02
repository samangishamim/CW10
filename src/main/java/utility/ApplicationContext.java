package utility;

import connection.DBConfig;
import repository.city.CityRepository;
import repository.city.CityRepositoryImpl;
import repository.match.MatchRepository;
import repository.match.MatchRepositoryImpl;
import repository.player.PlayerRepository;
import repository.player.PlayerRepositoryImpl;
import repository.stadium.StadiumRepository;
import repository.stadium.StadiumRepositoryImpl;
import repository.team.TeamRepository;
import repository.team.TeamRepositoryImpl;
import service.city.CityService;
import service.city.CityServiceImpl;
import service.match.MatchService;
import service.match.MatchServiceImpl;
import service.player.PlayerService;
import service.player.PlayerServiceImpl;
import service.stadium.StadiumService;
import service.stadium.StadiumServiceImpl;
import service.team.TeamService;
import service.team.TeamServiceImpl;

import java.sql.Connection;

public class ApplicationContext {
    private  static Connection CONNECTION;
    private  static CityRepository CITY_REPOSITORY;
    private  static CityService CITY_SERVICE;
    private static TeamRepository TEAM_REPOSITORY;
    private static TeamService TEAM_SERVICE;
    private static PlayerRepository PLAYER_REPOSITORY ;
    private static PlayerService PLAYER_SERVICE ;
    private static StadiumRepository STADIUM_REPOSITORY;
    private static StadiumService  STADIUM_SERVICE;
    private static MatchRepository MATCH_REPOSITORY;
    private static MatchService MATCH_SERVICE;


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
        if (PLAYER_REPOSITORY == null){
            PLAYER_REPOSITORY = new PlayerRepositoryImpl(CONNECTION);
            PLAYER_SERVICE = new PlayerServiceImpl(PLAYER_REPOSITORY);
        }
        if (STADIUM_REPOSITORY==null){
            STADIUM_REPOSITORY = new StadiumRepositoryImpl(CONNECTION);
            STADIUM_SERVICE =new StadiumServiceImpl(STADIUM_REPOSITORY);
        }
        if(MATCH_REPOSITORY==null){
            MATCH_REPOSITORY=new MatchRepositoryImpl(CONNECTION);
            MATCH_SERVICE=new MatchServiceImpl(MATCH_REPOSITORY);
        }
    }

    public  static  CityService getCityService(){
        return CITY_SERVICE;
    }
    public static TeamService getTeamService(){
        return TEAM_SERVICE;
    }
    public static PlayerService getPlayerService(){
        return PLAYER_SERVICE;
    }
    public static StadiumService getStadiumService(){
        return STADIUM_SERVICE;
    }
    public static MatchService getMatchService(){
        return MATCH_SERVICE;
    }
}
