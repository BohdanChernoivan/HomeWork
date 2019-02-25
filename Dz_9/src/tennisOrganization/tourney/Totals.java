package tennisOrganization.tourney;

import tennisOrganization.league.LeagueType;
import tennisOrganization.managerOrganization.ArrayPlayers;
import tennisOrganization.players.Player;

import java.util.LinkedList;


public class Totals {

    Player player = new Player();

    LinkedList<ArrayPlayers<Player>> playersLinkedList = new LinkedList<>();

    public void results(Tourney tourney) {

        tourney.transition();
        System.out.println("---------------------------------------");
        System.out.println("In the Bronze league left = " + tourney.getLeagueFactory().findLeagues(LeagueType.Bronze).getArrayPlayers().size() + " Players!");
        System.out.println("In the Silver league left = " + tourney.getLeagueFactory().findLeagues(LeagueType.Silver).getArrayPlayers().size() + " Players!");
        System.out.println("In the Gold league left = " + tourney.getLeagueFactory().findLeagues(LeagueType.Gold).getArrayPlayers().size() + " Players!");

        tourney.setPlayersAll();

        playersLinkedList.addAll(tourney.getPlayersAll());

        for (int i = 0; i < playersLinkedList.size(); i++) {



            if (playersLinkedList.get(i).getPlayer().getPoint() > playersLinkedList.listIterator(playersLinkedList.size() - i).previous().getPlayer().getPoint()) {
                player = playersLinkedList.get(i).getPlayer();
            } else
                player =  playersLinkedList.listIterator(playersLinkedList.size() - i).previous().getPlayer();

//TODO: Необходимо реализовать поддержку нахождения самого лучшего игрока, самого молодого, 3 лучших игроков турнира, лучших игроков каждой лиги, лучших игроков нескольких сезонов, самого результативного игрока по количеству выигранных сетов внутри матчей
        }
        System.out.println("Best player = " + player.getName() + " him " + player.getAge() + ". His result points = " + player.getPoint());

    }

}
