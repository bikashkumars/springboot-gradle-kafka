package platform.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import platform.model.Ping;
import platform.service.PublisherService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value="/platform/v1")
public class NotificationController {

    @Autowired
	PublisherService PublisherService;

    @RequestMapping(value="/notification", method=RequestMethod.POST)
    public Ping greeting() {
        PublisherService.send("my msg");
        return new Ping(6,"Received");
    }
}
