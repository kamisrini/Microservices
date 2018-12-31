package com.aiaddicted.functiontests.func

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}


@RestController
@RequestMapping(Array("/scala"))
class ScalaFunc {

  @GetMapping(value = Array("passfunc"), produces = Array(MediaType.TEXT_HTML_VALUE))
  def massage: String = {
    methodA(functionB)
  }

  def methodA(fn: () => String): String = {
    fn()
  }

  val functionB = () => "Hi, I am functionB from Scala, I am passed to functionA as a parameter."

}
