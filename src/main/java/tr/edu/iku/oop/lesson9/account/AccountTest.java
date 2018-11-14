package tr.edu.iku.oop.lesson9.account;

public class AccountTest {

	public static void main(String[] args) {
		Account myAccount = new Account("ilker");
		
		myAccount.withdrawModey(250);
		System.out.println("name:" +myAccount.getName()
			+" tl balance:"+myAccount.getTlBalance()
			+" usd balance:"+myAccount.getUsdBalance()
			+" euro balance:"+myAccount.getEuroBalance());

		myAccount.depositMoney(150, "usd");
		System.out.println("name:" +myAccount.getName()
			+" tl balance:"+myAccount.getTlBalance()
			+" usd balance:"+myAccount.getUsdBalance()
			+" euro balance:"+myAccount.getEuroBalance());

		myAccount.depositMoney(250, "euro");
		System.out.println("name:" +myAccount.getName()
			+" tl balance:"+myAccount.getTlBalance()
			+" usd balance:"+myAccount.getUsdBalance()
			+" euro balance:"+myAccount.getEuroBalance());

		myAccount.depositMoney(150);
		System.out.println("name:" +myAccount.getName()
			+" tl balance:"+myAccount.getTlBalance()
			+" usd balance:"+myAccount.getUsdBalance()
			+" euro balance:"+myAccount.getEuroBalance());

		myAccount.withdrawModey(1250, "usd");
		System.out.println("name:" +myAccount.getName()
			+" tl balance:"+myAccount.getTlBalance()
			+" usd balance:"+myAccount.getUsdBalance()
			+" euro balance:"+myAccount.getEuroBalance());
	}
}
