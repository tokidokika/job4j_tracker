package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> oneUser = users.get(user);
            if (!oneUser.contains(account)) {
                oneUser.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User oneUser: users.keySet()) {
            if (oneUser.getPassport().equals(passport)) {
                return oneUser;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> oneUser = users.get(user);
            for (Account el : oneUser) {
                if (el.getRequisite().equals(requisite)) {
                    return el;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport,
                                 String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc != null && srcAcc.getBalance() >= amount && destAcc != null) {
            srcAcc.setBalance(srcAcc.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    public List<Account> getAccount(User user) {
        return users.get(user);
    }
}
