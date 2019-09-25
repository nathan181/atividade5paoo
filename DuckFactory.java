
public abstract class DuckFactory {

	public final Duck createDuck(String region){
		Duck duck = typeDuck(region);			
		return duck;
	}
	
	public abstract Duck typeDuck(String region);
	 
	
	
}
