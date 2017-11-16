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
	 * Az id� k�r�kre osztott. Egy p�ly�n maxim�lisan MAXTICK id�egys�get lehet tart�zkodni. Ha ezt t�ll�pi valaki, akkor a j�t�k befejez�dik. Figyeljetek oda, ez egy nagyon sz�kre szabott id�keret, viszont ki is lehet haszn�lni teljes m�rt�kben.
	 *
	 * MAXTICK = 1000 + (p�lya sz�ma �mod� 500) * 10
	*/
	public int getMaxTick() {
		return 1000 + (serialNumber % 500) * 10;
	}
	
	
}
