
package com.iot;

import com.iot.client.RpcProxy;
import com.iot.service.CalcService;

/**
 * Created by xiongxiaoyu
 * Data:2018/6/26
 * Time:13:35
 */
public class Client {

	public static void main(String[] args) throws InterruptedException {
		RpcProxy rpcProxy = new RpcProxy();
		CalcService calcService = rpcProxy.create(CalcService.class);
		System.out.println(calcService.add(56, 12));
		Thread.sleep(2000);
		System.out.println(calcService.substract(56, 12));
		Thread.sleep(2000);
		System.out.println(calcService.multiply(5, 12));
		Thread.sleep(2000);
		System.out.println(calcService.divide(56, 12));
	}
}