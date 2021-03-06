package typings.gapiDotClientDotGames.gapi.client.games

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyMilestoneId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestMilestonesResource extends js.Object {
  /**
    * Report that a reward for the milestone corresponding to milestoneId for the quest corresponding to questId has been claimed by the currently authorized
    * user.
    */
  def claim(request: Anon_AltConsistencyTokenFieldsKeyMilestoneId): Request[Unit]
}

object QuestMilestonesResource {
  @scala.inline
  def apply(claim: Anon_AltConsistencyTokenFieldsKeyMilestoneId => Request[Unit]): QuestMilestonesResource = {
    val __obj = js.Dynamic.literal(claim = js.Any.fromFunction1(claim))
  
    __obj.asInstanceOf[QuestMilestonesResource]
  }
}

