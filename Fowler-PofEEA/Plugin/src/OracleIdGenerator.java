import org.omg.CORBA.Environment;

public class OracleIdGenerator implements IdGenerator {

	public OracleIdGenerator() {
		this.sequence = Environment.getProperty("id.sequence");
		this.datasource = Environment.getProperty("id.source");
	}
	
	public Long nextId() {
		// TODO Auto-generated method stub
		return null;
	}

}
