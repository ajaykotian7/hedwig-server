package dev.ajaykotian.hedwig.health;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class HealthController {
    record HealthResponse(String status) {
    }

    @GetMapping("/health")
    HealthResponse health() {
        return new HealthResponse("ok");
    }
}
