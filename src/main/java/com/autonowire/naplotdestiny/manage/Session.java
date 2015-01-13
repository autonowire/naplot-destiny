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

import com.autonowire.naplotdestiny.components.Ability;
import com.autonowire.naplotdestiny.components.Item;
import com.autonowire.naplotdestiny.components.UserType;


/**
 * Provides a session for the user to maintain all information.
 * @author Damon Jones
 *
 */
public class Session {
	String id;
	int posLength = -1;
	int posWidth = -1;
	int life;
	UserType userType;
	int coins;
	Ability[] abilities;
	Item[] items;
	
	public Session(UserType userType) {
		this.userType = userType;
		this.abilities = userType.getAbilities();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public UserType getUserType() {
		return userType;
	}
	public int getCoins() {
		return coins;
	}
	public void setCoins(int coins) {
		this.coins = coins;
	}
	public Ability[] getAbilities() {
		return abilities;
	}
	public void setAbilities(Ability[] abilities) {
		this.abilities = abilities;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
}
