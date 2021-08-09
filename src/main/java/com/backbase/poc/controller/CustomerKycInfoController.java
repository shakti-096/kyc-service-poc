package com.backbase.poc.controller;

import com.backbase.dbs.poc.api.service.v2.CustomerKycInfoApi;
import com.backbase.dbs.poc.api.service.v2.model.CustomerKycInfoGetResponseBody;
import com.backbase.dbs.poc.api.service.v2.model.UpdateCustomerKycInfoRequestBody;
import com.backbase.dbs.poc.api.service.v2.model.UpdateCustomerKycInfoResponseBody;
import com.backbase.poc.service.GetCustomerInfoKYCService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@Slf4j
@RestController
public class CustomerKycInfoController implements CustomerKycInfoApi {


    private GetCustomerInfoKYCService getCustomerInfoKYCService;


    @Autowired
    public CustomerKycInfoController(GetCustomerInfoKYCService getCustomerInfoKYCService) {
        this.getCustomerInfoKYCService = getCustomerInfoKYCService;
    };

    /**
     * GET /client-api/v1/customer-kyc-info : Returns available items, optionally filtered by name.
     * Returns available items, optionally filtered by name
     *
     * @param name      Filter by item name (case-insensitive), can be the first one or more characters of one of the words/names (optional)
     * @param from      Page Number. Skip over pages of elements by specifying a start value for the query (optional, default to 0)
     * @param cursor    Record UUID. As an alternative for specifying &#39;from&#39; this allows to point to the record to start the selection from.  (optional, default to )
     * @param size      Limit the number of elements on the response. When used in combination with cursor, the value is allowed to be a negative number to indicate requesting records upwards from the starting point indicated by the cursor.  (optional, default to 10)
     * @param orderBy   Order by field: name  (optional)
     * @param direction Direction (optional, default to DESC)
     * @return No description available (status code 200)
     * or BadRequest (status code 400)
     * or InternalServerError (status code 500)
     */
    @Override
    public ResponseEntity<CustomerKycInfoGetResponseBody> getCustomerKycInfo(String name, Integer from, String cursor, Integer size, String orderBy, String direction) {
        return new ResponseEntity<>(getCustomerInfoKYCService.getCustomerKycInfoResponseBody(), HttpStatus.OK);
    }

    /**
     * PUT /client-api/v1/customer-kyc-info : UpdateCustomerKycInfo.
     * UpdateCustomerKycInfo
     *
     * @param updateCustomerKycInfoRequestBody UpdateCustomerKycInfo (optional)
     * @return Updated customer KYC Information (status code 201)
     * or BadRequest (status code 400)
     * or InternalServerError (status code 500)
     */
    @Override
    public ResponseEntity<UpdateCustomerKycInfoResponseBody> putCustomerKycInfo(UpdateCustomerKycInfoRequestBody updateCustomerKycInfoRequestBody) {
        return null;
    }

}
