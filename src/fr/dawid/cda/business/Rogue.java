package fr.dawid.cda.business;

public class Rogue  extends Character {
//	private int baseMinDamage = 20;
//	private int baseMaxDamage = 22;
//	private double strength = 20;
//	private double agility = 34;
//	private double intelligence = 14;
//	private double strengthGain = 2.2;
//	private double agilityGain = 2.8;
//	private double intelligenceGain = 1.4;

	public Rogue(String name) {
		super(name);
	}
	
	public double getStrength() {
		return 20 + 2.2*(lvl-1);
	}
	public double getAgility() {
		return 34 + 2.8*(lvl-1);
	}
	public double getIntelligence() {
		return 14 + 1.4*(lvl-1);
	}
	
	@Override
	public int getBaseArmor() {
		return 0;
	}

	@Override
	public double getDamageGain() {
		return this.getAgility();
	}

	@Override
	public int getBaseMinDamage() {
		return 20;
	}

	@Override
	public int getBaseMaxDamage() {
		return 22;
	}
}
