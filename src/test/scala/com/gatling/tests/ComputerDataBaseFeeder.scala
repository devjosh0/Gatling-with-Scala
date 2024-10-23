package com.gatling.tests

import io.gatling.core.Predef.*
import io.gatling.http.Predef.*
import sun.jvm.hotspot.debugger.Page

class ComputerDataBaseFeeder extends  Simulation{
///Protocols
val httpProtocol = http
  .baseUrl("https://computer-database.gatling.io")

//Scenario
 val feeder = csv("C:\\Users\\HusseinAmadu\\Desktop\\data\\Book2.csv").circular
   val scn = scenario("Feeder Demo")
     .repeat(1){
       feed(feeder)
         .exec { session =>
           println("Name: "+session("name").as[String])
           println("Job: " + session("job").as[String])
           println("Page: " + session("page").as[String])
           session
         }
         .pause(1)
         .exec(http(s"Goto")
           .get("/#{page}")
         )
     }




   setUp(scn.inject(atOnceUsers(4))).protocols(httpProtocol)
}
