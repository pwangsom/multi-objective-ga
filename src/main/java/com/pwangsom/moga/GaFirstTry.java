package com.pwangsom.moga;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GaFirstTry {
	
	private static final Logger LOGGER = Logger.getLogger(GaFirstTry.class.getName() );

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LOGGER.setLevel(Level.FINER);
		
		LOGGER.log(Level.INFO, "Multi-objective Genetic Algorithms");		
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		LOGGER.log(Level.FINE, "processing {0} entries in loop", list.size());
		
		for(int i = 0; i < list.size(); i++){
			
			LOGGER.log(Level.FINER, "processing[{0}]: {1}", new Object[]{i, list.get(i)});
			
		}
		
	}

}
