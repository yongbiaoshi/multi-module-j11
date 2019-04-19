open module sbmm.web {
    requires static lombok;
    requires spring.web;
    requires tomcat.embed.core;
    requires spring.context;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.webmvc;
    requires java.annotation;
    requires sbmm.user;
    exports com.my.test.sbmm2.web;
    exports com.my.test.sbmm2.web.config;
    exports com.my.test.sbmm2.web.controller;
}