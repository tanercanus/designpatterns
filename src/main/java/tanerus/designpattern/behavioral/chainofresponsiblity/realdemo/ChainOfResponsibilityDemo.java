package tanerus.designpattern.behavioral.chainofresponsiblity.realdemo;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director bryan = new Director();
		VP crytal = new VP();
		CEO jeff = new CEO();

		bryan.setSuccessor(crytal);
		crytal.setSuccessor(jeff);

		Request request = new Request(RequestType.CONFERENCE, 500);
		bryan.handleRequest(request);

		request = new Request(RequestType.PURCHASE, 500);
		bryan.handleRequest(request);

		request = new Request(RequestType.CONFERENCE, 500);
		bryan.handleRequest(request);

	}

}
