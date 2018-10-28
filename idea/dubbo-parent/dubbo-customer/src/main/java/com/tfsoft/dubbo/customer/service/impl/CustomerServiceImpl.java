package com.tfsoft.dubbo.customer.service.impl;

import com.tfsoft.dubbo.customer.service.CustomerService;
import com.tfsoft.dubbo.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired(required = false)
    private ProviderService providerService;
    @Override
    public String getName() {
       String name = providerService.getName();
       return name;
    }
}
