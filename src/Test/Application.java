package Test;

public class Application {
    private CreditCalculator creditCalculator;

    public void init(){
        creditCalculator = new CreditCalculator();
    }

    private void run(){
        creditCalculator.setAmount(5000);
        creditCalculator.setYears(2);
        creditCalculator.calculate();
        System.out.println(creditCalculator.getAmount());
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.init();
        application.run();
    }
}
