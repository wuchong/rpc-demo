package me.wuchong.rpc.test;

import me.wuchong.rpc.framwork.RpcFramwork;
import me.wuchong.rpc.service.HelloService;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		HelloService service = RpcFramwork.refer(HelloService.class, "127.0.0.1", 9999);
		for(int i=0;i<100;i++){
			System.out.println(service.hello("world "+i));
			Thread.sleep(1000);
		}
		
	}
}
