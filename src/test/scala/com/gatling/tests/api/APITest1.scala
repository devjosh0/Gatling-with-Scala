package com.gatling.tests.api

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class APITest1 extends  Simulation{
  //Protocol
  val httpProtocol = http
    .baseUrl("https://reqres.in/api/users")


  // Scenario
  val scn = scenario("Get API Request Demo")
    .exec(http("Get Single User")
      .get("/2")
      .check(
        status.is(200),
        jsonPath("$.data.first_name")is("Janet")
      )
    )
    .pause(1)

  // Setup

setUp(scn.inject(atOnceUsers(10)))
  .protocols(httpProtocol)

}
