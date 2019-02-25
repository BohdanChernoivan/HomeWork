package tennisOrganization.tourney;

import tennisOrganization.league.LeagueType;
import tennisOrganization.league.type.Bronze;
import tennisOrganization.league.type.Gold;
import tennisOrganization.league.type.Silver;
import tennisOrganization.managerOrganization.ArrayPlayers;
import tennisOrganization.players.Player;

import java.util.LinkedList;


public class Totals {

    private Player player = new Player();

    LinkedList<ArrayPlayers<Player>> playersLinkedList = new LinkedList<>();

    public void results(Tourney tourney) {

        tourney.transition();
        System.out.println("---------------------------------------");
        System.out.println("In the Bronze league left = " + tourney.getLeagueFactory().findLeagues(LeagueType.Bronze).getArrayPlayers().size() + " Players!");
        System.out.println("In the Silver league left = " + tourney.getLeagueFactory().findLeagues(LeagueType.Silver).getArrayPlayers().size() + " Players!");
        System.out.println("In the Gold league left = " + tourney.getLeagueFactory().findLeagues(LeagueType.Gold).getArrayPlayers().size() + " Players!");

        tourney.setPlayersAll();

        playersLinkedList.addAll(tourney.getPlayersAll());

        player = playersLinkedList.get(0).getPlayer();

        System.out.println("---------------------------------------");
        for (ArrayPlayers x: tourney.getPlayersAll()) {
            if(player.getPoint() < x.getPlayer().getPoint()) {
            player = x.getPlayer(); }
        }

        System.out.println("Best player = " + player.getName() + " him " + player.getAge() + ". His result points = " + player.getPoint() + ". LEAGUE = " + player.getLeague());


        for (ArrayPlayers x: tourney.getPlayersAll()) {
            if(player.getAge() > x.getPlayer().getAge()) {
                player = x.getPlayer(); }
        }

        System.out.println("The youngest player = " + player.getName() + " him " + player.getAge() +  ". LEAGUE = " + player.getLeague());



        Player playerBronze;
        playerBronze = tourney.leagueFactory.findLeagues(LeagueType.Bronze).getArrayPlayers().get(0).getPlayer();

        for (ArrayPlayers x : tourney.getPlayersAll()) {
            if (playerBronze.getPoint() < x.getPlayer().getPoint()) {
                if (x.getPlayer().getLeague().equals(new Bronze().getName())) {
                    playerBronze = x.getPlayer();
                }
            }
        }
        System.out.println("Best player " + tourney.leagueFactory.findLeagues(LeagueType.Bronze).getName() + " league = " + playerBronze.getName() + ", him " + playerBronze.getAge() + ". His result points = " + playerBronze.getPoint() + ". League = " + playerBronze.getLeague());


        Player playerSilver;
        playerSilver = tourney.leagueFactory.findLeagues(LeagueType.Silver).getArrayPlayers().get(0).getPlayer();

        for (ArrayPlayers x : tourney.getPlayersAll()) {
            if (playerSilver.getPoint() < x.getPlayer().getPoint()) {
                if (x.getPlayer().getLeague().equals(new Silver().getName())) {
                    playerSilver = x.getPlayer();
                }
            }
        }
        System.out.println("Best player " + tourney.leagueFactory.findLeagues(LeagueType.Silver).getName() + " league = " + playerSilver.getName() + ", him " + playerSilver.getAge() +  ". His result points = " + playerSilver.getPoint() + ". League = " + playerSilver.getLeague());


        Player playerGold;
        playerGold = tourney.leagueFactory.findLeagues(LeagueType.Gold).getArrayPlayers().get(0).getPlayer();

        for (ArrayPlayers x : tourney.getPlayersAll()) {
            if (playerGold.getPoint() < x.getPlayer().getPoint()) {
                if (x.getPlayer().getLeague().equals(new Gold().getName())) {
                    playerGold = x.getPlayer();
                }
            }
        }
        System.out.println("Best player " + tourney.leagueFactory.findLeagues(LeagueType.Gold).getName() + " league = " +  playerGold.getName() + ", him " + playerBronze.getAge()  + ". His result points = " + playerGold.getPoint() + ". League = " + playerGold.getLeague());

    }

}
