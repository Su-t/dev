package com.tfsoft.dubbo.provider.service.impl;

import com.tfsoft.dubbo.provider.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {
    Logger logger = LoggerFactory.getLogger(ProviderServiceImpl.class);
    //你好苏腾
    @Override
    public String getName() {
        logger.debug("看到了这个，就说明调用到了服务");
        return "st";
    }

    //你好dubbo
    @Override
    public String helloDubbo() {
        logger.debug("看到了这个，就说明调用到了服务");
        return "helloDubbo";
    }
}
