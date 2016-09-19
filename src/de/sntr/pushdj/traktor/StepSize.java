package de.sntr.pushdj.traktor;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum StepSize {
	
	f32("1/32"), f16("1/16"), f8("1/8"), f4("1/4"), f2("1/2"), i1("1"), i2("2"), i4("4"), i8("8"), i16("16"), i32("32");
	
	String name;

	private static final Map<Integer, StepSize> lookup = new HashMap<Integer, StepSize>();

	static {
		int ordinal = 0;
		for (StepSize suit : EnumSet.allOf(StepSize.class)) {
			lookup.put(ordinal, suit);
			ordinal += 1;
		}
	}

	public static StepSize fromOrdinal(int ordinal) {
		return lookup.get(ordinal);
	}
	  
	StepSize(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
