// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package com.amit.converse.common;

public interface SendMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chat.SendMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chat.ChatMessage message = 1;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>.chat.ChatMessage message = 1;</code>
   * @return The message.
   */
  com.amit.converse.common.ChatMessage getMessage();
  /**
   * <code>.chat.ChatMessage message = 1;</code>
   */
  com.amit.converse.common.ChatMessageOrBuilder getMessageOrBuilder();
}
