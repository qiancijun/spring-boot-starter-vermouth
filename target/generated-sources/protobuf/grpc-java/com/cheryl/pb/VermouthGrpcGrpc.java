package com.cheryl.pb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: vermouth_rpc_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VermouthGrpcGrpc {

  private VermouthGrpcGrpc() {}

  public static final String SERVICE_NAME = "vermouth_grpc.VermouthGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cheryl.pb.VermouthRpcService.RegisterToProxyReq,
      com.cheryl.pb.VermouthRpcService.Res> getRegisterToProxyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterToProxy",
      requestType = com.cheryl.pb.VermouthRpcService.RegisterToProxyReq.class,
      responseType = com.cheryl.pb.VermouthRpcService.Res.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cheryl.pb.VermouthRpcService.RegisterToProxyReq,
      com.cheryl.pb.VermouthRpcService.Res> getRegisterToProxyMethod() {
    io.grpc.MethodDescriptor<com.cheryl.pb.VermouthRpcService.RegisterToProxyReq, com.cheryl.pb.VermouthRpcService.Res> getRegisterToProxyMethod;
    if ((getRegisterToProxyMethod = VermouthGrpcGrpc.getRegisterToProxyMethod) == null) {
      synchronized (VermouthGrpcGrpc.class) {
        if ((getRegisterToProxyMethod = VermouthGrpcGrpc.getRegisterToProxyMethod) == null) {
          VermouthGrpcGrpc.getRegisterToProxyMethod = getRegisterToProxyMethod =
              io.grpc.MethodDescriptor.<com.cheryl.pb.VermouthRpcService.RegisterToProxyReq, com.cheryl.pb.VermouthRpcService.Res>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterToProxy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cheryl.pb.VermouthRpcService.RegisterToProxyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cheryl.pb.VermouthRpcService.Res.getDefaultInstance()))
              .setSchemaDescriptor(new VermouthGrpcMethodDescriptorSupplier("RegisterToProxy"))
              .build();
        }
      }
    }
    return getRegisterToProxyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cheryl.pb.VermouthRpcService.CancalReq,
      com.cheryl.pb.VermouthRpcService.Res> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = com.cheryl.pb.VermouthRpcService.CancalReq.class,
      responseType = com.cheryl.pb.VermouthRpcService.Res.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cheryl.pb.VermouthRpcService.CancalReq,
      com.cheryl.pb.VermouthRpcService.Res> getCancelMethod() {
    io.grpc.MethodDescriptor<com.cheryl.pb.VermouthRpcService.CancalReq, com.cheryl.pb.VermouthRpcService.Res> getCancelMethod;
    if ((getCancelMethod = VermouthGrpcGrpc.getCancelMethod) == null) {
      synchronized (VermouthGrpcGrpc.class) {
        if ((getCancelMethod = VermouthGrpcGrpc.getCancelMethod) == null) {
          VermouthGrpcGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<com.cheryl.pb.VermouthRpcService.CancalReq, com.cheryl.pb.VermouthRpcService.Res>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cheryl.pb.VermouthRpcService.CancalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cheryl.pb.VermouthRpcService.Res.getDefaultInstance()))
              .setSchemaDescriptor(new VermouthGrpcMethodDescriptorSupplier("Cancel"))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cheryl.pb.VermouthRpcService.JoinClusterReq,
      com.cheryl.pb.VermouthRpcService.Res> getJoinClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinCluster",
      requestType = com.cheryl.pb.VermouthRpcService.JoinClusterReq.class,
      responseType = com.cheryl.pb.VermouthRpcService.Res.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cheryl.pb.VermouthRpcService.JoinClusterReq,
      com.cheryl.pb.VermouthRpcService.Res> getJoinClusterMethod() {
    io.grpc.MethodDescriptor<com.cheryl.pb.VermouthRpcService.JoinClusterReq, com.cheryl.pb.VermouthRpcService.Res> getJoinClusterMethod;
    if ((getJoinClusterMethod = VermouthGrpcGrpc.getJoinClusterMethod) == null) {
      synchronized (VermouthGrpcGrpc.class) {
        if ((getJoinClusterMethod = VermouthGrpcGrpc.getJoinClusterMethod) == null) {
          VermouthGrpcGrpc.getJoinClusterMethod = getJoinClusterMethod =
              io.grpc.MethodDescriptor.<com.cheryl.pb.VermouthRpcService.JoinClusterReq, com.cheryl.pb.VermouthRpcService.Res>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cheryl.pb.VermouthRpcService.JoinClusterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cheryl.pb.VermouthRpcService.Res.getDefaultInstance()))
              .setSchemaDescriptor(new VermouthGrpcMethodDescriptorSupplier("JoinCluster"))
              .build();
        }
      }
    }
    return getJoinClusterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VermouthGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VermouthGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VermouthGrpcStub>() {
        @java.lang.Override
        public VermouthGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VermouthGrpcStub(channel, callOptions);
        }
      };
    return VermouthGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VermouthGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VermouthGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VermouthGrpcBlockingStub>() {
        @java.lang.Override
        public VermouthGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VermouthGrpcBlockingStub(channel, callOptions);
        }
      };
    return VermouthGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VermouthGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VermouthGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VermouthGrpcFutureStub>() {
        @java.lang.Override
        public VermouthGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VermouthGrpcFutureStub(channel, callOptions);
        }
      };
    return VermouthGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 注册
     * </pre>
     */
    default void registerToProxy(com.cheryl.pb.VermouthRpcService.RegisterToProxyReq request,
        io.grpc.stub.StreamObserver<com.cheryl.pb.VermouthRpcService.Res> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterToProxyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 注销
     * </pre>
     */
    default void cancel(com.cheryl.pb.VermouthRpcService.CancalReq request,
        io.grpc.stub.StreamObserver<com.cheryl.pb.VermouthRpcService.Res> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }

    /**
     */
    default void joinCluster(com.cheryl.pb.VermouthRpcService.JoinClusterReq request,
        io.grpc.stub.StreamObserver<com.cheryl.pb.VermouthRpcService.Res> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinClusterMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VermouthGrpc.
   */
  public static abstract class VermouthGrpcImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VermouthGrpcGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VermouthGrpc.
   */
  public static final class VermouthGrpcStub
      extends io.grpc.stub.AbstractAsyncStub<VermouthGrpcStub> {
    private VermouthGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VermouthGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VermouthGrpcStub(channel, callOptions);
    }

    /**
     * <pre>
     * 注册
     * </pre>
     */
    public void registerToProxy(com.cheryl.pb.VermouthRpcService.RegisterToProxyReq request,
        io.grpc.stub.StreamObserver<com.cheryl.pb.VermouthRpcService.Res> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterToProxyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 注销
     * </pre>
     */
    public void cancel(com.cheryl.pb.VermouthRpcService.CancalReq request,
        io.grpc.stub.StreamObserver<com.cheryl.pb.VermouthRpcService.Res> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinCluster(com.cheryl.pb.VermouthRpcService.JoinClusterReq request,
        io.grpc.stub.StreamObserver<com.cheryl.pb.VermouthRpcService.Res> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinClusterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VermouthGrpc.
   */
  public static final class VermouthGrpcBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VermouthGrpcBlockingStub> {
    private VermouthGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VermouthGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VermouthGrpcBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 注册
     * </pre>
     */
    public com.cheryl.pb.VermouthRpcService.Res registerToProxy(com.cheryl.pb.VermouthRpcService.RegisterToProxyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterToProxyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 注销
     * </pre>
     */
    public com.cheryl.pb.VermouthRpcService.Res cancel(com.cheryl.pb.VermouthRpcService.CancalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cheryl.pb.VermouthRpcService.Res joinCluster(com.cheryl.pb.VermouthRpcService.JoinClusterReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinClusterMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VermouthGrpc.
   */
  public static final class VermouthGrpcFutureStub
      extends io.grpc.stub.AbstractFutureStub<VermouthGrpcFutureStub> {
    private VermouthGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VermouthGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VermouthGrpcFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 注册
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cheryl.pb.VermouthRpcService.Res> registerToProxy(
        com.cheryl.pb.VermouthRpcService.RegisterToProxyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterToProxyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 注销
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cheryl.pb.VermouthRpcService.Res> cancel(
        com.cheryl.pb.VermouthRpcService.CancalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cheryl.pb.VermouthRpcService.Res> joinCluster(
        com.cheryl.pb.VermouthRpcService.JoinClusterReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinClusterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_TO_PROXY = 0;
  private static final int METHODID_CANCEL = 1;
  private static final int METHODID_JOIN_CLUSTER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_TO_PROXY:
          serviceImpl.registerToProxy((com.cheryl.pb.VermouthRpcService.RegisterToProxyReq) request,
              (io.grpc.stub.StreamObserver<com.cheryl.pb.VermouthRpcService.Res>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((com.cheryl.pb.VermouthRpcService.CancalReq) request,
              (io.grpc.stub.StreamObserver<com.cheryl.pb.VermouthRpcService.Res>) responseObserver);
          break;
        case METHODID_JOIN_CLUSTER:
          serviceImpl.joinCluster((com.cheryl.pb.VermouthRpcService.JoinClusterReq) request,
              (io.grpc.stub.StreamObserver<com.cheryl.pb.VermouthRpcService.Res>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterToProxyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cheryl.pb.VermouthRpcService.RegisterToProxyReq,
              com.cheryl.pb.VermouthRpcService.Res>(
                service, METHODID_REGISTER_TO_PROXY)))
        .addMethod(
          getCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cheryl.pb.VermouthRpcService.CancalReq,
              com.cheryl.pb.VermouthRpcService.Res>(
                service, METHODID_CANCEL)))
        .addMethod(
          getJoinClusterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cheryl.pb.VermouthRpcService.JoinClusterReq,
              com.cheryl.pb.VermouthRpcService.Res>(
                service, METHODID_JOIN_CLUSTER)))
        .build();
  }

  private static abstract class VermouthGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VermouthGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cheryl.pb.VermouthRpcService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VermouthGrpc");
    }
  }

  private static final class VermouthGrpcFileDescriptorSupplier
      extends VermouthGrpcBaseDescriptorSupplier {
    VermouthGrpcFileDescriptorSupplier() {}
  }

  private static final class VermouthGrpcMethodDescriptorSupplier
      extends VermouthGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VermouthGrpcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VermouthGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VermouthGrpcFileDescriptorSupplier())
              .addMethod(getRegisterToProxyMethod())
              .addMethod(getCancelMethod())
              .addMethod(getJoinClusterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
