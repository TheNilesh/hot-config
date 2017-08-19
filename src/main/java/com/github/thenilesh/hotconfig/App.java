package com.github.thenilesh.hotconfig;

import java.io.File;

/**
 * Simple App to test auto reloading properties
 *
 */
public class App {
    public static void main( String[] args) throws InterruptedException {
	File propertiesFile = new File("foo.properties");

    	AutoReloadingConfiguration autoReloadingConfig = new AutoReloadingConfiguration(propertiesFile, 1);
        while (true) {
        	System.out.println( "Hello " + autoReloadingConfig.getString("user.name"));
        	Thread.sleep(2000);
        }
    }
}
