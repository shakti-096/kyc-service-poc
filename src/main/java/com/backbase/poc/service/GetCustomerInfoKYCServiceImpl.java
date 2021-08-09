package com.backbase.poc.service;


import com.backbase.dbs.messaging_service.api.service.v2.model.CustomerKycInfoGetResponseBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GetCustomerInfoKYCServiceImpl implements GetCustomerInfoKYCService {


    @Override
    public CustomerKycInfoGetResponseBody getCustomerKycInfoResponseBody() {
        //require service details and wsdl to call service.
       return null;
    }
}
