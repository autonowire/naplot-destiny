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
package com.autonowire.naplotdestiny.components.abilities;

import com.autonowire.naplotdestiny.components.Ability;

public class FireSpray implements Ability {
	public String getName() {
		return "FireSpray";
	}
	public String getDescription() {
		return "A mist of fire capable of burning the opponent severely.";
	}
	public int getPower() {
		return 3;
	}
	public String getImage() {
		return "http://www.funonthenet.in/images/stories/forwards/Dust%20Storms/dust-storm-sudan.jpg";
	}
	public String getVideo() {
		return "http://www.funonthenet.in/images/stories/forwards/Dust%20Storms/dust-storm-sudan.jpg";
	}
}
