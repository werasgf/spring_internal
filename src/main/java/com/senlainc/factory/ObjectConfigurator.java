package com.senlainc.factory;

import com.senlainc.config.ApplicationContext;

public interface ObjectConfigurator {
    void configure(Object t, ApplicationContext context);
}
