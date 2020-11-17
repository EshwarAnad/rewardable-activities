/*
 * MIT License
 *
 * Copyright (c) 2020 Jakub Zagórski (jaqobb)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.jaqobb.rewardableactivities.util;

import java.util.concurrent.ThreadLocalRandom;

public final class RandomUtils {

    private RandomUtils() {
        throw new UnsupportedOperationException("Cannot create instance of this class");
    }

    public static int getRandomInt(
        final int minimum,
        final int maximum
    ) {
        return (int) getRandomLong(minimum, maximum);
    }

    public static long getRandomLong(
        final long minimum,
        final long maximum
    ) {
        return (Math.abs(ThreadLocalRandom.current().nextLong()) % ((maximum - minimum) + 1)) + minimum;
    }

    public static double getRandomFloat(
        final float minimum,
        final float maximum
    ) {
        return (ThreadLocalRandom.current().nextFloat() * (maximum - minimum)) + minimum;
    }

    public static double getRandomDouble(
        final double minimum,
        final double maximum
    ) {
        return (ThreadLocalRandom.current().nextDouble() * (maximum - minimum)) + minimum;
    }

    public static boolean chance(final double chance) {
        return getRandomDouble(0.0D, 100.0D) <= chance;
    }
}
