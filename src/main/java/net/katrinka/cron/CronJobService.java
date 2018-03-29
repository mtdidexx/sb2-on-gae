package net.katrinka.cron;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CronJobService {

    @GetMapping(path = "/cron/startIntegration")
    public void startIntegration() {
        log.info("Starting integration process");
    }
}
