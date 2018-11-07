package com.tfsoft.dubbo.customer.service.impl;

import com.tfsoft.dubbo.customer.service.CustomerService;
import com.tfsoft.dubbo.provider.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
    @Autowired(required = false)
    private ProviderService providerService;
    @Override
    public String getName() {
        logger.debug("开始调用服务");
        String name = providerService.getName();
        logger.debug(name);
        return name;
    }
}
