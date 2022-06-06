package Test;

public class CreditCalculator {
    private int amount;
    private int years;

    public int calculate(){
        return getAmount() + getYears();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
