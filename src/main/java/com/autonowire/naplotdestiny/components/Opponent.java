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
package com.autonowire.naplotdestiny.components;


/**
 * Defines those that UserType has to battle in the game.
 * @author Damon Jones
 *
 */
public interface Opponent {

	public String getName();
	public String getDescription();
	public int getLife();
	public Ability[] getAbilities();
	public String getImage();
	public String getVideo();

}
