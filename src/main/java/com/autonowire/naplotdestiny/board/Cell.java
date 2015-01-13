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

import com.autonowire.naplotdestiny.components.Ability;
import com.autonowire.naplotdestiny.components.Item;
import com.autonowire.naplotdestiny.components.Opponent;


/**
 * Contains information about what exist in a part of the game board.
 * @author Damon Jones
 *
 */
public class Cell {
	public static final String GRASS = "GRASS";
	public static final String DIRT = "DIRT";
	public static final String TREE = "TREE";
	public static final String ROCK = "ROCK";
	String type;
	int posLength;
	int posWidth;
	Ability ability;
	Opponent opponent;
	Item item;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPosLength() {
		return posLength;
	}
	public void setPosLength(int posLength) {
		this.posLength = posLength;
	}
	public int getPosWidth() {
		return posWidth;
	}
	public void setPosWidth(int posWidth) {
		this.posWidth = posWidth;
	}
	public Ability getAbility() {
		return ability;
	}
	public void setAbility(Ability ability) {
		this.ability = ability;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Opponent getOpponent() {
		return opponent;
	}
	public void setOpponent(Opponent opponent) {
		this.opponent = opponent;
	}
}
