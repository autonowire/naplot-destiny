/**
 * Copyright (c) AutonoWire
 * 
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 * 
 **/
package com.autonowire.naplotdestiny.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Creates a game board which contains cells of information.
 * @author Damon Jones
 *
 */
public class Board {
	Logger logger = LoggerFactory.getLogger(Board.class);
	int lengthSize;
	int widthSize;
	int startLength = 0;
	int startWidth = 0;
	Cell[][] cellBoard;
	
	public Board(int length, int width) {
		lengthSize = length;
		widthSize = width;
		cellBoard = new Cell[length][width];
		prePopulateBoard();
	}
	
	public boolean setCell(Cell cell, int x, int y){
		if (cellBoard[x][y] != null) {
			cellBoard[x][y] = cell;
			return true;
		} else {
			return false;
		}
	}
	
	public Cell getCell(int x, int y) {
		if (cellBoard[x][y] != null) {
			return cellBoard[x][y];
		} else {
			logger.warn("User has selected a non existent cell: {}, {}", x, y);
			return null;
		}
	}
	
	public void setStartPosition(int length, int width) {
		startLength = length;
		startWidth = width;
	}
	
	public int[] getStartPosition() {
		int[] start = new int[2];
		start[0] = startLength;
		start[1] = startWidth;
		
		return start;
	}
	
	public boolean isPositionValid(int length, int width) {
		if (length < 0 || length >= lengthSize || width < 0 || width >= widthSize) {
			logger.debug("Into the negative: {}, {}", length, width);
			return false;
		} else {
			Cell cell = cellBoard[length][width];
			if (cell == null) {
				logger.debug("Cell is null.");
				return false;
			} else {
				logger.debug("Cell is ok.");
				return true;
			}
		}
	}
	
	
	
	public int getLengthSize() {
		return lengthSize;
	}

	public void setLengthSize(int lengthSize) {
		this.lengthSize = lengthSize;
	}

	public int getWidthSize() {
		return widthSize;
	}

	public void setWidthSize(int widthSize) {
		this.widthSize = widthSize;
	}

	private void prePopulateBoard() {
		for (int i=0; i < lengthSize; ++i) {
			for (int j=0; j < widthSize; ++j) {
				Cell cell = new Cell();
				cell.setType(Cell.DIRT);
				cell.setPosLength(i);
				cell.setPosWidth(j);
				cellBoard[i][j] = cell;
			}
		}
	}
}
