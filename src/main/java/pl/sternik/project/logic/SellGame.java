package pl.sternik.project.logic;

import java.util.ArrayList;
import java.util.List;

import pl.sternik.project.database.GameState;

public class SellGame implements IGame {
	List<Game> sellGame = new ArrayList<>();
	
	public SellGame(List<Game> list){
		for(Game i : list){
			if(i.getState().equals(GameState.SELL)){
				sellGame.add(i);
			}
		}
	}

	@Override
	public void updateGame(Integer iD) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGame(Integer iD) {
		// TODO Auto-generated method stub
		
	}
	
	
}
