package com.wsun.tcc.common;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class TccTransaction {

    /**
     * 事务ID
     */
    private String xid;

    private int status;

    private String targetClass;

    private String targetMethod;

    private int pattern;

    private int retryCount;

    private List<Participant> participants;

    private Date createTime;

    private Date updateTime;

    private int version;


    public void registerParticipant(Participant participant) {
        participants.add(participant);
    }
}
