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
package com.autonowire.naplotdestiny.manage;

import com.autonowire.naplotdestiny.board.Board;
import com.autonowire.naplotdestiny.board.Cell;


/**
 * Controls actions within the game.
 * @author Damon Jones
 *
 */
public class Controller {
	Session session;
	Board board;
	public static final String UP = "UP";
	public static final String DOWN = "DOWN";
	public static final String LEFT = "LEFT";
	public static final String RIGHT = "RIGHT";
	
	public Controller(Session session, Board board) {
		this.session = session;
		this.board = board;
		
		//Set session position to start of board
		//Put at start
		int[] startPos = board.getStartPosition();
		int length = startPos[0];
		int width = startPos[1];
		session.setPosLength(length);
		session.setPosWidth(width);
	}
	
	public Cell move(String cmd) {
		System.out.println("SESSOIN PRE: " + session.getPosLength() +
				", " +  session.getPosWidth());
		Cell cell = null;
		int length;
		int width;
		if (session.getPosLength() >= 0) {
			length = session.getPosLength();
			width = session.getPosWidth();
		} else {
			//Put at start
			int[] startPos = board.getStartPosition();
			length = startPos[0];
			width = startPos[1];
		}
			
		if (cmd.equals(UP)) {
			++length;
			
		} else if (cmd.equals(DOWN)) {
			--length;
		} else if (cmd.equals(LEFT)) {
			--width;
		} else if (cmd.equals(RIGHT)) {
			++width;
		}
		
		if (board.isPositionValid(length, width)) {
			session.setPosLength(length);
			session.setPosWidth(width);
			cell = board.getCell(length, width);
		} else {
			cell = board.getCell(session.getPosLength(),
					session.getPosWidth());
		}
		System.out.println("SESSOIN POST: " + session.getPosLength() +
				", " +  session.getPosWidth());
		return cell;
	}
}
