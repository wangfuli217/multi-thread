package com.imooc.aspect_demo;

/**
 * 取款
 */
public class Account {
    double balance = 200;
    public boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        }
        balance = balance - amount;
        return true;
    }
    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + '}';
    }
}
