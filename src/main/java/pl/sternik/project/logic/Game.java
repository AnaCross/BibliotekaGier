package pl.sternik.project.logic;

import pl.sternik.project.database.GameEdition;
import pl.sternik.project.database.GameState;

public class Game {
	
	private Integer iD;
	private String name;
	private String author;
	private String publish;
	private GameEdition edition;
	private Double price;
	private GameState state;
	private String description;
	private boolean isWishList;
	private boolean isLoan;
	
	

	public Game(Integer iD) {
		super();
		this.iD = iD;
	}

	public Game downloadGame() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addGame(){
		
	}
	
	public void updateGame(){
		
	}
	
	public boolean isWishList() {
		return isWishList;
	}

	public void setWishList(boolean isWishList) {
		this.isWishList = isWishList;
	}

	public boolean isLoan() {
		return isLoan;
	}

	public void setLoan(boolean isLoan) {
		this.isLoan = isLoan;
	}

	public Integer getiD() {
		return iD;
	}

	public void setiD(Integer iD) {
		this.iD = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public GameEdition getEdition() {
		return edition;
	}

	public void setEdition(GameEdition edition) {
		this.edition = edition;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public GameState getState() {
		return state;
	}

	public void setState(GameState state) {
		this.state = state;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
