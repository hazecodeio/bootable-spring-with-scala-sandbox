package boot

import org.hsmak.MyJava
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ScalaBootApp

object ScalaBootApp extends App {
  println("This String is printed from scala method!")
  println(MyJava.callJavaMethod)
  SpringApplication.run(classOf[ScalaBootApp], args:_*)
}