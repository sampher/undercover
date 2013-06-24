package com.familyan.zone.util;

import java.util.UUID;

public class UUIDUtils {

	public static final String newUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
