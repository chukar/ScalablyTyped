package typings.gapiDotClientDotGamesmanagement.gapi.client.gamesmanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGamesmanagement.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomsResource extends js.Object {
  /**
    * Reset all rooms for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def reset(request: Anon_Alt): Request[Unit]
  /**
    * Deletes rooms where the only room participants are from whitelisted tester accounts for your application. This method is only available to user
    * accounts for your developer console.
    */
  def resetForAllPlayers(request: Anon_Alt): Request[Unit]
}

object RoomsResource {
  @scala.inline
  def apply(reset: Anon_Alt => Request[Unit], resetForAllPlayers: Anon_Alt => Request[Unit]): RoomsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers))
  
    __obj.asInstanceOf[RoomsResource]
  }
}

