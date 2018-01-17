package com.msaguiar.utils;

import java.math.BigDecimal;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomUtils {

	private static Random random = new Random();

	public static BigDecimal getRandomBigDecimal() {

		return new BigDecimal(random.nextDouble());
	}

	public static long getRandomLong() {
		return random.nextLong();
	}

	public static String getRandomString() {
			return RandomStringUtils.random(50);
	}

}
