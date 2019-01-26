package com.aiaddicted.kafka

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.messaging.Source
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Component

@Component
class KafkaDemoProducer {

    @Autowired private var source:  Source = _

    def postMessagesToTopic( )={
        val lisyStr = List("1", "2", "3")
        lisyStr.foreach { t =>
              source.output.send(MessageBuilder.withPayload(t).build)
        }

    }



}