一个简单的 RPC 远程服务框架，主要使用 socket 和 proxy 实现。

原理：
服务端启动一个线程监听 socket 端口
客户端将要调用的service、方法和参数序列化后通过 socket 端口发送给服务端
服务端收到 socket 的消息，将消息反序列化，然后调用对应的 Service 以及方法和参数，再用 socket 写回去
客户端收到 socket 返回的消息，再反序列化解析出结果，打印显示。

其中服务端有 Service 的 Interface 和 Implement 类，而客户端只有 Interface。

代码有纰漏之处还望指出。