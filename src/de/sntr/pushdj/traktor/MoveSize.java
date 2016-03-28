package de.sntr.pushdj.traktor;

public enum MoveSize {
	
	xFine("xFne"), Fine("Fine"), f16("1/16"), f8("1/8"), f4("1/4"), f2("1/2"), i1("1"), i2("2"), i4("4"), i8("8"), i16("16"), i32("32"), loop("Loop");

	String name;
	
	MoveSize(String name) {
		this.name = name;
	}
}
