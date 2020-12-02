package com.hcl.dayfive;

import java.util.Comparator;

public class NameCompare implements Comparator<SummaryLog> {

	@Override
	public int compare(SummaryLog o1, SummaryLog o2) {
		// TODO Auto-generated method stub
		return -o1.getName().compareTo(o2.getName());
	}

}
