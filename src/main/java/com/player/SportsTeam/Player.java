package com.player.SportsTeam;

import java.util.HashSet;
import java.util.Set;

public class Player {
	 private Set<String> players;

	    public Player() {
	        players = new HashSet<String>();
	    }

	    // Add a player to the team
	    public void addPlayer(String playerName) {
	        players.add(playerName);
	    }

	    // Remove a player from the team
	    public void removePlayer(String playerName) {
	        players.remove(playerName);
	    }

	    // Check if a player is on the team
	    public boolean isPlayerOnTeam(String playerName) {
	        return players.contains(playerName);
	    }

	    // Display all players in the team
	    public void displayAllPlayers() {
	        System.out.println("Players in the team:");
	        for (String player : players) {
	            System.out.println(player);
	        }
	    }
}
