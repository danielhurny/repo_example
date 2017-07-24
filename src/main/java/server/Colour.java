package server;

public enum Colour {
	
	 RED, BLACK, BLUE, WHITE,
	    GREEN, PINK, WHATEVER; 
	    
	    @Override
	    public String toString() {
	        return name().toLowerCase();
	    }
	    
	    

}
