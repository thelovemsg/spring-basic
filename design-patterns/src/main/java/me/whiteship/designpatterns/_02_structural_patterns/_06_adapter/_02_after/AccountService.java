package me.whiteship.designpatterns._02_structural_patterns._06_adapter._02_after;

//adaptor가 없어도 직업 implements UserDetailService해도 됨
public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

}
