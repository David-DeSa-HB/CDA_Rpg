package fr.dawid.cda.business;

public class Warrior extends Character {
//	private int baseMinDamage = 24;
//	private int baseMaxDamage = 54;
//	private double strength = 24;
//	private double agility = 18;
//	private double intelligence = 18;
//	private double strengthGain = 3.2;
//	private double agilityGain = 1.4;
//	private double intelligenceGain = 1.8;

	public Warrior(String name) {
		super(name);
	}
	
	public double getStrength() {
		return 24 + 3.2*(lvl-1);
	}
	public double getAgility() {
		return 18 + 1.4*(lvl-1);
	}
	public double getIntelligence() {
		return 18 + 1.8*(lvl-1);
	}
	
	@Override
	public int getBaseArmor() {
		return 2;
	}

	@Override
	public double getDamageGain() {
		return this.getStrength();
	}

	@Override
	public int getBaseMinDamage() {
		return 24;
	}

	@Override
	public int getBaseMaxDamage() {
		return 54;
	}
}
