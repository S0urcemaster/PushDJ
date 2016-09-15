package de.sntr.pushdj.traktor;

public enum StepSize {
	
	f32("1/32"), f16("1/16"), f8("1/8"), f4("1/4"), f2("1/2"), i1("1"), i2("2"), i4("4"), i8("8"), i16("16"), i32("32");
	
	String name;
	
	StepSize(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
