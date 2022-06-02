package Validate_account;

import java.util.Arrays;

public class AccountExampleTest {
    private  static  AccountExample accountExample;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAcount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account: invalidAcount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
