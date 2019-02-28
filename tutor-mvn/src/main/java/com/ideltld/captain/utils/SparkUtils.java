package com.ideltld.captain.utils;

import org.eclipse.jetty.server.AbstractNCSARequestLog;

import spark.embeddedserver.EmbeddedServers;
import spark.embeddedserver.jetty.EmbeddedJettyFactory;

public class SparkUtils {
    public static void createServerWithRequestLog(org.apache.log4j.Logger logger) {
        EmbeddedJettyFactory factory = createEmbeddedJettyFactoryWithRequestLog(logger);
        EmbeddedServers.add(EmbeddedServers.Identifiers.JETTY, factory);
    }

    private static EmbeddedJettyFactory createEmbeddedJettyFactoryWithRequestLog(org.apache.log4j.Logger logger) {
        AbstractNCSARequestLog requestLog = new RequestLogFactory(logger).create();
        return new EmbeddedJettyFactoryConstructor(requestLog).create();
    }
}