package tanerus.designpattern.behavioral.visitor.withvisitor;

public class Wheel implements AtvPart {

	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}


}
