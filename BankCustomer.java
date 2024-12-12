
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {

    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter Account Holder Name: ");
            String customername = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number: ");
            long accno = Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter Bank Name: ");

            String bankName = br.readLine();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accno = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();

        return ("The Account Number " + accno + " of " + accholdername + " in " + bname + " bank is valid and authenticated for issuing the credit card.");

    }
}
