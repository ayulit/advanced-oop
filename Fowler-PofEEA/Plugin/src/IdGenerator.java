
public interface IdGenerator {
	
	public Long nextId();
	
	// with this its a Singleton design pattern!
	// we read INSTANCE attribute from PluginFactory
	public static final IdGenerator INSTANCE = (IdGenerator) PluginFactory.getPlugin(IdGenerator.class);
}
