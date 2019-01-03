package tanerus.designpattern.behavioral.visitor.withvisitor;

public class Fender implements AtvPart {

	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
	
}
