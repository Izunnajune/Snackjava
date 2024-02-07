package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testThatNegativeDepositDoesNotChangeBalance() {
        Account account = new Account();
        assertEquals(0, account.getBalance());

        account.deposit(-5_00);
        assertEquals(0,account.getBalance());
    }

    @Test
    void testThatPositiveDepositIncreasesBalance() {
        Account account  = new Account();
        assertEquals(0, account.getBalance());
        //that account balance was zero before deposit

        account.deposit(5_00);
        assertEquals(5_00, account.getBalance());
    }

    @Test
    void testThatDoublePositiveDepositWillIncreaseBalance() {
        Account account = new Account();
        assertEquals(0, account.getBalance());
        //that account balance was 0 before deposit

        account.deposit(3_00);
        account.deposit(4_00);
        assertEquals(7_00, account.getBalance());
    }



    @Test
    void testThatWithdrawalWhenBalanceIsZero_BalanceDoesNotChange() {
        Account account = new Account();
        assertEquals(0, account.getBalance());
        //that account balance was 0 before withdrawal

        account.withdraw(3_00);
        assertEquals(0, account.getBalance());
    }

    @Test
    void testThatPositiveWithdrawalWillDeceaseBalance() {
        Account account = new Account();
        assertEquals(0, account.getBalance());
        //that account balance was 0 before deposit

        account.deposit(3_00);
        assertEquals(3_00,account.getBalance());
        account.withdraw(2_00);
       assertEquals(1_00, account.getBalance());
    }
    @Test
    void testThatWithdrawalBeyondBalanceWillNotChangeBalance() {
        Account account = new Account();
        assertEquals(0, account.getBalance());
        //that account balance was 0 before deposit

        account.deposit(3_00);
        assertEquals(3_00,account.getBalance());
        account.withdraw(5_00);
        assertEquals(3_00, account.getBalance());
    }

    @Test
    void testThatWithdrawalOfDifferentAmountsIsPossible() {
        Account account = new Account();
        assertEquals(0, account.getBalance());
        //that account balance was 0 before deposit

        account.deposit(50_000);
        assertEquals(50_000,account.getBalance());

        account.withdraw(10_000);
        account.withdraw(25_000);
        assertEquals(15_000, account.getBalance());
    }

}