package service;


import exceptions.TransactionException;
import model.Account;
import model.Transaction;

public interface TransactionService {

    /**
     *
     * @param transaction
     * @param account
     * @throws TransactionException
     */
    void deposit(Transaction transaction, Account account) throws TransactionException;

    /**
     *
     * @param transaction
     * @param account
     * @throws TransactionException
     */
    void withdraw(Transaction transaction, Account account) throws TransactionException;

    /**
     *
     * @param transaction
     * @param accountFrom
     * @param accountTo
     * @throws TransactionException
     */
    void transfer(Transaction transaction, Account accountFrom, Account accountTo) throws TransactionException;
}
