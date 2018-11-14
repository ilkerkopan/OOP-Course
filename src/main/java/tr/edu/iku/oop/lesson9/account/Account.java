package tr.edu.iku.oop.lesson9.account;

public class Account {
	private String name;
	private int tlBalance;
	private int euroBalance;
	private int usdBalance;
	
	public Account() {
		
	}
	
	public Account(String name) {
		this.name = name;
	}
	
	public void withdrawModey(int amount) {
		if (tlBalance >= amount)
			tlBalance = tlBalance - amount;
		else
			System.out.println("You dont have that much money!!");
	}
	
	public void withdrawModey(int amount, String currency) {
		if (currency.equals("usd")) {
			if (usdBalance >= amount)
				usdBalance = usdBalance - amount;
		} else if (currency.equals("euro")) {
			if (euroBalance >= amount)
				euroBalance = euroBalance - amount;
		} else {
			if (tlBalance >= amount)
				tlBalance = tlBalance - amount;
		}
	}
	
	public void depositMoney(int amount) {
		tlBalance = tlBalance + amount;
	}
	
	public void depositMoney(int amount, String currency) {
		if (currency.equals("usd")) {
			usdBalance = usdBalance + amount;
		} else if (currency.equals("euro")) {
			euroBalance = euroBalance + amount;
		} else {
			tlBalance = tlBalance + amount;
		}
	}
	
	public String getName() {
		return name;
	}

	public int getTlBalance() {
		return tlBalance;
	}
	
	public int getUsdBalance() {
		return usdBalance;
	}
	
	public int getEuroBalance() {
		return euroBalance;
	}
}
