package tanerus.designpattern.structural.proxy.realdemo;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
		
		System.out.println(service.getTimeline("bhadasd"));
	}

}
