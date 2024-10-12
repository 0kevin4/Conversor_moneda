package Models;

public class Currency {

    private String base;
    private String target;
    private double amount;
    private double currencyConversion;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCurrencyConversion() {
        return currencyConversion;
    }

    public Currency(CurrencyOmdb currencyOmdb) {
        this.currencyConversion = currencyOmdb.conversion_result();
        this.base = currencyOmdb.base_code();
        this.target = currencyOmdb.target_code();
    }

    @Override
    public String toString() {
        return "El valor " + this.amount + " [" + base + "] " + "corresponde al valor final de =>> " + this.currencyConversion + " [" + target + "]\n";
    }
}
