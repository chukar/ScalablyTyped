package typings.leapmotionts.leapmotiontsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leapmotionts", "Pointable")
@js.native
class Pointable () extends js.Object {
  var direction: Vector3 = js.native
  var frame: Frame = js.native
  var hand: Hand = js.native
  var id: Double = js.native
  var isFinger: Boolean = js.native
  var isTool: Boolean = js.native
  var length: Double = js.native
  var tipPosition: Vector3 = js.native
  var tipVelocity: Vector3 = js.native
  var width: Double = js.native
  def isEqualTo(other: Pointable): Boolean = js.native
  def isValid(): Boolean = js.native
}

/* static members */
@JSImport("leapmotionts", "Pointable")
@js.native
object Pointable extends js.Object {
  def invalid(): Pointable = js.native
}

