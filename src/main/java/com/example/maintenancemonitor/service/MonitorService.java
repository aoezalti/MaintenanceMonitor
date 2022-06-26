package com.example.maintenancemonitor.service;

import com.example.maintenancemonitor.model.Monitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MonitorService {

    private Monitor monitor;

    @Autowired
    public MonitorService(Monitor monitor) {
        this.monitor = monitor;
    }

    public Monitor setMonitor (boolean state, String message) {
        monitor.setMessage(message);
        monitor.setStatus(state);
        monitor.setTimestamp(LocalDateTime.now());
        return monitor;
    }

    public Monitor getMonitorData () {
        monitor.setTimestamp(LocalDateTime.now());
        return monitor;
    }

}
