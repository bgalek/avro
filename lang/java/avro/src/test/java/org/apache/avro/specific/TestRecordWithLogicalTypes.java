/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.avro.specific;

import org.apache.avro.Conversions;
import org.apache.avro.data.TimeConversions;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TestRecordWithLogicalTypes extends org.apache.avro.specific.SpecificRecordBase
    implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3313339903648295220L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse(
      "{\"type\":\"record\",\"name\":\"TestRecordWithLogicalTypes\",\"namespace\":\"org.apache.avro.specific\",\"fields\":[{\"name\":\"b\",\"type\":\"boolean\"},{\"name\":\"i32\",\"type\":\"int\"},{\"name\":\"i64\",\"type\":\"long\"},{\"name\":\"f32\",\"type\":\"float\"},{\"name\":\"f64\",\"type\":\"double\"},{\"name\":\"s\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"d\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"t\",\"type\":{\"type\":\"int\",\"logicalType\":\"time-millis\"}},{\"name\":\"ts\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"dec\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":9,\"scale\":2}},{\"name\":\"bd\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"big-decimal\"}}]}");

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TestRecordWithLogicalTypes> ENCODER = new BinaryMessageEncoder<TestRecordWithLogicalTypes>(
      MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TestRecordWithLogicalTypes> DECODER = new BinaryMessageDecoder<TestRecordWithLogicalTypes>(
      MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<TestRecordWithLogicalTypes> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the
   * specified {@link SchemaStore}.
   *
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<TestRecordWithLogicalTypes> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TestRecordWithLogicalTypes>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this TestRecordWithLogicalTypes to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a TestRecordWithLogicalTypes from a ByteBuffer. */
  public static TestRecordWithLogicalTypes fromByteBuffer(java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated
  public boolean b;
  @Deprecated
  public int i32;
  @Deprecated
  public long i64;
  @Deprecated
  public float f32;
  @Deprecated
  public double f64;
  @Deprecated
  public java.lang.CharSequence s;
  @Deprecated
  public java.time.LocalDate d;
  @Deprecated
  public java.time.LocalTime t;
  @Deprecated
  public java.time.Instant ts;
  @Deprecated
  public java.math.BigDecimal dec;
  @Deprecated
  public java.math.BigDecimal bd;

  /**
   * Default constructor. Note that this does not initialize fields to their
   * default values from the schema. If that is desired then one should use
   * <code>newBuilder()</code>.
   */
  public TestRecordWithLogicalTypes() {
  }

  /**
   * All-args constructor.
   *
   * @param b   The new value for b
   * @param i32 The new value for i32
   * @param i64 The new value for i64
   * @param f32 The new value for f32
   * @param f64 The new value for f64
   * @param s   The new value for s
   * @param d   The new value for d
   * @param t   The new value for t
   * @param ts  The new value for ts
   * @param dec The new value for dec
   * @param bd  The new value for bd
   */
  public TestRecordWithLogicalTypes(java.lang.Boolean b, java.lang.Integer i32, java.lang.Long i64, java.lang.Float f32,
      java.lang.Double f64, java.lang.CharSequence s, java.time.LocalDate d, java.time.LocalTime t,
      java.time.Instant ts, java.math.BigDecimal dec, java.math.BigDecimal bd) {
    this.b = b;
    this.i32 = i32;
    this.i64 = i64;
    this.f32 = f32;
    this.f64 = f64;
    this.s = s;
    this.d = d;
    this.t = t;
    this.ts = ts;
    this.dec = dec;
    this.bd = bd;
  }

  @Override
  @org.apache.avro.specific.AvroInternal
  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter. Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0:
      return b;
    case 1:
      return i32;
    case 2:
      return i64;
    case 3:
      return f32;
    case 4:
      return f64;
    case 5:
      return s;
    case 6:
      return d;
    case 7:
      return t;
    case 8:
      return ts;
    case 9:
      return dec;
    case 10:
      return bd;
    default:
      throw new org.apache.avro.AvroRuntimeException("Bad index " + field$);
    }
  }

  protected static final org.apache.avro.Conversions.DecimalConversion DECIMAL_CONVERSION = new org.apache.avro.Conversions.DecimalConversion();

  protected static final Conversions.BigDecimalConversion BIG_DECIMAL_CONVERSION = new org.apache.avro.Conversions.BigDecimalConversion();

  protected static final TimeConversions.DateConversion DATE_CONVERSION = new TimeConversions.DateConversion();
  protected static final TimeConversions.TimeMillisConversion TIME_CONVERSION = new TimeConversions.TimeMillisConversion();
  protected static final TimeConversions.TimestampMillisConversion TIMESTAMP_CONVERSION = new TimeConversions.TimestampMillisConversion();

  private static final org.apache.avro.Conversion<?>[] conversions = new org.apache.avro.Conversion<?>[] { null, null,
      null, null, null, null, DATE_CONVERSION, TIME_CONVERSION, TIMESTAMP_CONVERSION, DECIMAL_CONVERSION,
      BIG_DECIMAL_CONVERSION };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader. Applications should not call.
  @SuppressWarnings(value = "unchecked")
  @Override
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0:
      b = (java.lang.Boolean) value$;
      break;
    case 1:
      i32 = (java.lang.Integer) value$;
      break;
    case 2:
      i64 = (java.lang.Long) value$;
      break;
    case 3:
      f32 = (java.lang.Float) value$;
      break;
    case 4:
      f64 = (java.lang.Double) value$;
      break;
    case 5:
      s = (java.lang.CharSequence) value$;
      break;
    case 6:
      d = (java.time.LocalDate) value$;
      break;
    case 7:
      t = (java.time.LocalTime) value$;
      break;
    case 8:
      ts = (java.time.Instant) value$;
      break;
    case 9:
      dec = (java.math.BigDecimal) value$;
      break;
    case 10:
      bd = (java.math.BigDecimal) value$;
      break;
    default:
      throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'b' field.
   *
   * @return The value of the 'b' field.
   */
  public java.lang.Boolean getB() {
    return b;
  }

  /**
   * Sets the value of the 'b' field.
   *
   * @param value the value to set.
   */
  public void setB(java.lang.Boolean value) {
    this.b = value;
  }

  /**
   * Gets the value of the 'i32' field.
   *
   * @return The value of the 'i32' field.
   */
  public java.lang.Integer getI32() {
    return i32;
  }

  /**
   * Sets the value of the 'i32' field.
   *
   * @param value the value to set.
   */
  public void setI32(java.lang.Integer value) {
    this.i32 = value;
  }

  /**
   * Gets the value of the 'i64' field.
   *
   * @return The value of the 'i64' field.
   */
  public java.lang.Long getI64() {
    return i64;
  }

  /**
   * Sets the value of the 'i64' field.
   *
   * @param value the value to set.
   */
  public void setI64(java.lang.Long value) {
    this.i64 = value;
  }

  /**
   * Gets the value of the 'f32' field.
   *
   * @return The value of the 'f32' field.
   */
  public java.lang.Float getF32() {
    return f32;
  }

  /**
   * Sets the value of the 'f32' field.
   *
   * @param value the value to set.
   */
  public void setF32(java.lang.Float value) {
    this.f32 = value;
  }

  /**
   * Gets the value of the 'f64' field.
   *
   * @return The value of the 'f64' field.
   */
  public java.lang.Double getF64() {
    return f64;
  }

  /**
   * Sets the value of the 'f64' field.
   *
   * @param value the value to set.
   */
  public void setF64(java.lang.Double value) {
    this.f64 = value;
  }

  /**
   * Gets the value of the 's' field.
   *
   * @return The value of the 's' field.
   */
  public java.lang.CharSequence getS() {
    return s;
  }

  /**
   * Sets the value of the 's' field.
   *
   * @param value the value to set.
   */
  public void setS(java.lang.CharSequence value) {
    this.s = value;
  }

  /**
   * Gets the value of the 'd' field.
   *
   * @return The value of the 'd' field.
   */
  public java.time.LocalDate getD() {
    return d;
  }

  /**
   * Sets the value of the 'd' field.
   *
   * @param value the value to set.
   */
  public void setD(java.time.LocalDate value) {
    this.d = value;
  }

  /**
   * Gets the value of the 't' field.
   *
   * @return The value of the 't' field.
   */
  public java.time.LocalTime getT() {
    return t;
  }

  /**
   * Sets the value of the 't' field.
   *
   * @param value the value to set.
   */
  public void setT(java.time.LocalTime value) {
    this.t = value;
  }

  /**
   * Gets the value of the 'ts' field.
   *
   * @return The value of the 'ts' field.
   */
  public java.time.Instant getTs() {
    return ts;
  }

  /**
   * Sets the value of the 'ts' field.
   *
   * @param value the value to set.
   */
  public void setTs(java.time.Instant value) {
    this.ts = value;
  }

  /**
   * Gets the value of the 'dec' field.
   *
   * @return The value of the 'dec' field.
   */
  public java.math.BigDecimal getDec() {
    return dec;
  }

  /**
   * Sets the value of the 'dec' field.
   *
   * @param value the value to set.
   */
  public void setDec(java.math.BigDecimal value) {
    this.dec = value;
  }

  /**
   * Creates a new TestRecordWithLogicalTypes RecordBuilder.
   *
   * @return A new TestRecordWithLogicalTypes RecordBuilder
   */
  public static TestRecordWithLogicalTypes.Builder newBuilder() {
    return new TestRecordWithLogicalTypes.Builder();
  }

  /**
   * Creates a new TestRecordWithLogicalTypes RecordBuilder by copying an existing
   * Builder.
   *
   * @param other The existing builder to copy.
   * @return A new TestRecordWithLogicalTypes RecordBuilder
   */
  public static TestRecordWithLogicalTypes.Builder newBuilder(TestRecordWithLogicalTypes.Builder other) {
    if (other == null) {
      return new TestRecordWithLogicalTypes.Builder();
    } else {
      return new TestRecordWithLogicalTypes.Builder(other);
    }
  }

  /**
   * Creates a new TestRecordWithLogicalTypes RecordBuilder by copying an existing
   * TestRecordWithLogicalTypes instance.
   *
   * @param other The existing instance to copy.
   * @return A new TestRecordWithLogicalTypes RecordBuilder
   */
  public static TestRecordWithLogicalTypes.Builder newBuilder(TestRecordWithLogicalTypes other) {
    if (other == null) {
      return new TestRecordWithLogicalTypes.Builder();
    } else {
      return new TestRecordWithLogicalTypes.Builder(other);
    }
  }

  /**
   * RecordBuilder for TestRecordWithLogicalTypes instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TestRecordWithLogicalTypes>
      implements org.apache.avro.data.RecordBuilder<TestRecordWithLogicalTypes> {

    private boolean b;
    private int i32;
    private long i64;
    private float f32;
    private double f64;
    private java.lang.CharSequence s;
    private java.time.LocalDate d;
    private java.time.LocalTime t;
    private java.time.Instant ts;
    private java.math.BigDecimal dec;

    private java.math.BigDecimal bd;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     *
     * @param other The existing Builder to copy.
     */
    private Builder(TestRecordWithLogicalTypes.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.b)) {
        this.b = data().deepCopy(fields()[0].schema(), other.b);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.i32)) {
        this.i32 = data().deepCopy(fields()[1].schema(), other.i32);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.i64)) {
        this.i64 = data().deepCopy(fields()[2].schema(), other.i64);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.f32)) {
        this.f32 = data().deepCopy(fields()[3].schema(), other.f32);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.f64)) {
        this.f64 = data().deepCopy(fields()[4].schema(), other.f64);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.s)) {
        this.s = data().deepCopy(fields()[5].schema(), other.s);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.d)) {
        this.d = data().deepCopy(fields()[6].schema(), other.d);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.t)) {
        this.t = data().deepCopy(fields()[7].schema(), other.t);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.ts)) {
        this.ts = data().deepCopy(fields()[8].schema(), other.ts);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.dec)) {
        this.dec = data().deepCopy(fields()[9].schema(), other.dec);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
      if (isValidValue(fields()[10], other.bd)) {
        this.bd = data().deepCopy(fields()[10].schema(), other.bd);
        fieldSetFlags()[10] = other.fieldSetFlags()[10];
      }
    }

    /**
     * Creates a Builder by copying an existing TestRecordWithLogicalTypes instance
     *
     * @param other The existing instance to copy.
     */
    private Builder(TestRecordWithLogicalTypes other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.b)) {
        this.b = data().deepCopy(fields()[0].schema(), other.b);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.i32)) {
        this.i32 = data().deepCopy(fields()[1].schema(), other.i32);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.i64)) {
        this.i64 = data().deepCopy(fields()[2].schema(), other.i64);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.f32)) {
        this.f32 = data().deepCopy(fields()[3].schema(), other.f32);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.f64)) {
        this.f64 = data().deepCopy(fields()[4].schema(), other.f64);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.s)) {
        this.s = data().deepCopy(fields()[5].schema(), other.s);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.d)) {
        this.d = data().deepCopy(fields()[6].schema(), other.d);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.t)) {
        this.t = data().deepCopy(fields()[7].schema(), other.t);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.ts)) {
        this.ts = data().deepCopy(fields()[8].schema(), other.ts);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.dec)) {
        this.dec = data().deepCopy(fields()[9].schema(), other.dec);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.bd)) {
        this.bd = data().deepCopy(fields()[10].schema(), other.bd);
        fieldSetFlags()[10] = true;
      }
    }

    /**
     * Gets the value of the 'b' field.
     *
     * @return The value.
     */
    public java.lang.Boolean getB() {
      return b;
    }

    /**
     * Sets the value of the 'b' field.
     *
     * @param value The value of 'b'.
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder setB(boolean value) {
      validate(fields()[0], value);
      this.b = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'b' field has been set.
     *
     * @return True if the 'b' field has been set, false otherwise.
     */
    public boolean hasB() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'b' field.
     *
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder clearB() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'i32' field.
     *
     * @return The value.
     */
    public java.lang.Integer getI32() {
      return i32;
    }

    /**
     * Sets the value of the 'i32' field.
     *
     * @param value The value of 'i32'.
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder setI32(int value) {
      validate(fields()[1], value);
      this.i32 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'i32' field has been set.
     *
     * @return True if the 'i32' field has been set, false otherwise.
     */
    public boolean hasI32() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'i32' field.
     *
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder clearI32() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
     * Gets the value of the 'i64' field.
     *
     * @return The value.
     */
    public java.lang.Long getI64() {
      return i64;
    }

    /**
     * Sets the value of the 'i64' field.
     *
     * @param value The value of 'i64'.
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder setI64(long value) {
      validate(fields()[2], value);
      this.i64 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
     * Checks whether the 'i64' field has been set.
     *
     * @return True if the 'i64' field has been set, false otherwise.
     */
    public boolean hasI64() {
      return fieldSetFlags()[2];
    }

    /**
     * Clears the value of the 'i64' field.
     *
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder clearI64() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
     * Gets the value of the 'f32' field.
     *
     * @return The value.
     */
    public java.lang.Float getF32() {
      return f32;
    }

    /**
     * Sets the value of the 'f32' field.
     *
     * @param value The value of 'f32'.
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder setF32(float value) {
      validate(fields()[3], value);
      this.f32 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
     * Checks whether the 'f32' field has been set.
     *
     * @return True if the 'f32' field has been set, false otherwise.
     */
    public boolean hasF32() {
      return fieldSetFlags()[3];
    }

    /**
     * Clears the value of the 'f32' field.
     *
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder clearF32() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
     * Gets the value of the 'f64' field.
     *
     * @return The value.
     */
    public java.lang.Double getF64() {
      return f64;
    }

    /**
     * Sets the value of the 'f64' field.
     *
     * @param value The value of 'f64'.
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder setF64(double value) {
      validate(fields()[4], value);
      this.f64 = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
     * Checks whether the 'f64' field has been set.
     *
     * @return True if the 'f64' field has been set, false otherwise.
     */
    public boolean hasF64() {
      return fieldSetFlags()[4];
    }

    /**
     * Clears the value of the 'f64' field.
     *
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder clearF64() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
     * Gets the value of the 's' field.
     *
     * @return The value.
     */
    public java.lang.CharSequence getS() {
      return s;
    }

    /**
     * Sets the value of the 's' field.
     *
     * @param value The value of 's'.
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder setS(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.s = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
     * Checks whether the 's' field has been set.
     *
     * @return True if the 's' field has been set, false otherwise.
     */
    public boolean hasS() {
      return fieldSetFlags()[5];
    }

    /**
     * Clears the value of the 's' field.
     *
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder clearS() {
      s = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
     * Gets the value of the 'd' field.
     *
     * @return The value.
     */
    public java.time.LocalDate getD() {
      return d;
    }

    /**
     * Sets the value of the 'd' field.
     *
     * @param value The value of 'd'.
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder setD(java.time.LocalDate value) {
      validate(fields()[6], value);
      this.d = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
     * Checks whether the 'd' field has been set.
     *
     * @return True if the 'd' field has been set, false otherwise.
     */
    public boolean hasD() {
      return fieldSetFlags()[6];
    }

    /**
     * Clears the value of the 'd' field.
     *
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder clearD() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
     * Gets the value of the 't' field.
     *
     * @return The value.
     */
    public java.time.LocalTime getT() {
      return t;
    }

    /**
     * Sets the value of the 't' field.
     *
     * @param value The value of 't'.
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder setT(java.time.LocalTime value) {
      validate(fields()[7], value);
      this.t = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
     * Checks whether the 't' field has been set.
     *
     * @return True if the 't' field has been set, false otherwise.
     */
    public boolean hasT() {
      return fieldSetFlags()[7];
    }

    /**
     * Clears the value of the 't' field.
     *
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder clearT() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
     * Gets the value of the 'ts' field.
     *
     * @return The value.
     */
    public java.time.Instant getTs() {
      return ts;
    }

    /**
     * Sets the value of the 'ts' field.
     *
     * @param value The value of 'ts'.
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder setTs(java.time.Instant value) {
      validate(fields()[8], value);
      this.ts = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
     * Checks whether the 'ts' field has been set.
     *
     * @return True if the 'ts' field has been set, false otherwise.
     */
    public boolean hasTs() {
      return fieldSetFlags()[8];
    }

    /**
     * Clears the value of the 'ts' field.
     *
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder clearTs() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
     * Gets the value of the 'dec' field.
     *
     * @return The value.
     */
    public java.math.BigDecimal getDec() {
      return dec;
    }

    /**
     * Sets the value of the 'dec' field.
     *
     * @param value The value of 'dec'.
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder setDec(java.math.BigDecimal value) {
      validate(fields()[9], value);
      this.dec = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
     * Checks whether the 'dec' field has been set.
     *
     * @return True if the 'dec' field has been set, false otherwise.
     */
    public boolean hasDec() {
      return fieldSetFlags()[9];
    }

    /**
     * Clears the value of the 'dec' field.
     *
     * @return This builder.
     */
    public TestRecordWithLogicalTypes.Builder clearDec() {
      dec = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TestRecordWithLogicalTypes build() {
      try {
        TestRecordWithLogicalTypes record = new TestRecordWithLogicalTypes();
        record.b = fieldSetFlags()[0] ? this.b : (java.lang.Boolean) defaultValue(fields()[0]);
        record.i32 = fieldSetFlags()[1] ? this.i32 : (java.lang.Integer) defaultValue(fields()[1]);
        record.i64 = fieldSetFlags()[2] ? this.i64 : (java.lang.Long) defaultValue(fields()[2]);
        record.f32 = fieldSetFlags()[3] ? this.f32 : (java.lang.Float) defaultValue(fields()[3]);
        record.f64 = fieldSetFlags()[4] ? this.f64 : (java.lang.Double) defaultValue(fields()[4]);
        record.s = fieldSetFlags()[5] ? this.s : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.d = fieldSetFlags()[6] ? this.d : (java.time.LocalDate) defaultValue(fields()[6]);
        record.t = fieldSetFlags()[7] ? this.t : (java.time.LocalTime) defaultValue(fields()[7]);
        record.ts = fieldSetFlags()[8] ? this.ts : (java.time.Instant) defaultValue(fields()[8]);
        record.dec = fieldSetFlags()[9] ? this.dec : (java.math.BigDecimal) defaultValue(fields()[9]);
        record.bd = fieldSetFlags()[10] ? this.dec : (java.math.BigDecimal) defaultValue(fields()[10]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TestRecordWithLogicalTypes> WRITER$ = (org.apache.avro.io.DatumWriter<TestRecordWithLogicalTypes>) MODEL$
      .createDatumWriter(SCHEMA$);

  @Override
  public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TestRecordWithLogicalTypes> READER$ = (org.apache.avro.io.DatumReader<TestRecordWithLogicalTypes>) MODEL$
      .createDatumReader(SCHEMA$);

  @Override
  public void readExternal(java.io.ObjectInput in) throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
