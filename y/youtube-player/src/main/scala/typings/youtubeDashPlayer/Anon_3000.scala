package typings.youtubeDashPlayer

import typings.youtubeDashPlayer.distConstantsPlayerStatesMod.PlayerStates.ENDED
import typings.youtubeDashPlayer.distConstantsPlayerStatesMod.PlayerStates.PAUSED
import typings.youtubeDashPlayer.distConstantsPlayerStatesMod.PlayerStates.PLAYING
import typings.youtubeDashPlayer.youtubeDashPlayerBooleans.`true`
import typings.youtubeDashPlayer.youtubeDashPlayerNumbers.`3000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_3000 extends js.Object {
  var acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED]
  var stateChangeRequired: `true`
  // TRICKY: `seekTo` may not cause a state change if no buffering is required.
  var timeout: `3000`
}

object Anon_3000 {
  @scala.inline
  def apply(acceptableStates: js.Tuple3[ENDED, PLAYING, PAUSED], stateChangeRequired: `true`, timeout: `3000`): Anon_3000 = {
    val __obj = js.Dynamic.literal(acceptableStates = acceptableStates.asInstanceOf[js.Any], stateChangeRequired = stateChangeRequired.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_3000]
  }
}

