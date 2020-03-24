package service;


import exceptions.AccountException;
import model.Account;

public interface AccountService {

    /**
     *
     * @param account
     * @throws AccountException
     */
    void saveAccount(Account account) throws AccountException;

    /**
     *
     * @param account
     * @throws AccountException
     */
    void updateAccount(Account account) throws AccountException;

    /**
     *
     * @param account
     * @throws AccountException
     */
    void inactiveAccount(Account account) throws AccountException;
}
