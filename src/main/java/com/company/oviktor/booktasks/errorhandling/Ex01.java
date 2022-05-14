package com.company.oviktor.booktasks.errorhandling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ex01 {
    public static void main(String[] args) {
        try {
            throw new UnsupportedOperationException("Op");
        }
        catch (UnsupportedOperationException e){
            log.info("e.getMessage: " + e.getMessage());
        }
        finally {
            log.info("I'v closed it");
        }
    }
}
