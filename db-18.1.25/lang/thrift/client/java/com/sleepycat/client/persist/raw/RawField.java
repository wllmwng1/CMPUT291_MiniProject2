/*-
 * Copyright (c) 2002, 2018 Oracle and/or its affiliates.  All rights reserved.
 *
 * See the file LICENSE for license information.
 *
 */

package com.sleepycat.client.persist.raw;

/**
 * The definition of a field in a {@link RawType}.
 *
 * <p>{@code RawField} objects are thread-safe.  Multiple threads may safely
 * call the methods of a shared {@code RawField} object.</p>
 *
 * @author Mark Hayes
 */
public interface RawField {

    /**
     * Returns the name of the field.
     *
     * @return the name of the field.
     */
    String getName();

    /**
     * Returns the type of the field, without expanding parameterized types,
     * or null if the type is an interface type or the Object class.
     *
     * @return the type of the field.
     */
    RawType getType();
}
