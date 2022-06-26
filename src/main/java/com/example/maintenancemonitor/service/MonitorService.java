package com.example.maintenancemonitor.service;

import com.example.maintenancemonitor.model.Monitor;

import java.time.LocalDateTime;

public class MonitorService {

    private Monitor monitor;

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
