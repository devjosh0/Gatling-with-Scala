package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ComputerDataBase extends Simulation {
 /// Headers Configuration
	val httpProtocol = http
		.baseUrl("https://computer-database.gatling.io") // Base URL
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Safari/605.1.15")



	val scn = scenario("ComputerDataBase") // Scenario Declaration
		.exec(http("ComputersDataBasePage") // Request Name
			.get("/computers") // Base URL + EndPoint
			)
		.pause(3) // Act as think time between request
		.exec(http("NewComputersPage")// Request Name
			.get("/computers/new") // Base URL + EndPoint
			)
		.pause(24) // Act as think time between request
		.exec(http("CreateNewComputer") // Request Name
			.post("/computers") // Base URL + EndPoint
			.formParam("name", "Postman Run1")
			.formParam("introduced", "2000-01-01")
			.formParam("discontinued", "2023-01-01")
			.formParam("company", "1"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}