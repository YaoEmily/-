
public class CashRebate extends CashSuper {
	private double moneyRebate = 1d;
	public CashRebate(String moneyRebate)
	{
		this.moneyRebate = Double.valueOf(moneyRebate).doubleValue();
	}
	@Override
	public double acceptCash(double money) {
		return moneyRebate * money;
	}
}
