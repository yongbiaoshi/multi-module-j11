open module sbmm.user {
    requires static lombok;
    requires java.sql;
    requires spring.context;
    requires java.persistence;
    requires spring.data.jpa;
    requires spring.boot.autoconfigure;
    requires net.bytebuddy;
    exports com.my.sbmm2.user.config;
    exports com.my.sbmm2.user.entity.po;
    exports com.my.sbmm2.user.repository;
    exports com.my.sbmm2.user.service;
}