/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2019 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.takes.misc;

import java.util.Locale;

/**
 * English lower case string representation.
 * @since 0.33
 * @todo #918:30min Remove this class in favour of
 *  {@link org.cactoos.text.Lowered} which does the same. Find all usages of
 *  this class in the project and replace by suggested
 *  {@link org.cactoos.text.Lowered} class.
 */
public final class EnglishLowerCase {

    /**
     * String value.
     */
    private final String value;

    /**
     * Ctor.
     * @param text Text value
     */
    public EnglishLowerCase(final CharSequence text) {
        this(text.toString());
    }

    /**
     * Ctor.
     * @param string String value
     */
    public EnglishLowerCase(final String string) {
        this.value = string;
    }

    /**
     * Returns string value.
     * @return String value
     */
    public String string() {
        return this.value.toLowerCase(Locale.ENGLISH);
    }

}
