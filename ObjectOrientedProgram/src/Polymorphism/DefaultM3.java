package Polymorphism;

	

	// Implementation class code
	class DefaultM3 implements Testinterface3, Testinterface4
	{
	    
	    public void show()
	    {
	        // use super keyword to call the show
	        // method of TestInterface1 interface
	        Testinterface3.super.show();
	        // use super keyword to call the show
	        // method of TestInterface2 interface
	        Testinterface4.super.show();
	    }
	  
	    public static void main(String args[])
	    {
	    	DefaultM3 d = new DefaultM3();
	        d.show();
	    }
	    
	    
	}


