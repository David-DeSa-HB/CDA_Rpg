package fr.dawid.cda.business;

public class Mage extends Character {
//	private int baseMinDamage = 21;
//	private int baseMaxDamage = 29;
//	private double strength = 20;
//	private double agility = 23;
//	private double intelligence = 30;
//	private double strengthGain = 2.4;
//	private double agilityGain = 2.4;
//	private double intelligenceGain = 3.8;

	public Mage(String name) {
		super(name);
	}
	
	public double getStrength() {
		return 20 + 2.4*(lvl-1);
	}
	public double getAgility() {
		return 23 + 2.4*(lvl-1);
	}
	public double getIntelligence() {
		return 30 + 3.8*(lvl-1);
	}
	
	@Override
	public int getBaseArmor() {
		return 0;
	}

	@Override
	public double getDamageGain() {
		return this.getIntelligence();
	}

	@Override
	public int getBaseMinDamage() {
		return 21;
	}

	@Override
	public int getBaseMaxDamage() {
		return 29;
	}
}
