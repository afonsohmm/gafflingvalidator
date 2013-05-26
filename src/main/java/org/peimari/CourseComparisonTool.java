package org.peimari;

import java.util.TreeMap;

import org.peimari.iof2.CourseControl;
import org.peimari.iof2.CourseVariation;

/**
 * Counts how many times each leg is run and uses this statistic in
 * comparison.
 */
public class CourseComparisonTool {

	TreeMap<String, Integer> legKeyToCount = new TreeMap<String, Integer>();
	CourseVariation c;

	public CourseComparisonTool(CourseVariation c) {
		this.c = c;
		String prevControl = "K";
		for (CourseControl courseControl : c.getCourseControl()) {
			String ctrlcode = courseControl.getControlCodeOrControl()
					.get(0).toString();
			String legKey = prevControl + "-" + ctrlcode;
			mark(legKey);
			prevControl = ctrlcode;
		}
	}

	private void mark(String legKey) {
		Integer legcount = legKeyToCount.get(legKey);
		if (legcount == null) {
			legcount = 0;
		}
		legcount++;
		legKeyToCount.put(legKey, legcount);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CourseComparisonTool) {
			CourseComparisonTool other = (CourseComparisonTool) obj;
			return legKeyToCount.equals(other.legKeyToCount);
		}
		return super.equals(obj);
	}

}