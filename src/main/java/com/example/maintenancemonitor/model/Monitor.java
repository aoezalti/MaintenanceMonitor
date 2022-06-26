package com.example.maintenancemonitor.model;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Data  // Lombok annotation to include getters, setters and other useful methods
@Component
public class Monitor {
    boolean status = true;
    String message = "-";
    LocalDateTime timestamp;
}
