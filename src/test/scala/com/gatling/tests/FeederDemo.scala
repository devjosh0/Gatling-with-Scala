package com.gatling.tests

import io.gatling.core.Predef._

class FeederDemo extends Simulation{
  //Protocols


  //Scenario
  val feeder = csv("C:\\Users\\HusseinAmadu\\Desktop\\data\\Book2.csv").circular

  val scn = scenario("Feeders Demo")
    .repeat(1){
    feed(feeder)
    .exec { session =>
      println("Name: "+session("name").as[String])
      println("Job: "+session("job").as[String])
      session
    }}

  setUp(scn.inject(atOnceUsers(4)))
}
