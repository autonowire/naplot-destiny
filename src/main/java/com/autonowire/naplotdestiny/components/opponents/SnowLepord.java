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
import com.autonowire.naplotdestiny.components.abilities.IceRampage;
import com.autonowire.naplotdestiny.components.abilities.PushAttack;

public class SnowLepord implements Opponent{
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
		Ability[] abilities = {new PushAttack(), new IceRampage()};
		return abilities;
	}
	
	public String getImage() {
		return "http://media.treehugger.com/assets/images/2012/07/20120716-snow-leopard.jpg.662x0_q100_crop-scale.jpg";
	}
	
	public String getVideo() {
		return "http://media.treehugger.com/assets/images/2012/07/20120716-snow-leopard.jpg.662x0_q100_crop-scale.jpg";
	}
}
