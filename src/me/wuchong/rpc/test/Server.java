package me.wuchong.rpc.test;

import me.wuchong.rpc.framwork.RpcFramwork;
import me.wuchong.rpc.service.HelloService;
import me.wuchong.rpc.service.HelloServiceImpl;

public class Server {
	public static void main(String[] args) {
		HelloService service = new HelloServiceImpl();
		RpcFramwork.export(service, 9999);
	}
}
