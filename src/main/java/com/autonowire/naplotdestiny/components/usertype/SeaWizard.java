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
import com.autonowire.naplotdestiny.components.abilities.AquaStorm;
import com.autonowire.naplotdestiny.components.abilities.PushAttack;

public class SeaWizard implements UserType {
	public String getName() {
		return "Nautalus";
	}
	public String getDescription() {
		return "Junior Sea Wizard";
	}
	public Ability[] getAbilities() {
		Ability[] abilities = {new AquaStorm(), new PushAttack()};
		return abilities;
	}
	public String getImage() {
		return "http://images.wikia.com/runescape/images/archive/b/b4/20110603220244!Dark_wizard.png";
	}
	
	public String getVideo() {
		return "http://images.wikia.com/runescape/images/archive/b/b4/20110603220244!Dark_wizard.png";
	}
}
