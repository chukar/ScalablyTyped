package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This defines an action responsible to start an animation once triggered.
  * @see http://doc.babylonjs.com/how_to/how_to_use_actions
  */
@JSImport("babylonjs", "PlayAnimationAction")
@js.native
class PlayAnimationAction protected ()
  extends babylonjsLib.BABYLONNs.PlayAnimationAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the target animation or animation name
    * @param from defines from where the animation should start (animation frame)
    * @param end defines where the animation should stop (animation frame)
    * @param loop defines if the animation should loop or stop after the first play
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, target: js.Any, from: scala.Double, to: scala.Double) = this()
  def this(triggerOptions: js.Any, target: js.Any, from: scala.Double, to: scala.Double, loop: scala.Boolean) = this()
  def this(triggerOptions: js.Any, target: js.Any, from: scala.Double, to: scala.Double, loop: scala.Boolean, condition: babylonjsLib.BABYLONNs.Condition) = this()
}

