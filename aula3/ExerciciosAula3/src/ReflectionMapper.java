
public class ReflectionMapper {
	public void leObject() {
		Object mapper = null;
		
		try {
			mapper=Class.forName("pessoa").newInstance();
			
		}catch (Exception e ) {
			
		}
		
		for (Object p : mapper.getClass().getDeclaredFields()) {
			System.out.println(p);
		}
	}
}
