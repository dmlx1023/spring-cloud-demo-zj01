package com.example.demonacosconfig.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.cloud.endpoint.event.RefreshEvent;
import org.springframework.cloud.endpoint.event.RefreshEventListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class RefreshListener implements ApplicationEventPublisher, ApplicationContextAware {

    @EventListener
    public void d(RefreshEvent event) {
        System.err.println("xxxxxxxxxxxxx");
//        this.refresh.refresh();

    }

    @Override
    public void publishEvent(Object event) {
        this.apx.publishEvent(event);

    }

    private ApplicationContext apx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.apx = applicationContext;
    }


//    =========================================

    private static Log log = LogFactory.getLog(RefreshEventListener.class);
    private ContextRefresher refresh;
    private AtomicBoolean ready = new AtomicBoolean(false);

    public RefreshListener(ContextRefresher refresh) {
        this.refresh = refresh;
    }

    @EventListener
    public void handle(ApplicationReadyEvent event) {
        this.ready.compareAndSet(false, true);
    }

    @EventListener
    public void handle(RefreshEvent event) {
        if (this.ready.get()) { // don't handle events before app is ready
            log.debug("Event received " + event.getEventDesc());
            Set<String> keys = this.refresh.refresh();
            log.info("Refresh keys changed: " + keys);
        }
    }
}
