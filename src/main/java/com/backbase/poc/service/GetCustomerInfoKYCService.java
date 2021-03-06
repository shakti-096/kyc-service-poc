package com.backbase.poc.service;


import com.backbase.dbs.poc.api.service.v2.model.CustomerKycInfoGetResponseBody;

public interface GetCustomerInfoKYCService {

    /**
     * get the customer kyc info for info update
     *
     * @return Body with kyc info
     */
    CustomerKycInfoGetResponseBody getCustomerKycInfoResponseBody();
}
