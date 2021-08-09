package com.backbase.poc.commons;

public class ServiceConstants {

    public static final String CORE_ERROR = "core returned unknown error";
    public static final String MOCK_ERROR_CODE = "mockErrorCode";
    public static final String MOCK_ERROR_MSG = "mockErrorMsg";
    public static final String ERROR_FROM_GET_CUSTOMER_INFO_KYC_REQUEST =
            "Error from service GetCustomerInfoKYC - no ResponseStatus found";
    public static final String NO_STATUS_CODE = "Error from service GetCustomerInfoKYC - unable to retrieve a success code from core";
    public static final String SUCCESS_CODE = "00000000";
    public static final String ERROR_CODE = "99999999";
    public static final String SUCESS_MESSAGE = "core response with success status";
    public static final String CUSTOMER_ID = "customerId";
    public static final String BANK_ID = "bankId";
    public static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss.SSSSS";
    public static final String BRANCH_CODE_JO0010002 = "JO0010002";
    public static final String CHANNEL_ID_OMNICHL = "OMNICHL";
    public static final String SERVICE_CODE_SCBRS001 = "SCBRS001";
    public static final String SUB_CHANNEL_ID = "IB";
    public static final String EQUAL_OPERATOR = "EQ";
    public static final String CUSTOMER_ID_UPPERCASE = "CUSTOMER.ID";
    public static final String DEPOSIT_ID = "depositId";
    public static final String PAGE_SIZE = "pageSize";
    public static final String PAGE_NUMBER = "pageNumber";
    public static final String CUSTOMER_KYC_SERVICE_CODE = "SCBRS001";

    private ServiceConstants() {
        throw new IllegalStateException("Constants class");
    }

}
