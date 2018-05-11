package com.morning.dubbo.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;

@Activate(group = { Constants.CONSUMER}, order = -9000)
public class DubboConsumeContextFilter implements Filter{
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        try {
           System.out.println("consumer filter 被启用");
        } catch (Exception e) {
            // 处理所有的异常，以免干扰主流程  (打印异常日志)
            e.printStackTrace();
        }
        return invoker.invoke(invocation);
    }

}
