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
package org.blackdread.camerabinding.jna;

import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : sdk-header\EDSDKTypes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EdsFocusInfo extends Structure {
	/** C type : EdsRect */
	public EdsRect imageRect;
	/** C type : EdsUInt32 */
	public NativeLong pointNumber;
	/** C type : EdsFocusPoint[600] */
	public EdsFrameDesc[] focusPoint = new EdsFrameDesc[600];
	/** C type : EdsUInt32 */
	public NativeLong executeMode;
	public EdsFocusInfo() {
		super();
	}
    @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("imageRect", "pointNumber", "focusPoint", "executeMode");
	}
	/**
	 * @param imageRect C type : EdsRect<br>
	 * @param pointNumber C type : EdsUInt32<br>
	 * @param focusPoint C type : EdsFocusPoint[600]<br>
	 * @param executeMode C type : EdsUInt32
	 */
	public EdsFocusInfo(EdsRect imageRect, NativeLong pointNumber, EdsFrameDesc focusPoint[], NativeLong executeMode) {
		super();
		this.imageRect = imageRect;
		this.pointNumber = pointNumber;
		if ((focusPoint.length != this.focusPoint.length))
			throw new IllegalArgumentException("Wrong array size !");
		this.focusPoint = focusPoint;
		this.executeMode = executeMode;
	}
	public EdsFocusInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsFocusInfo implements Structure.ByReference {

	}
	public static class ByValue extends EdsFocusInfo implements Structure.ByValue {

	}
}
