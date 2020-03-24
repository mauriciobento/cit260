package service.impl;

import exceptions.TransactionException;
import model.Account;
import model.Transaction;
import service.TransactionService;

public class TransactionServiceImpl implements TransactionService {

    /**
     *
     * @param transaction
     * @param account
     * @throws TransactionException
     */
    @Override
    public void deposit(Transaction transaction, Account account) throws TransactionException {

    }

    /**
     *
     * @param transaction
     * @param account
     * @throws TransactionException
     */
    @Override
    public void withdraw(Transaction transaction, Account account) throws TransactionException {

    }

    /**
     *
     * @param transaction
     * @param accountFrom
     * @param accountTo
     * @throws TransactionException
     */
    @Override
    public void transfer(Transaction transaction, Account accountFrom, Account accountTo) throws TransactionException {

    }
}
