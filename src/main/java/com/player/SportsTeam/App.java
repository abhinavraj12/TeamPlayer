package com.player.SportsTeam;

import java.util.Scanner;

/**
 * Hello world!
 * 
 * manage a set of players in a sports team using the Set collection. 
	The application should allow adding players, removing players, checking if 
	a player is on the team, and displaying all players.
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Player p =  new Player();
       
        System.out.println("How many player you want to add: ");
        int n = sc.nextInt();
        
        for(int i=0;i<=n;i++) {
        	p.addPlayer(sc.nextLine());
        }
        System.out.println("Enter the player name which you want to remove: ");
        p.removePlayer(sc.nextLine());
        
        System.out.println("Enter the player name if you want to check player is present or not: ");
        String isPresent = sc.nextLine();
        if(p.isPlayerOnTeam(isPresent)) {
        	System.out.println("Player is present");
        } else {
        	System.out.println("Not Exist");
        }
        
        
        
        System.out.println("Enter 'display' if you want to display the player");
        String display = sc.nextLine();
        if(display.contains("display")) {
        	p.displayAllPlayers();	
        	
        } else {
        	System.out.println("Plese enter 'display' to display all the player");
        }
    }
}
