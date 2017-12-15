package com.wsun.tcc.core.repository;

import com.wsun.tcc.common.TccTransaction;

import java.util.Date;
import java.util.List;

public interface TransactionRepository {

    boolean create(TccTransaction transaction);

    boolean update(TccTransaction transaction);

    boolean delete(TccTransaction transaction);

    TccTransaction findById(String xid);

    List<TccTransaction> findAll();

    List<TccTransaction> findAllByDelay(Date date);

}
