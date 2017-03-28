package pl.sternik.project.logic;

import java.util.ArrayList;
import java.util.List;

public class CollectionGame implements IGame {
	List<Game> collectionGame = new ArrayList<>();
	
	public CollectionGame(List<Game> list){
		collectionGame = list;
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
