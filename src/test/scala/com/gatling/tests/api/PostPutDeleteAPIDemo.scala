package com.gatling.tests.api

import io.gatling.http.Predef._
import io.gatling.core.Predef.*

class PostPutDeleteAPIDemo extends  Simulation{
  //Protocols
  val httpProtocol = http
    .baseUrl("https://reqres.in/api")

  // Scenario
  val CreateUserScn = scenario("Create User")
    .exec(http("Create user request")
      .post("/users")
      .header("content-type","application/json")
      .asJson
      .body(RawFileBody("C:\\Users\\HusseinAmadu\\Desktop\\stuff\\Gatling\\GatingProjects\\GatlingProjectOne\\src\\test\\resources\\data\\user.json"))
//      .body(StringBody(
//        """
//          |{
//          |    "name": "morpheus",
//          |    "job": "leader"
//          |}
//          |""".stripMargin)).asJson
      .check(
        status.is(201),
        jsonPath("$.name").is("James")

      )

    )
    .pause(1)
   val UpdateUserScn = scenario("Update User")
    .exec(http("Update User request")
      .put("/users/2")
      .body(RawFileBody("C:\\Users\\HusseinAmadu\\Desktop\\stuff\\Gatling\\GatingProjects\\GatlingProjectOne\\src\\test\\resources\\data\\user.json"))
      .asJson
      check(
      status.is(200),
      jsonPath("$.name").is("James")
    )
    )
     .pause(1)

   val deletUserScn = scenario("Delete Users")
     .exec(http("Delete user request")
       .delete("/users/2")
       .check(
         status.is(204)
       )

     )
     .pause(1)


  // Setup
  setUp(
    CreateUserScn.inject(rampUsers(10).during(5))
      .protocols(httpProtocol),
    UpdateUserScn.inject(rampUsers(5).during(3)).protocols(httpProtocol),
    deletUserScn.inject(rampUsers(3).during(2)).protocols(httpProtocol)
  )

}
