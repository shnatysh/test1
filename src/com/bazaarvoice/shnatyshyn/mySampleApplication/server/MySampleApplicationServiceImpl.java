package com.bazaarvoice.shnatyshyn.mySampleApplication.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.bazaarvoice.shnatyshyn.mySampleApplication.client.MySampleApplicationService;

public class MySampleApplicationServiceImpl extends RemoteServiceServlet implements MySampleApplicationService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}