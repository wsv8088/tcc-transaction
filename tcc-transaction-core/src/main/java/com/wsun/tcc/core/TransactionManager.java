package com.wsun.tcc.core;

import com.wsun.tcc.common.TccTransaction;

public class TransactionManager {

    private static ThreadLocal<TccTransaction> currentTransaction = new ThreadLocal<>();

}
