package org.concord.sensor.labprousb.jna;

public interface LabProUSB {

	public abstract short open();

	public abstract short close();

	public abstract short isOpen();

	public abstract int getAvailableBytes();

	public abstract int readBytes(int numBytes, byte[] buffer);

	public abstract short writeBytes(short numBytes, byte[] buffer);

	public abstract short clearInputs(short ignored);

	public abstract short setNumChannelsAndModes(int numChannels,
			short binaryMode, short realTime);

}