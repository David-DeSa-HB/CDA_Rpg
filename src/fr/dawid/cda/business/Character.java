package fr.dawid.cda.business;

public abstract class Character {
	protected String name;
	protected int currenthp;
	protected int lvl = 1;

	public Character(String name) {
		this.name = name;
		this.currenthp = getHp();
	}

	public Character(String name, int currenthp, int lvl) {
		this.name = name;
		this.lvl = lvl;
		this.currenthp = getHp();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double getStrength();

	public abstract double getAgility();

	public abstract double getIntelligence();

	public abstract double getDamageGain();

	public abstract int getBaseArmor();

	public abstract int getBaseMinDamage();

	public abstract int getBaseMaxDamage();

	public int getArmor() {
		return ((int) (getAgility() / 6 + getBaseArmor()));
	}

	public int getHp() {
		return (int) ((getStrength() * 22) + 120);
	}

	public int getCurrenthp() {
		return currenthp;
	}

	public void setCurrenthp(int currenthp) {
		this.currenthp = currenthp < 0 ? 0 : currenthp; // ternaire
	}

	public int getMinDamage() {
		return (int) (this.getBaseMinDamage() + getDamageGain());
	}

	public int getMaxDamage() {
		return (int) (this.getBaseMaxDamage() + getDamageGain());
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		int lastHp = this.getHp();
		this.lvl = lvl;
		this.setCurrenthp(this.currenthp + (this.getHp() - lastHp));
	}

	public void lvlUp() {
		setLvl(lvl + 1);
	}

	public boolean attack(Character target) {
		double damageReduction = 1-((0.06*target.getArmor())/(1+0.06*target.getArmor()));
		double damage = getRandomBetween(this.getMinDamage(), this.getMaxDamage()) - damageReduction;
		target.setCurrenthp((int) (target.getCurrenthp() - damage));
		if (target.getCurrenthp() <=0) {
			return true;
		}
		return false;
	}
	
	public double getRandomBetween(int min, int max) {
		return Math.floor((Math.random() * (max - min)) + min);
		
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + ", strength=" + getStrength() + ", agility="
				+ getAgility() + ", intelligence=" + getIntelligence() + ", armor=" + getArmor() + ", hp=" + getHp()
				+ ", currenthp=" + currenthp + ", minDamage=" + getMinDamage() + ", maxDamage=" + getMaxDamage()
				+ ", lvl=" + lvl + "] " + getDamageGain();
	}

}
