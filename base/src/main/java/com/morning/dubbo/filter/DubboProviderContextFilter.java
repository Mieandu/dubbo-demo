package com.morning.dubbo.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;


@Activate(group = {Constants.PROVIDER}, order = -9000)
public class DubboProviderContextFilter implements Filter{
	
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        try {
            System.out.println("provider filter 被使用");
        } catch (Exception e) {
            // 处理所有的异常，以免干扰主流程  (打印异常日志)
            e.printStackTrace();
        
        }
        return invoker.invoke(invocation);
    }

}
