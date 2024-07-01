// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package com.amit.converse.common;

public final class ChatProto {
  private ChatProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chat_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chat_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chat_ChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chat_ChatMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chat_SendMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chat_SendMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chat_SendMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chat_SendMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chat_GetMessagesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chat_GetMessagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chat_GetMessagesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chat_GetMessagesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nchat.proto\022\004chat\"$\n\004User\022\n\n\002id\030\001 \001(\t\022\020" +
      "\n\010username\030\002 \001(\t\"c\n\013ChatMessage\022\n\n\002id\030\001 " +
      "\001(\t\022\020\n\010senderId\030\002 \001(\t\022\022\n\nreceiverId\030\003 \001(" +
      "\t\022\017\n\007content\030\004 \001(\t\022\021\n\ttimestamp\030\005 \001(\003\"8\n" +
      "\022SendMessageRequest\022\"\n\007message\030\001 \001(\0132\021.c" +
      "hat.ChatMessage\"5\n\023SendMessageResponse\022\017" +
      "\n\007success\030\001 \001(\010\022\r\n\005error\030\002 \001(\t\"<\n\022GetMes" +
      "sagesRequest\022\016\n\006userId\030\001 \001(\t\022\026\n\016chatWith" +
      "UserId\030\002 \001(\t\":\n\023GetMessagesResponse\022#\n\010m" +
      "essages\030\001 \003(\0132\021.chat.ChatMessage2\225\001\n\013Cha" +
      "tService\022B\n\013SendMessage\022\030.chat.SendMessa" +
      "geRequest\032\031.chat.SendMessageResponse\022B\n\013" +
      "GetMessages\022\030.chat.GetMessagesRequest\032\031." +
      "chat.GetMessagesResponseB\'\n\030com.amit.con" +
      "verse.commonB\tChatProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_chat_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chat_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chat_User_descriptor,
        new java.lang.String[] { "Id", "Username", });
    internal_static_chat_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chat_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chat_ChatMessage_descriptor,
        new java.lang.String[] { "Id", "SenderId", "ReceiverId", "Content", "Timestamp", });
    internal_static_chat_SendMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chat_SendMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chat_SendMessageRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_chat_SendMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chat_SendMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chat_SendMessageResponse_descriptor,
        new java.lang.String[] { "Success", "Error", });
    internal_static_chat_GetMessagesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_chat_GetMessagesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chat_GetMessagesRequest_descriptor,
        new java.lang.String[] { "UserId", "ChatWithUserId", });
    internal_static_chat_GetMessagesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_chat_GetMessagesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chat_GetMessagesResponse_descriptor,
        new java.lang.String[] { "Messages", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
