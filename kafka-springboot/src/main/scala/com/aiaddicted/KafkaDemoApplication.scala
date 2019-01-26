package com.aiaddicted

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.messaging.Source
import org.springframework.messaging.MessageChannel

@EnableBinding(Array(classOf[Source]))
@SpringBootApplication
class KafkaDemoApplication{

    def main(args: Array[String]): Unit = {
        SpringApplication.run(classOf[KafkaDemoApplication], args:_*)

    }
}
