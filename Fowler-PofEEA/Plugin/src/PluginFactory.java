import java.io.FileInputStream;
import java.util.Properties;

public class PluginFactory {
	private static Properties props = new Properties ();
	
	// static init block - do while init ?!
	static {
		try {
			// properties file
			String propsFile = System.getProperty("test.properties");
			props.load(new FileInputStream(propsFile));
			
		} catch (Exception ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static Object getPlugin(Class iface) {
		
		// getting implementation from props
		String implName = props.getProperty(iface.getName());	
		
		if (implName == null) {
			throw new RuntimeException(
					"implementation not specified for :"
			        + iface.getName()
			        + " in PluginFactory properties.");
		}
		
		// factory constructs instance of IF
		try {
			
			return Class.forName(implName).newInstance();
			
		} catch (Exception ex) {
			throw new RuntimeException(
					"factory unable to construct instance of "
			        + iface.getName());
		}
		
	}

}

