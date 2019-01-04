package tanerus.designpattern.creational.abstractfactory;

//Abstract Product
public class CreditCard {
	protected int cardNumberLength;
	protected int cscNumber;

	public int getCardNumberLength() {
		return cardNumberLength;
	}

	public void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}

	public int getCscNumber() {
		return cscNumber;
	}

	public void setCscNumber(int cscNumber) {
		this.cscNumber = cscNumber;
	}

}
