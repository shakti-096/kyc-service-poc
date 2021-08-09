package com.backbase.poc.commons;


import lombok.Getter;

@Getter
public enum ESBErrorMapping {
    SUCCESS("00000000"),
    DUPLICATE_REQUEST("T2450042");

    private final String esbStatus;

    ESBErrorMapping(String esbStatus) {
        this.esbStatus = esbStatus;
    }
}
