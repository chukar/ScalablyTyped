package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Tween")
@js.native
class Tween protected ()
  extends typings.paper.paper.Tween {
  /** 
    * Creates a new tween.
    * 
    * @param object - the object to tween the properties on
    * @param from - the state at the start of the tweening
    * @param to - the state at the end of the tweening
    * @param duration - the duration of the tweening
    * @param easing - the type of the easing
    *     function or the easing function
    * @param start - whether to start tweening automatically
    */
  def this(`object`: js.Object, from: js.Object, to: js.Object, duration: Double) = this()
  def this(`object`: js.Object, from: js.Object, to: js.Object, duration: Double, easing: String) = this()
  def this(`object`: js.Object, from: js.Object, to: js.Object, duration: Double, easing: js.Function) = this()
  def this(
    `object`: js.Object,
    from: js.Object,
    to: js.Object,
    duration: Double,
    easing: String,
    start: Boolean
  ) = this()
  def this(
    `object`: js.Object,
    from: js.Object,
    to: js.Object,
    duration: Double,
    easing: js.Function,
    start: Boolean
  ) = this()
}

