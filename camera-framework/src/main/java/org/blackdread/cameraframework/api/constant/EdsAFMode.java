/*
 * MIT License
 *
 * Copyright (c) 2018-2019 Yoann CAPLAIN
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
package org.blackdread.cameraframework.api.constant;

/**
 * Auto-Focus Mode Values
 * <br>
 * Indicates AF mode settings values
 * <br>
 * It is read-only (only get from API)
 * <br>
 * See API Reference - 5.2.22 kEdsPropID_AFMode
 * <p>Created on 2018/10/04.<p>
 *
 * @author Yoann CAPLAIN
 * @since 1.0.0
 */
public enum EdsAFMode implements NativeEnum<Integer> {
    kEdsAFMode_OneShot(0, "One-Shot AF"),
    kEdsAFMode_AIServo(1, "AI Servo AF"),
    kEdsAFMode_AIFocus(2, "AI Focus AF"),
    kEdsAFMode_Manual(3, "Manual Focus"),
    kEdsAFMode_Unknown(0xFFFFFFFF, "Not valid/no settings changes");

    private final int value;
    private final String description;

    EdsAFMode(final int value, final String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public final Integer value() {
        return value;
    }

    @Override
    public final String description() {
        return description;
    }

    /**
     * @param value value to search
     * @return enum having same value as passed
     * @throws IllegalArgumentException if value was not found
     */
    public static EdsAFMode ofValue(final Integer value) {
        return ConstantUtil.ofValue(EdsAFMode.class, value);
    }
}
