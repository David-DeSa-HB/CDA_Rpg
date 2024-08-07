package fr.dawid.cda.service;

import fr.dawid.cda.business.Character;
import fr.dawid.cda.business.Mage;
import fr.dawid.cda.business.Rogue;
import fr.dawid.cda.business.Warrior;

public class CharacterFactory {
	
	
	public Character getCharacter(String type, String name) {
		if (type.equals(Warrior.class.getSimpleName())) {
			return new Warrior(name);
		}
		if (type.equals(Rogue.class.getSimpleName())) {
			return new Rogue(name);
		}
		if (type.equals(Mage.class.getSimpleName())) {
			return new Mage(name);
		}
		return null;
	}
}
