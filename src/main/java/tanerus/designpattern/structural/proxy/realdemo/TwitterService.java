package tanerus.designpattern.structural.proxy.realdemo;

public interface TwitterService {
	
	public String getTimeline(String screenName);

	public void postToTimeline(String screenName, String message);
}
