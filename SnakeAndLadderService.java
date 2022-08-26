package snake_and_ladder;

import java.util.*;
public class SnakeAndLadderService {
	Board board  = new Board(100);
	DiceService dice;
	private Queue<Player> players; 
	public void setSnakes(List<Snake> snakes) {
		this.board.setSnakes(snakes); // Add snakes to board
    }

    public void setLadders(List<Ladder> ladders) {
        board.setLadders(ladders); // Add ladders to board
    }
    
    public void setPlayers(List<Player> players)
    {
    	this.players = new LinkedList<Player>();
		for(Player player:players)
		{
			this.players.add(player);
		}
    	board.setPlayers(players);
    }
    public int checkWithSnakeAndLadder(int new_position)
    {
    	int prev_position;
    	do
    	{
    		prev_position = new_position;
    		for(Snake snake:board.getSnakes())
    		{
    			if(snake.getStart() == prev_position)
    			{
    				new_position = snake.getEnd();
    				System.out.println("bit by snake from "+prev_position+" to "+new_position);
    			}
    		}
    		for(Ladder ladder:board.getLadders())
    		{
    			if(ladder.getStart() == prev_position)
    			{
    				new_position = ladder.getEnd();
    				System.out.println("ladder from "+prev_position+" to "+new_position);
    			}
    		}
    	}while(prev_position!=new_position);
    	
    	return new_position;
    }
    public void movePlayer(Player current_player,int dice_value)
    {
    	int old_position = current_player.getPosition();
    	int new_position = old_position + dice_value;
    	if(new_position >100)
    		new_position = old_position;
    	else
    		new_position = checkWithSnakeAndLadder(new_position);
    	current_player.setPosition(new_position);
    	
    	System.out.println("Player "+current_player.getName()+" rolled a dice "+dice_value + 
    			"and move from "+old_position+" to "+new_position);
    }
	public void startGame()
	{
		while(true)
		{
			int value = this.dice.roll();
			Player current_player = players.poll();
			movePlayer(current_player,value);
			if(current_player.getPosition() == 100)
			{
				System.out.println(current_player.getName()+" has won the game");
				break;
			}
			players.add(current_player);
		}
	}
}
