/*
 *
 * Copyright 2017-2018 549477611@qq.com(xiaoyu)
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.wsun.tcc.core.annatation;

import com.wsun.tcc.core.enums.Propagation;
import com.wsun.tcc.core.enums.TccPattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * tcc分布式事务框架注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Tcc {

    Propagation propagation() default Propagation.REQUIRED;

    /**
     * tcc事务确认方法
     *
     * @return confirm方法名称
     */
    String confirmMethod() default "";

    /**
     * tcc事务回滚方法
     *
     * @return cancel方法名称
     */
    String cancelMethod() default "";

    /**
     * 模式 tcc 和cc模式
     * <p>
     * tcc模式代表try中有数据库操作，try需要回滚
     * cc模式代表try中无数据库操作，try不需要回滚
     *
     * @return
     */
    TccPattern pattern() default TccPattern.TCC;


}