package com.example.maintenancemonitor.controller;

import com.example.maintenancemonitor.model.Monitor;
import com.example.maintenancemonitor.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping(path = "api/maintenanceMode")
public class MaintenanceMonitorController {

    @Autowired
    MonitorService monitorService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Monitor setMonitor(@RequestParam boolean state, @RequestParam Optional<String> message) {
        return monitorService.setMonitor(state, message.orElse("-"));
    }
}
