package boot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.{GetMapping, RestController}

@SpringBootApplication
class ScalaBootApp

object ScalaBootApp extends App {
  SpringApplication.run(classOf[ScalaBootApp], args: _*)
}

@RestController
class MyController {
  @GetMapping(Array("/"))
  def stringGetRequest = {
    "This is a string for Scala-based Controller.."
  }
}