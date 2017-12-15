package com.wsun.tcc.core.repository;

import com.wsun.tcc.common.TccTransaction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.List;

public class RedisTransactionRepository implements TransactionRepository {
    private final static Logger LOGGER = LogManager.getLogger(RedisTransactionRepository.class);

    @Override
    public boolean create(TccTransaction transaction) {
        LOGGER.info("Redis create...");
        return true;
    }

    @Override
    public boolean update(TccTransaction transaction) {
        LOGGER.info("Redis update...");
        return true;
    }

    @Override
    public boolean delete(TccTransaction transaction) {
        LOGGER.info("Redis delete...");
        return true;
    }

    @Override
    public TccTransaction findById(String xid) {
        LOGGER.info("Redis findById...");
        return null;
    }

    @Override
    public List<TccTransaction> findAll() {
        return null;
    }

    @Override
    public List<TccTransaction> findAllByDelay(Date date) {
        return null;
    }
}
