package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Ellipse object can be used to specify a hit area for displayObjects
  */
@JSGlobal("PIXI.Ellipse")
@js.native
class Ellipse () extends HitArea {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, halfWidth: Double) = this()
  def this(x: Double, y: Double, halfWidth: Double, halfHeight: Double) = this()
  var height: Double = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
  def getBounds(): Rectangle = js.native
}

