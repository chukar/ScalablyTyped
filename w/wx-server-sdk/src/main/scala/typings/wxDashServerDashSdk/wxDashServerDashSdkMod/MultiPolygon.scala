package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPolygon extends js.Object {
  var coordinates: js.Array[js.Array[js.Array[PointCoordinates]]] = js.native
  var `type`: typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.MultiPolygon = js.native
  def apply(polygons: js.Array[Polygon]): MultiPolygon = js.native
}

