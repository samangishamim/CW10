import model.City;
import model.Contract;
import model.Player;
import model.Team;
import service.city.CityService;
import service.contract.ContractService;
import service.player.PlayerService;
import service.team.TeamService;
import utility.ApplicationContext;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

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
//        PlayerService playerService = ApplicationContext.getPlayerService();
//        playerService.save(new Player("farhad" , new BigDecimal("250000"), 1));
//        playerService.save(new Player("asghar" , new BigDecimal("500000"), 1));
//        playerService.save(new Player("ali" , new BigDecimal("450000"), 1));
//        playerService.save(new Player("mohammad" , new BigDecimal("600000"), 1));
//        playerService.save(new Player("ahmad" , new BigDecimal("550000"), 1));
        //System.out.println(playerService.findById(2));
        //playerService.update(new Player(2 , "asghar" , new BigDecimal("300000") , 2));
        //playerService.delete(2);

//        ArrayList<Player> players = playerService.listOfPlayer();
//        for (Player player : players) {
//            System.out.println(player);
//        }

        // todo : test contract
        ContractService contractService = ApplicationContext.getContractService();
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("7500000") ));
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("400000") ));
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("550000") ));
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("450000") ));
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("300000") ));
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("350000") ));
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("700000") ));
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("350000") ));
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("720000") ));
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("150000") ));
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("250000") ));
//        contractService.save(new Contract(Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("400000") ));

//        System.out.println(contractService.findById(1));
//        contractService.update(new Contract(6,Date.valueOf("1401-01-01"),Date.valueOf("1402-01-01"),
//                new BigDecimal("330000")));
//        contractService.delete(6);
    }
}
