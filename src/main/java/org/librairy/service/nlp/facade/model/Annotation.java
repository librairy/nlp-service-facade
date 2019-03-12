/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.librairy.service.nlp.facade.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Annotation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Annotation\",\"namespace\":\"org.librairy.service.nlp.facade.model\",\"fields\":[{\"name\":\"token\",\"type\":{\"type\":\"record\",\"name\":\"Token\",\"fields\":[{\"name\":\"target\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"order\":\"ignore\"},{\"name\":\"lemma\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"morphoFeat\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"order\":\"ignore\"},{\"name\":\"pos\",\"type\":{\"type\":\"enum\",\"name\":\"PoS\",\"symbols\":[\"NOUN\",\"VERB\",\"ADJECTIVE\",\"ADVERB\",\"PRONOUN\",\"PREPOSITION\",\"CONJUNCTION\",\"INTERJECTION\",\"ARTICLE\",\"PUNCTUATION\",\"NUMBER\",\"DATE\"]},\"order\":\"ignore\"},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"order\":\"ignore\"}]}},{\"name\":\"offset\",\"type\":\"long\",\"order\":\"ignore\"},{\"name\":\"sentiment\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"order\":\"ignore\"},{\"name\":\"uri\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"order\":\"ignore\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private org.librairy.service.nlp.facade.model.Token token;
   private long offset;
   private java.lang.String sentiment;
   private java.lang.String uri;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Annotation() {}

  /**
   * All-args constructor.
   */
  public Annotation(org.librairy.service.nlp.facade.model.Token token, java.lang.Long offset, java.lang.String sentiment, java.lang.String uri) {
    this.token = token;
    this.offset = offset;
    this.sentiment = sentiment;
    this.uri = uri;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return token;
    case 1: return offset;
    case 2: return sentiment;
    case 3: return uri;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: token = (org.librairy.service.nlp.facade.model.Token)value$; break;
    case 1: offset = (java.lang.Long)value$; break;
    case 2: sentiment = (java.lang.String)value$; break;
    case 3: uri = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'token' field.
   */
  public org.librairy.service.nlp.facade.model.Token getToken() {
    return token;
  }

  /**
   * Sets the value of the 'token' field.
   * @param value the value to set.
   */
  public void setToken(org.librairy.service.nlp.facade.model.Token value) {
    this.token = value;
  }

  /**
   * Gets the value of the 'offset' field.
   */
  public java.lang.Long getOffset() {
    return offset;
  }

  /**
   * Sets the value of the 'offset' field.
   * @param value the value to set.
   */
  public void setOffset(java.lang.Long value) {
    this.offset = value;
  }

  /**
   * Gets the value of the 'sentiment' field.
   */
  public java.lang.String getSentiment() {
    return sentiment;
  }

  /**
   * Sets the value of the 'sentiment' field.
   * @param value the value to set.
   */
  public void setSentiment(java.lang.String value) {
    this.sentiment = value;
  }

  /**
   * Gets the value of the 'uri' field.
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Sets the value of the 'uri' field.
   * @param value the value to set.
   */
  public void setUri(java.lang.String value) {
    this.uri = value;
  }

  /** Creates a new Annotation RecordBuilder */
  public static org.librairy.service.nlp.facade.model.Annotation.Builder newBuilder() {
    return new org.librairy.service.nlp.facade.model.Annotation.Builder();
  }
  
  /** Creates a new Annotation RecordBuilder by copying an existing Builder */
  public static org.librairy.service.nlp.facade.model.Annotation.Builder newBuilder(org.librairy.service.nlp.facade.model.Annotation.Builder other) {
    return new org.librairy.service.nlp.facade.model.Annotation.Builder(other);
  }
  
  /** Creates a new Annotation RecordBuilder by copying an existing Annotation instance */
  public static org.librairy.service.nlp.facade.model.Annotation.Builder newBuilder(org.librairy.service.nlp.facade.model.Annotation other) {
    return new org.librairy.service.nlp.facade.model.Annotation.Builder(other);
  }
  
  /**
   * RecordBuilder for Annotation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Annotation>
    implements org.apache.avro.data.RecordBuilder<Annotation> {

    private org.librairy.service.nlp.facade.model.Token token;
    private long offset;
    private java.lang.String sentiment;
    private java.lang.String uri;

    /** Creates a new Builder */
    private Builder() {
      super(org.librairy.service.nlp.facade.model.Annotation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.librairy.service.nlp.facade.model.Annotation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.token)) {
        this.token = data().deepCopy(fields()[0].schema(), other.token);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.offset)) {
        this.offset = data().deepCopy(fields()[1].schema(), other.offset);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sentiment)) {
        this.sentiment = data().deepCopy(fields()[2].schema(), other.sentiment);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.uri)) {
        this.uri = data().deepCopy(fields()[3].schema(), other.uri);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Annotation instance */
    private Builder(org.librairy.service.nlp.facade.model.Annotation other) {
            super(org.librairy.service.nlp.facade.model.Annotation.SCHEMA$);
      if (isValidValue(fields()[0], other.token)) {
        this.token = data().deepCopy(fields()[0].schema(), other.token);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.offset)) {
        this.offset = data().deepCopy(fields()[1].schema(), other.offset);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sentiment)) {
        this.sentiment = data().deepCopy(fields()[2].schema(), other.sentiment);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.uri)) {
        this.uri = data().deepCopy(fields()[3].schema(), other.uri);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'token' field */
    public org.librairy.service.nlp.facade.model.Token getToken() {
      return token;
    }
    
    /** Sets the value of the 'token' field */
    public org.librairy.service.nlp.facade.model.Annotation.Builder setToken(org.librairy.service.nlp.facade.model.Token value) {
      validate(fields()[0], value);
      this.token = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'token' field has been set */
    public boolean hasToken() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'token' field */
    public org.librairy.service.nlp.facade.model.Annotation.Builder clearToken() {
      token = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'offset' field */
    public java.lang.Long getOffset() {
      return offset;
    }
    
    /** Sets the value of the 'offset' field */
    public org.librairy.service.nlp.facade.model.Annotation.Builder setOffset(long value) {
      validate(fields()[1], value);
      this.offset = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'offset' field has been set */
    public boolean hasOffset() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'offset' field */
    public org.librairy.service.nlp.facade.model.Annotation.Builder clearOffset() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'sentiment' field */
    public java.lang.String getSentiment() {
      return sentiment;
    }
    
    /** Sets the value of the 'sentiment' field */
    public org.librairy.service.nlp.facade.model.Annotation.Builder setSentiment(java.lang.String value) {
      validate(fields()[2], value);
      this.sentiment = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'sentiment' field has been set */
    public boolean hasSentiment() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'sentiment' field */
    public org.librairy.service.nlp.facade.model.Annotation.Builder clearSentiment() {
      sentiment = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'uri' field */
    public java.lang.String getUri() {
      return uri;
    }
    
    /** Sets the value of the 'uri' field */
    public org.librairy.service.nlp.facade.model.Annotation.Builder setUri(java.lang.String value) {
      validate(fields()[3], value);
      this.uri = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'uri' field has been set */
    public boolean hasUri() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'uri' field */
    public org.librairy.service.nlp.facade.model.Annotation.Builder clearUri() {
      uri = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Annotation build() {
      try {
        Annotation record = new Annotation();
        record.token = fieldSetFlags()[0] ? this.token : (org.librairy.service.nlp.facade.model.Token) defaultValue(fields()[0]);
        record.offset = fieldSetFlags()[1] ? this.offset : (java.lang.Long) defaultValue(fields()[1]);
        record.sentiment = fieldSetFlags()[2] ? this.sentiment : (java.lang.String) defaultValue(fields()[2]);
        record.uri = fieldSetFlags()[3] ? this.uri : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
