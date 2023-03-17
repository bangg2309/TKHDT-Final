package tinhTien;

public class PaymentContext {
	private PaymentStrategy strategy;

	public PaymentContext(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public double executeStrategy(double amount) {
		return strategy.calculate(amount);
	}
}
