package fr.dawid.cda;

import java.util.ArrayList;
import java.util.List;

import fr.dawid.cda.business.Character;
import fr.dawid.cda.business.Mage;
import fr.dawid.cda.business.Rogue;
import fr.dawid.cda.business.Warrior;
import fr.dawid.cda.service.CharacterFactory;

public class Main {

	public static void main(String[] args) {
		CharacterFactory factory = new CharacterFactory();
		Character warrior = factory.getCharacter("Warrior", "wawa");
		Character rogue = factory.getCharacter("Rogue", "roro");
		Character mage = factory.getCharacter("Mage", "mama");
		
		List<Character> characters = new ArrayList<>();
		characters.add(warrior);
		characters.add(rogue);
		characters.add(mage);
		characters.forEach(System.out::println);
		
		warrior.attack(mage);
		System.out.println(mage);
	}
	
	

//	
//	public static void addWarrior(String nom) {
//		Warrior warrior = new Warrior(nom);
//		System.out.println(warrior);
//	}
//	public static void addRogue(String nom) {
//		Rogue rogue = new Rogue(nom);
//		System.out.println(rogue);
//	}
//	public static void addMage(String nom) {
//		Mage mage = new Mage(nom);
//		System.out.println(mage);
//	}
//	
//	private static List<Character> creerCharacters(int nbrCharacters) {
//		List<Character> characters = new ArrayList<>();
//		characters.add(new Mage("name"));
//		return characters;
//	}

}
