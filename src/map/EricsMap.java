package map;

import utils.Constants;

/**
 * representation of a Map /w available functions
 * */
public class EricsMap {
	
	private int[][] map = new int[Constants.ROWS][Constants.COLS];
	private int serialNumber;
	
	public EricsMap(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	/**	
	 * Az idõ körökre osztott. Egy pályán maximálisan MAXTICK idõegységet lehet tartózkodni. Ha ezt túllépi valaki, akkor a játék befejezõdik. Figyeljetek oda, ez egy nagyon szûkre szabott idõkeret, viszont ki is lehet használni teljes mértékben.
	 *
	 * MAXTICK = 1000 + (pálya száma ‘mod’ 500) * 10
	*/
	public int getMaxTick() {
		return 1000 + (serialNumber % 500) * 10;
	}
	
	
}
