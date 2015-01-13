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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.autonowire.naplotdestiny.board.Board;
import com.autonowire.naplotdestiny.board.Cell;

public class TestBoard {
	
	@Test
    public void testSetBoardCell() throws IOException {
		Board board = new Board(25, 25);
		Cell cell = new Cell();
		cell.setType(Cell.DIRT);
		boolean status = board.setCell(cell, 0, 0);
		assertTrue(status);
	}
	
	@Test
    public void testBoardCellFilled() throws IOException {
		Board board = new Board(25, 25);
		Cell cell = new Cell();
		cell.setType(Cell.GRASS);
		board.setCell(cell, 0, 0);
		Cell returnCell = board.getCell(0, 0);
		assertNotNull(returnCell);
	}
}
