// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbft.proto

package com.gbft.framework.data;

public interface LearningDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LearningData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;int32, float&gt; report = 1;</code>
   */
  int getReportCount();
  /**
   * <code>map&lt;int32, float&gt; report = 1;</code>
   */
  boolean containsReport(
      int key);
  /**
   * Use {@link #getReportMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Float>
  getReport();
  /**
   * <code>map&lt;int32, float&gt; report = 1;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Float>
  getReportMap();
  /**
   * <code>map&lt;int32, float&gt; report = 1;</code>
   */

  float getReportOrDefault(
      int key,
      float defaultValue);
  /**
   * <code>map&lt;int32, float&gt; report = 1;</code>
   */

  float getReportOrThrow(
      int key);

  /**
   * <code>string next_protocol = 2;</code>
   * @return The nextProtocol.
   */
  java.lang.String getNextProtocol();
  /**
   * <code>string next_protocol = 2;</code>
   * @return The bytes for nextProtocol.
   */
  com.google.protobuf.ByteString
      getNextProtocolBytes();
}
