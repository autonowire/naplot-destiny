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
package com.autonowire.naplotdestiny.ui;

import java.util.Scanner;

import com.autonowire.naplotdestiny.board.Board;
import com.autonowire.naplotdestiny.board.Cell;
import com.autonowire.naplotdestiny.components.abilities.AquaStorm;
import com.autonowire.naplotdestiny.components.abilities.WindWall;
import com.autonowire.naplotdestiny.components.opponents.FireRaven;
import com.autonowire.naplotdestiny.components.opponents.SnowLepord;
import com.autonowire.naplotdestiny.components.usertype.AirWizard;
import com.autonowire.naplotdestiny.manage.Controller;
import com.autonowire.naplotdestiny.manage.Session;

public class TextUI {

	public static void main(String[] args) {
		TextUI ui = new TextUI();
		Board board = ui.buildBoard();
		Session session = new Session(new AirWizard());
		session.setId("W3432RW");
		Controller ctrl = new Controller(session, board);
		Cell cell = board.getCell(session.getPosLength(), session.getPosWidth());
		ui.printPosition(cell);
		ui.printMap(board, cell.getPosLength(), cell.getPosWidth());
		
		while (true) {
			String command = ui.requestCommand();
			cell = ctrl.move(command);
			ui.printPosition(cell);
			ui.printMap(board, cell.getPosLength(), cell.getPosWidth());
		}


	}
	
	public String requestCommand() {
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine();
		return command;
	}
	
	public void printPosition(Cell cell) {
		System.out.println("Type: " + cell.getType());
		System.out.println("Pos:  " + cell.getPosLength() + ", " + 
		cell.getPosWidth());
		if (cell.getAbility() != null) {
			System.out.println("Ability Found: " + cell.getAbility().getName());
		} 
		if (cell.getItem() != null) {
			System.out.println("Item Found: " + cell.getItem().getName());
		}
		if (cell.getOpponent() != null) {
			System.out.println("Opponent Found: " + cell.getOpponent().getName());
		}
	}
	
	public void printMap(Board board, int x, int y) {
		for(int i=0; i < board.getLengthSize(); ++i) {
			for (int j=0; j < board.getWidthSize(); ++j) {
				if (i == (board.getLengthSize() - 1 - x) 
						&& j == y) {
					System.out.print("[*]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println("");
		}
		
	}
	
	public Board buildBoard() {
		Board board = new Board(5,5);
		Cell cell1 = board.getCell(0, 0);
		cell1.setType(Cell.GRASS);
		cell1.setAbility(new AquaStorm());
		board.setCell(cell1, 0, 0);
		
		Cell cell2 = board.getCell(0, 2);
		cell2.setType(Cell.GRASS);
		cell2.setOpponent(new FireRaven());
		board.setCell(cell2, 0, 2);
		
		Cell cell3 = board.getCell(1, 3);
		cell3.setType(Cell.TREE);
		cell3.setOpponent(new SnowLepord());
		board.setCell(cell3, 1, 3);
		
		Cell cell4 = board.getCell(2, 2);
		cell4.setType(Cell.ROCK);
		cell4.setAbility(new WindWall());
		board.setCell(cell4, 2, 2);
		
		Cell cell5 = board.getCell(2, 4);
		cell5.setType(Cell.DIRT);
		cell5.setOpponent(new SnowLepord());
		board.setCell(cell5, 2, 4);
		
		Cell cell6 = board.getCell(3, 1);
		cell6.setType(Cell.GRASS);
		cell6.setOpponent(new SnowLepord());
		board.setCell(cell6, 3, 1);
		
		Cell cell7 = board.getCell(4, 4);
		cell7.setType(Cell.GRASS);
		cell7.setOpponent(new FireRaven());
		board.setCell(cell7, 4, 4);
		
		Cell cell8 = board.getCell(2, 0);
		cell8.setType(Cell.GRASS);
		cell8.setAbility(new WindWall());
		board.setCell(cell8, 2, 0);
		return board;
	}
}
