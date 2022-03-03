package inheritance;

class Customer
{
    String name;
    String email;
        void getCustomerData()
        {
            name="Hari"; email="hari@hooha.com";
            System.out.println(name+" :" +email);
        }
}
class CreditCustomer extends Customer
{
    String cardName;
    void getCustomerData() //Overriding
    {
         //Calling base class method.
        cardName="AMEX Platinum";
        System.out.println("Card :"+cardName);
    }
}
public class Bank
{
public static void main(String[] args) {
        CreditCustomer cs=new CreditCustomer();
        cs.getCustomerData();
}
}
 
