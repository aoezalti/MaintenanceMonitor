package com.example.maintenancemonitor.controller;

import com.example.maintenancemonitor.model.Monitor;
import com.example.maintenancemonitor.service.MonitorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorControllerTest {

    private Monitor monitor;
    private MonitorService monitorService;

    @BeforeEach
    private void setUp () {
        this.monitor = new Monitor();
        monitorService = new MonitorService(this.monitor);
    }


    @Test
    public void testStatus() {
        assertTrue(monitor.isStatus());
        assertThat(monitor.getMessage()).isEqualTo("-");
    }

    @Test
    public void testSetMonitor () {
        monitorService.setMonitor(false, "down");
        assertThat(monitor.getMessage()).isEqualTo("down");
        assertFalse(monitor.isStatus());
        assertThat(monitor.getTimestamp()).isEqualToIgnoringSeconds(LocalDateTime.now());
    }


    @Test
    public void testGetMonitorData () {
        monitorService.getMonitorData();
        assertThat(monitor.getMessage()).isEqualTo("-");
        assertTrue(monitor.isStatus());
        assertThat(monitor.getTimestamp()).isEqualToIgnoringSeconds(LocalDateTime.now());
    }
}