package com.wsun.tcc.common;

import com.wsun.tcc.common.Invocation;

/**
 * 事务的参与者,一般情况下是一个rpc
 */
public class Participant {

    private String xid;

    private Invocation confirmInvocation;

    private Invocation cancelInvocation;
}
