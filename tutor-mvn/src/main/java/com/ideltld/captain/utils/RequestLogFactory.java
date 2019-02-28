package com.ideltld.captain.utils;

import java.io.IOException;

import org.eclipse.jetty.server.AbstractNCSARequestLog;
import org.apache.log4j.Logger;

public class RequestLogFactory{

    private Logger logger;

    public RequestLogFactory(Logger logger){
        this.logger  = logger;
    }

    AbstractNCSARequestLog create(){

        return new AbstractNCSARequestLog(){
        
            @Override
            public void write(String requestEntry) throws IOException {
                logger.info(requestEntry);
            }
        
            @Override
            protected boolean isEnabled() {
                return true;
            }
        };
    }
}