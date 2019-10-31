import java.lang.reflect.Method;

public class MostrarValores {
	public static void imprimirValores(Object o) {
		try {
			Class clazz = o.getClass();
			for (Method m : clazz.getDeclaredMethods()) {
				if (m.isAnnotationPresent(Mostrar.class)) {
					System.out.println((m.getName() + ": " + m.invoke(o)));
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
