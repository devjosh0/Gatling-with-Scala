package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class SearchAndEditComputer extends Simulation {

	val httpProtocol = http
		.baseUrl("https://computer-database.gatling.io")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Safari/605.1.15")




	// Lets divide the scenario into smaller modules

	val search = exec(http("Home Page")
		.get("/computers"))
		.pause(13)
		.exec(http("Search")
			.get("/computers?f=Ace"))
		.pause(4)
		.exec(http("Select")
			.get("/computers/381"))
		.pause(18)


val edit = exec(http("Edit")
		.post("/computers/381")
		.formParam("name", "ACE")
		.formParam("introduced", "2010-01-01")
		.formParam("discontinued", "2023-01-01")
		.formParam("company", "2"))

	val scn = scenario("SearchAndEditComputer").exec(search,edit)

	// Configure virtual users with ramp up

   	// Example lets define two scenarios user and admin

		 val users = scenario("Users").exec(search)

		 val admin = scenario("Admins").exec(search,edit)

	// Add ramp up time with multiple set of users
	setUp(
		users.inject(rampUsers(10).during(10)),
		admin.inject(rampUsers(4).during(10))
	).protocols(httpProtocol)

//	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}