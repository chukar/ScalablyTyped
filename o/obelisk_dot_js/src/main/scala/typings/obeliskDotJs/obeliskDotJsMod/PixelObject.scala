package typings.obeliskDotJs.obeliskDotJsMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "PixelObject")
@js.native
class PixelObject protected () extends js.Object {
  def this(primitive: AbstractPrimitive) = this()
  def this(primitive: AbstractPrimitive, point3D: Point3D) = this()
  var canvas: HTMLCanvasElement = js.native
  var x: Double = js.native
  var y: Double = js.native
}

