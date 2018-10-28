package com.tfsoft.dubbo.provider.service.impl;

import com.tfsoft.dubbo.provider.service.ProviderService;
import org.springframework.stereotype.Service;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {
    //你好苏腾
    @Override
    public String getName() {
        return "苏腾";
    }

    //你好dubbo
    @Override
    public String helloDubbo() {
        return null;
    }
}
