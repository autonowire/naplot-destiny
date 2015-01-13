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
package com.autonowire.naplotdestiny.components.usertype;

import com.autonowire.naplotdestiny.components.Ability;
import com.autonowire.naplotdestiny.components.UserType;
import com.autonowire.naplotdestiny.components.abilities.PushAttack;
import com.autonowire.naplotdestiny.components.abilities.WindWall;

public class AirWizard implements UserType {
	
	public String getName() {
		return "Altimus";
	}
	public String getDescription() {
		return "Junior Air Wizard";
	}
	public Ability[] getAbilities() {
		Ability[] abilities = {new WindWall(), new PushAttack()};
		return abilities;
	}
	public String getImage() {
		return "http://img2.wikia.nocookie.net/__cb20110122144610/runescape/images/1/1d/Air_Wizard.png";
	}
	
	public String getVideo() {
		return "http://img2.wikia.nocookie.net/__cb20110122144610/runescape/images/1/1d/Air_Wizard.png";
	}

}
