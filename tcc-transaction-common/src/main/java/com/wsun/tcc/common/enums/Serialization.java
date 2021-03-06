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
package com.wsun.tcc.common.enums;


import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public enum Serialization {

    JDK("jdk"),

    KRYO("kryo"),

    HESSIAN("hessian"),

    PROTOSTUFF("protostuff");

    private String serialize;

    Serialization(String serialize) {
        this.serialize = serialize;
    }

    /**
     * Acquire serialize protocol serialize protocol enum.
     *
     * @param serialize the serialize protocol
     * @return the serialize protocol enum
     */
    public static Serialization acquire(String serialize) {
        Optional<Serialization> serializeEnum =
                Arrays.stream(Serialization.values())
                        .filter(v -> Objects.equals(v.getSerialize(), serialize))
                        .findFirst();
        return serializeEnum.orElse(Serialization.KRYO);

    }

    /**
     * Gets serialize protocol.
     *
     * @return the serialize protocol
     */
    public String getSerialize() {
        return serialize;
    }

    /**
     * Sets serialize protocol.
     *
     * @param serialize the serialize protocol
     */
    public void setSerialize(String serialize) {
        this.serialize = serialize;
    }


}
