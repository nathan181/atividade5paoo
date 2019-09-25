

public  class SouthFactory extends DuckFactory {
    
	@Override
	public Duck typeDuck(String region) {
		if (region.equalsIgnoreCase("sul"))	
			return new SouthDuck(null, null);
		else {
			return null;
		}
	}

}
