package snake_and_ladder;

import java.util.*;
public class Driver {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no_of_snakes,no_of_ladders,no_of_players;
		System.out.println("Enter no of snakes");
		no_of_snakes = sc.nextInt();
		List<Snake> snakes = new ArrayList<Snake>();
		List<Ladder> ladders = new ArrayList<Ladder>();
		List<Player> players = new ArrayList<Player>();
		for(int i=0;i<no_of_snakes;i++)
		{
			snakes.add(new Snake(sc.nextInt(),sc.nextInt()));
		}
		System.out.println("Enter no of ladders");
		no_of_ladders = sc.nextInt();
		for(int i=0;i<no_of_ladders;i++)
		{
			ladders.add(new Ladder(sc.nextInt(),sc.nextInt()));
		}
		System.out.println("Enter no of Players");
		no_of_players = sc.nextInt();
		for(int i=0;i<no_of_players;i++)
		{
			players.add(new Player(sc.next(),0));
		}
		SnakeAndLadderService sals = new SnakeAndLadderService();
		sals.setLadders(ladders);
		sals.setPlayers(players);
		sals.setPlayers(players);
		sals.startGame();
	}
}
