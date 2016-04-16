
public class CashReturn extends CashSuper {
	private double moneyCondition = 0d;
	private double moneyReturn = 0d;
	public CashReturn(String moneyCondition ,String moneyReturn)
	{
		this.moneyCondition = Double.valueOf(moneyCondition).doubleValue();
		this.moneyReturn = Double.valueOf(moneyReturn).doubleValue();
	}
	@Override
	public double acceptCash(double money) {
		double result = money;
		if(money >= moneyCondition)
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		return result;
	}
}
