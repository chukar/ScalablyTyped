package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement reveal response
  */
@js.native
trait Schema$AchievementRevealResponse extends js.Object {
  /**
    * The current state of the achievement for which a reveal was attempted.
    * This might be UNLOCKED if the achievement was already unlocked. Possible
    * values are:   - &quot;REVEALED&quot; - Achievement is revealed.  -
    * &quot;UNLOCKED&quot; - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementRevealResponse.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AchievementRevealResponse {
  @scala.inline
  def apply(currentState: String = null, kind: String = null): Schema$AchievementRevealResponse = {
    val __obj = js.Dynamic.literal()
    if (currentState != null) __obj.updateDynamic("currentState")(currentState.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AchievementRevealResponse]
  }
}

