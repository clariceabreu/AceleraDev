import java.lang.reflect.Field;
import java.math.BigDecimal;

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
					result = result.subtract((BigDecimal) f.get(o));
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
    	return result;
	}
	public BigDecimal total(Object o) {
		BigDecimal sum = somar(o);
		BigDecimal subtract = subtrair(o);
		if (sum != null && subtract != null) {
			return sum.subtract(subtract);
		}
		return BigDecimal.ZERO;
	}
}
