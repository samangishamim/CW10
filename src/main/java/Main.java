import model.City;
import model.Player;
import model.Team;
import service.city.CityService;
import service.player.PlayerService;
import service.team.TeamService;
import utility.ApplicationContext;

import java.math.BigDecimal;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext.initialize();
        // todo : test city
//        CityService cityService = ApplicationContext.getCityService();
//        cityService.save(new City("tehran"));

//        System.out.println(cityService.findById(1));
//        cityService.update(new City(1,"TEHRAN"));
//        cityService.delete(1);

        // todo : test team
       // TeamService teamService = ApplicationContext.getTeamService();
       // teamService.save(new Team("Real" , 1));
       // teamService.save(new Team("Barcelona" , 1));
       // System.out.println(teamService.findById(2));
       // teamService.update(new Team(2,"Real Madrid" , 1));
       // teamService.delete(3);

        // todo : test player
        PlayerService playerService = ApplicationContext.getPlayerService();
        //playerService.save(new Player("farhad" , new BigDecimal("250000"), 2));
//        playerService.save(new Player("asghar" , new BigDecimal("500000"), 2));
//        playerService.save(new Player("ali" , new BigDecimal("450000"), 2));
//        playerService.save(new Player("mohammad" , new BigDecimal("600000"), 2));
//        playerService.save(new Player("ahmad" , new BigDecimal("550000"), 2));
        //System.out.println(playerService.findById(2));
        //playerService.update(new Player(2 , "asghar" , new BigDecimal("300000") , 2));
        //playerService.delete(2);
    }
}
