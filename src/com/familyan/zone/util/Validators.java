package com.familyan.zone.util;

import java.util.Collection;

public class Validators {

	public static final boolean isEmpty(Collection<?> collection) {
		if(collection == null || collection.size() == 0) {
			return true;
		}
		
		return false;
	}
}
