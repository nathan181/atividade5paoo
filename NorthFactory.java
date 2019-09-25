
public  class NorthFactory extends DuckFactory {
    
	@Override
	public Duck typeDuck(String region) {
		if (region.equalsIgnoreCase("norte"))
			return new NorthDuck(null, null);
		else {
			return null;
		}
	}

}
