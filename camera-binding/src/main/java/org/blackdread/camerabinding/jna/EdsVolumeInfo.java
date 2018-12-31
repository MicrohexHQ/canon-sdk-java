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
public class EdsVolumeInfo extends Structure {
	/** C type : EdsUInt32 */
	public NativeLong storageType;
	/** C type : EdsAccess */
	public int access;
	/** C type : EdsUInt64 */
	public long maxCapacity;
	/** C type : EdsUInt64 */
	public long freeSpaceInBytes;
	/** C type : EdsChar[256] */
	public byte[] szVolumeLabel = new byte[256];
	public EdsVolumeInfo() {
		super();
	}
    @Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("storageType", "access", "maxCapacity", "freeSpaceInBytes", "szVolumeLabel");
	}
	/**
	 * @param storageType C type : EdsUInt32<br>
	 * @param access C type : EdsAccess<br>
	 * @param maxCapacity C type : EdsUInt64<br>
	 * @param freeSpaceInBytes C type : EdsUInt64<br>
	 * @param szVolumeLabel C type : EdsChar[256]
	 */
	public EdsVolumeInfo(NativeLong storageType, int access, long maxCapacity, long freeSpaceInBytes, byte szVolumeLabel[]) {
		super();
		this.storageType = storageType;
		this.access = access;
		this.maxCapacity = maxCapacity;
		this.freeSpaceInBytes = freeSpaceInBytes;
		if ((szVolumeLabel.length != this.szVolumeLabel.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szVolumeLabel = szVolumeLabel;
	}
	public EdsVolumeInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EdsVolumeInfo implements Structure.ByReference {
		
	}
	public static class ByValue extends EdsVolumeInfo implements Structure.ByValue {
		
	}
}
