package de.nukaboy.ProcDyn;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class TwitterConnection {
	public static Twitter getConnection() {
		return TwitterFactory.getSingleton();
	}
}
