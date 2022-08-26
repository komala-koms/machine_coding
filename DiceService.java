package snake_and_ladder;

import java.util.*;

public class DiceService {

	public static int roll()
	{
		return new Random().nextInt(6)+1;
	}
}
