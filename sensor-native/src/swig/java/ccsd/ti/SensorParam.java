/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.21
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ccsd.ti;


public class SensorParam {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SensorParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      NativeBridgeJNI.delete_SensorParam(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected static long getCPtr(SensorParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public void setKey(String key) {
    NativeBridgeJNI.set_SensorParam_key(swigCPtr, key);
  }

  public String getKey() {
    return NativeBridgeJNI.get_SensorParam_key(swigCPtr);
  }

  public void setValue(String value) {
    NativeBridgeJNI.set_SensorParam_value(swigCPtr, value);
  }

  public String getValue() {
    return NativeBridgeJNI.get_SensorParam_value(swigCPtr);
  }

  public SensorParam() {
    this(NativeBridgeJNI.new_SensorParam(), true);
  }

}
