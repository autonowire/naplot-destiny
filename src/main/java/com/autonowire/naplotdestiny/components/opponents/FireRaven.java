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
package com.autonowire.naplotdestiny.components.opponents;

import com.autonowire.naplotdestiny.components.Ability;
import com.autonowire.naplotdestiny.components.Opponent;
import com.autonowire.naplotdestiny.components.abilities.FireSpray;
import com.autonowire.naplotdestiny.components.abilities.PushAttack;

public class FireRaven implements Opponent {
	
	public String getName() {
		return "Fire Raven";
	}
	
	public String getDescription() {
		return "Fire Raven: Fire Bird of the Night";
	}
	
	public int getLife() {
		return 20;
	}
	
	public Ability[] getAbilities() {
		Ability[] abilities = {new FireSpray(), new PushAttack()};
		return abilities;
	}
	
	public String getImage() {
		return "http://fc09.deviantart.net/fs71/i/2013/160/a/d/fire_art_photo___raven_by_dejureinitiative-d68gtom.jpg";
	}
	
	public String getVideo() {
		return "http://fc09.deviantart.net/fs71/i/2013/160/a/d/fire_art_photo___raven_by_dejureinitiative-d68gtom.jpg";
	}
}
