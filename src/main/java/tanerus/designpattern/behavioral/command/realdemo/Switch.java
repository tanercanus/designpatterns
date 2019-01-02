package tanerus.designpattern.behavioral.command.realdemo;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
	
}
