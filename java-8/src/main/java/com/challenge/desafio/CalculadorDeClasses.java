package com.challenge.desafio;
import java.lang.reflect.Field;
import java.math.BigDecimal;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;

public class CalculadorDeClasses implements Calculavel {
	
	public BigDecimal somar(Object o) {
		BigDecimal result = BigDecimal.ZERO;

		try {
			for (Field f : o.getClass().getDeclaredFields()) {
				f.setAccessible(true);
				if (f.isAnnotationPresent(Somar.class) && (f.get(o) instanceof BigDecimal) && f.get(o) != null) {
					result = result.add((BigDecimal) f.get(o));
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
    	return result;
	}
	
	public BigDecimal subtrair(Object o) {
		BigDecimal result = BigDecimal.ZERO;

		try {
			for (Field f : o.getClass().getDeclaredFields()) {
				f.setAccessible(true);
				if (f.isAnnotationPresent(Subtrair.class) && (f.get(o) instanceof BigDecimal) && f.get(o) != null) {
					result = result.add((BigDecimal) f.get(o));
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
    	return result;
	}
	public BigDecimal totalizar(Object o) {
		BigDecimal sum = somar(o);
		BigDecimal subtract = subtrair(o);
		return sum.subtract(subtract);
	}
}
