package tanerus.designpattern.behavioral.mediator.realdemo;

//reciever
public class Light {
	private boolean isOn = false;

	private String location = "";

	public Light() {

	}

	public Light(String location) {
		this.location = location;
	}

	public boolean isOn() {
		return isOn;
	}

	public void toggle() {
		if (isOn) {
			off();
			isOn = false;
		} else {
			on();
			isOn = true;
		}
	}

	private void on() {
		System.out.println(this.location + " Light switched on");

	}

	private void off() {
		System.out.println(this.location + " Light switched off");

	}

}
