public class MonthyCCBalance
{
    public static void main(String[] args)
    {
      double balance = 5000.0;
      double interestRate = 0.17;

      double MonthOneInterest = balance * interestRate/12;
      balance += MonthOneInterest;
      System.out.println("Interest due after one month is :$ "+ MonthOneInterest);
      System.out.println("Balance after one month is: %" + balance);


      double MonthTwoInterest = balance * interestRate/12;
      balance =+ MonthTwoInterest;
      System.out.println("Interest dur after two months is: $ " + MonthTwoInterest);
      System.out.println("Balance after two month is: $" + balance);

    }
}
