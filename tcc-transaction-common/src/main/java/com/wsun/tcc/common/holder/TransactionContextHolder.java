package com.wsun.tcc.common.holder;

import com.wsun.tcc.common.context.TccTransactionContext;

/**
 * 事务上下文持有者
 */
public class TransactionContextHolder {

    private static final ThreadLocal<TccTransactionContext> CONTEXT_THREAD_LOCAL = new ThreadLocal<>();

    public void set(TccTransactionContext context) {
        CONTEXT_THREAD_LOCAL.set(context);
    }

    public TccTransactionContext get() {
        return CONTEXT_THREAD_LOCAL.get();
    }

    public void remove() {
        CONTEXT_THREAD_LOCAL.remove();
    }

    private TransactionContextHolder() {}
}
