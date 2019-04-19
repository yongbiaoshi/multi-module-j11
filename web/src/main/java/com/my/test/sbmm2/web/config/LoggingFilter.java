package com.my.test.sbmm2.web.config;

import org.springframework.web.filter.CommonsRequestLoggingFilter;

import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = {"/*"})
public class LoggingFilter extends CommonsRequestLoggingFilter {

    public LoggingFilter() {
        super();
        setIncludeClientInfo(true);
        setIncludeHeaders(true);
        setIncludePayload(true);
        setIncludeQueryString(true);
        setMaxPayloadLength(1024);
    }
}
