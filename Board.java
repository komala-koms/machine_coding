package snake_and_ladder;

import java.util.*;
public class Board {

	private int board_size;
	private List<Snake> snakes;
	private List<Ladder> ladders;
	private List<Player> players;
	public Board(int board_size) {
		
		this.board_size = board_size;
		this.snakes = new ArrayList<Snake>();
		this.ladders = new ArrayList<Ladder>();
		this.players = new ArrayList<Player>();
	
	}
	public int getBoard_size() {
		return board_size;
	}
	public void setBoard_size(int board_size) {
		this.board_size = board_size;
	}
	public List<Snake> getSnakes() {
		return snakes;
	}
	public void setSnakes(List<Snake> snakes) {
		this.snakes = snakes;
	}
	public List<Ladder> getLadders() {
		return ladders;
	}
	public void setLadders(List<Ladder> ladders) {
		this.ladders = ladders;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	
}
