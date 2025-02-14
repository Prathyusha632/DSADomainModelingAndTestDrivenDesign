interface Loans
{
    void studentLoan(double amount, int time);
    void houseLoan(double amount, int time);
    void vehicleLoan(double amount, int time);
    void businessLoan(double amount, int time);
}
class SBI implements Loans
{
    int rate;
    @Override
    public void studentLoan(double amount, int time)
    {
        rate = 5;
        System.out.println("Interest for student loan at SBI is "+(amount*(1+time*rate)));
    }
    @Override
    public void houseLoan(double amount, int time)
    {
        rate = 8;
        System.out.println("Interest for  house loan at SBI is "+ (amount*(1+time*rate)));
    }
    @Override
    public void vehicleLoan(double amount, int time)
    {
        rate = 15;
        System.out.println("Interest for vehicle loan at SBI is "+ (amount*(1+time*rate)));
    }
    @Override
    public void businessLoan(double amount, int time)
    {
        rate = 18;
        System.out.println("Interest for business loan at SBI is "+ (amount*(1+time*rate)));
    }
}
class IndianBank implements Loans
{
    int rate;
    @Override
    public void studentLoan(double amount, int time)
    {
        rate = 10;
        System.out.println("Interest for student loan at IndianBank is "+ (amount*(1+time*rate)));
    }
    @Override
    public void houseLoan(double amount, int time)
    {
        rate = 15;
        System.out.println("Interest for  house loan at IndianBank is "+ (amount*(1+time*rate)));
    }
    @Override
    public void vehicleLoan(double amount, int time)
    {
        rate = 18;
        System.out.println("Interest for vehicle loan at IndianBank is "+ (amount*(1+time*rate)));
    }
    @Override
    public void businessLoan(double amount, int time)
    {
        rate = 25;
        System.out.println("Interest for business loan at IndianBank is "+ (amount*time*rate));
    }
}
public class CalculateInterest {
    public static void main(String[] args)
    {
        SBI sbi = new SBI();
        sbi.studentLoan(100000,2);
        sbi.houseLoan(200000,6);
        sbi.businessLoan(500000,3);
        sbi.vehicleLoan(40000,1);
        IndianBank indianBank = new IndianBank();
        indianBank.studentLoan(100000,2);
        indianBank.houseLoan(200000,6);
        indianBank.businessLoan(500000,3);
        indianBank.vehicleLoan(40000,1);
    }
}
