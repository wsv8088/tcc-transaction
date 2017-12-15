package com.wsun.tcc.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Invocation {

    private Class targetClass;

    private String methodName;

    private Class[] parameterTypes;

    private Object[] args;
}
