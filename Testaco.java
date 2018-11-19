package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testaco {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	Catalogue catalogue = new Catalogue();
	
	ConfigImpl config1 = new ConfigImpl();
	ConfigImpl config2 = new ConfigImpl();
	ConfigImpl config3 = new ConfigImpl();
	

	PartTypeImpl part1 = new PartTypeImpl(new Name("EG100"), new Description("Gasoline, 100 kW"), new CategoryImpl("Engine"));
	PartTypeImpl part2 = new PartTypeImpl(new Name("TM5"), new Description("Manual, 5 gears"), new CategoryImpl("Transmission"));

	@Test
	public void Testshowpart() {
		
		CategoryImpl Engine = new CategoryImpl();
		CategoryImpl Transmission = new CategoryImpl();
		CategoryImpl Exterior = new CategoryImpl();
		CategoryImpl Interior = new CategoryImpl();
		
		
	}

	@Test
	public void testaddpart() {
		assertFalse(config1.addpart(part1));
	}

	@Test
	public void testremovepart() {
		config1.addpart(part1);
		assertFalse(config1.removepart(part1));
	}
}
