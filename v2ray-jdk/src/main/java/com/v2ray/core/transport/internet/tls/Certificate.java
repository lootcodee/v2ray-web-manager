// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/tls/config.proto

package com.v2ray.core.transport.internet.tls;

/**
 * Protobuf type {@code v2ray.core.transport.internet.tls.Certificate}
 */
public  final class Certificate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.tls.Certificate)
    CertificateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Certificate.newBuilder() to construct.
  private Certificate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Certificate() {
    certificate_ = com.google.protobuf.ByteString.EMPTY;
    key_ = com.google.protobuf.ByteString.EMPTY;
    usage_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Certificate(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {

            certificate_ = input.readBytes();
            break;
          }
          case 18: {

            key_ = input.readBytes();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            usage_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Certificate_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Certificate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Certificate.class, Builder.class);
  }

  /**
   * Protobuf enum {@code v2ray.core.transport.internet.tls.Certificate.Usage}
   */
  public enum Usage
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ENCIPHERMENT = 0;</code>
     */
    ENCIPHERMENT(0),
    /**
     * <code>AUTHORITY_VERIFY = 1;</code>
     */
    AUTHORITY_VERIFY(1),
    /**
     * <code>AUTHORITY_ISSUE = 2;</code>
     */
    AUTHORITY_ISSUE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ENCIPHERMENT = 0;</code>
     */
    public static final int ENCIPHERMENT_VALUE = 0;
    /**
     * <code>AUTHORITY_VERIFY = 1;</code>
     */
    public static final int AUTHORITY_VERIFY_VALUE = 1;
    /**
     * <code>AUTHORITY_ISSUE = 2;</code>
     */
    public static final int AUTHORITY_ISSUE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static Usage valueOf(int value) {
      return forNumber(value);
    }

    public static Usage forNumber(int value) {
      switch (value) {
        case 0: return ENCIPHERMENT;
        case 1: return AUTHORITY_VERIFY;
        case 2: return AUTHORITY_ISSUE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Usage>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Usage> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Usage>() {
            public Usage findValueByNumber(int number) {
              return Usage.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Certificate.getDescriptor().getEnumTypes().get(0);
    }

    private static final Usage[] VALUES = values();

    public static Usage valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Usage(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:v2ray.core.transport.internet.tls.Certificate.Usage)
  }

  public static final int CERTIFICATE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString certificate_;
  /**
   * <pre>
   * TLS certificate in x509 format.
   * </pre>
   *
   * <code>bytes Certificate = 1;</code>
   */
  public com.google.protobuf.ByteString getCertificate() {
    return certificate_;
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString key_;
  /**
   * <pre>
   * TLS key in x509 format.
   * </pre>
   *
   * <code>bytes Key = 2;</code>
   */
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int USAGE_FIELD_NUMBER = 3;
  private int usage_;
  /**
   * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
   */
  public int getUsageValue() {
    return usage_;
  }
  /**
   * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
   */
  public Usage getUsage() {
    @SuppressWarnings("deprecation")
    Usage result = Usage.valueOf(usage_);
    return result == null ? Usage.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!certificate_.isEmpty()) {
      output.writeBytes(1, certificate_);
    }
    if (!key_.isEmpty()) {
      output.writeBytes(2, key_);
    }
    if (usage_ != Usage.ENCIPHERMENT.getNumber()) {
      output.writeEnum(3, usage_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!certificate_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, certificate_);
    }
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, key_);
    }
    if (usage_ != Usage.ENCIPHERMENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, usage_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Certificate)) {
      return super.equals(obj);
    }
    Certificate other = (Certificate) obj;

    if (!getCertificate()
        .equals(other.getCertificate())) return false;
    if (!getKey()
        .equals(other.getKey())) return false;
    if (usage_ != other.usage_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
    hash = (53 * hash) + getCertificate().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + USAGE_FIELD_NUMBER;
    hash = (53 * hash) + usage_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Certificate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Certificate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Certificate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Certificate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Certificate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Certificate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Certificate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Certificate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Certificate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Certificate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Certificate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Certificate parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Certificate prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code v2ray.core.transport.internet.tls.Certificate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.tls.Certificate)
      com.v2ray.core.transport.internet.tls.CertificateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Certificate_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Certificate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Certificate.class, Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.tls.Certificate.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      certificate_ = com.google.protobuf.ByteString.EMPTY;

      key_ = com.google.protobuf.ByteString.EMPTY;

      usage_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.tls.ConfigOuterClass.internal_static_v2ray_core_transport_internet_tls_Certificate_descriptor;
    }

    @Override
    public Certificate getDefaultInstanceForType() {
      return Certificate.getDefaultInstance();
    }

    @Override
    public Certificate build() {
      Certificate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Certificate buildPartial() {
      Certificate result = new Certificate(this);
      result.certificate_ = certificate_;
      result.key_ = key_;
      result.usage_ = usage_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Certificate) {
        return mergeFrom((Certificate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Certificate other) {
      if (other == Certificate.getDefaultInstance()) return this;
      if (other.getCertificate() != com.google.protobuf.ByteString.EMPTY) {
        setCertificate(other.getCertificate());
      }
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.usage_ != 0) {
        setUsageValue(other.getUsageValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Certificate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Certificate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString certificate_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * TLS certificate in x509 format.
     * </pre>
     *
     * <code>bytes Certificate = 1;</code>
     */
    public com.google.protobuf.ByteString getCertificate() {
      return certificate_;
    }
    /**
     * <pre>
     * TLS certificate in x509 format.
     * </pre>
     *
     * <code>bytes Certificate = 1;</code>
     */
    public Builder setCertificate(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      certificate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TLS certificate in x509 format.
     * </pre>
     *
     * <code>bytes Certificate = 1;</code>
     */
    public Builder clearCertificate() {
      
      certificate_ = getDefaultInstance().getCertificate();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * TLS key in x509 format.
     * </pre>
     *
     * <code>bytes Key = 2;</code>
     */
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * TLS key in x509 format.
     * </pre>
     *
     * <code>bytes Key = 2;</code>
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TLS key in x509 format.
     * </pre>
     *
     * <code>bytes Key = 2;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private int usage_ = 0;
    /**
     * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
     */
    public int getUsageValue() {
      return usage_;
    }
    /**
     * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
     */
    public Builder setUsageValue(int value) {
      usage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
     */
    public Usage getUsage() {
      @SuppressWarnings("deprecation")
      Usage result = Usage.valueOf(usage_);
      return result == null ? Usage.UNRECOGNIZED : result;
    }
    /**
     * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
     */
    public Builder setUsage(Usage value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      usage_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.v2ray.core.transport.internet.tls.Certificate.Usage usage = 3;</code>
     */
    public Builder clearUsage() {
      
      usage_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.tls.Certificate)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.tls.Certificate)
  private static final Certificate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Certificate();
  }

  public static Certificate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Certificate>
      PARSER = new com.google.protobuf.AbstractParser<Certificate>() {
    @Override
    public Certificate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Certificate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Certificate> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Certificate> getParserForType() {
    return PARSER;
  }

  @Override
  public Certificate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

