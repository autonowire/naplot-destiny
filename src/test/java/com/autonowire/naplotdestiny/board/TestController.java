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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.autonowire.naplotdestiny.board.Board;
import com.autonowire.naplotdestiny.components.usertype.AirWizard;
import com.autonowire.naplotdestiny.manage.Controller;
import com.autonowire.naplotdestiny.manage.Session;

public class TestController {
	@Test
    public void testStartPositionInitialized() throws IOException {
		Board board = new Board(25, 25);
		Session session = new Session(new AirWizard());
		session.setId("W3432RW");
		Controller ctrl = new Controller(session, board);
		assertEquals(session.getPosLength(), board.getStartPosition()[0]);
		assertEquals(session.getPosWidth(), board.getStartPosition()[1]);
	}
	
	@Test
    public void testMoveUp() throws IOException {
		Board board = new Board(25, 25);
		Session session = new Session(new AirWizard());
		session.setId("W3432RW");
		Controller ctrl = new Controller(session, board);
		ctrl.move(Controller.UP);
		assertEquals(session.getPosLength(), 1);
		assertEquals(session.getPosWidth(), 0);
		
	}
	
	@Test
    public void testMoveUpRightDown() throws IOException {
		Board board = new Board(25, 25);
		Session session = new Session(new AirWizard());
		session.setId("W3432RW");
		Controller ctrl = new Controller(session, board);
		ctrl.move(Controller.UP);
		ctrl.move(Controller.RIGHT);
		ctrl.move(Controller.DOWN);
		assertEquals(session.getPosLength(), 0);
		assertEquals(session.getPosWidth(), 1);
		
	}
	
	@Test
    public void testBadMove() throws IOException {
		Board board = new Board(25, 25);
		Session session = new Session(new AirWizard());
		session.setId("W3432RW");
		Controller ctrl = new Controller(session, board);
		ctrl.move(Controller.LEFT);
		assertEquals(session.getPosLength(), 0);
		assertEquals(session.getPosWidth(), 0);
		
	}
	
	
}
