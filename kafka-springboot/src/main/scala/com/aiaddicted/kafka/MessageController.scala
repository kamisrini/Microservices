package com.aiaddicted.kafka

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class MessageController {
    @Autowired  var archiveTransProducer: KafkaDemoProducer = _
    @GetMapping(value = Array("/kt"))
    def publishToQueue()={
        println("Here")
        archiveTransProducer.postMessagesToTopic()
        "Massages posted to kafka"
    }
    
}
