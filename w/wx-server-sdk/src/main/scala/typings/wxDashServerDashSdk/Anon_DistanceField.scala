package typings.wxDashServerDashSdk

import typings.wxDashServerDashSdk.wxDashServerDashSdkBooleans.`true`
import typings.wxDashServerDashSdk.wxDashServerDashSdkMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DistanceField extends js.Object {
  var distanceField: String = js.native
  var distanceMultiplier: js.UndefOr[Double] = js.native
  var includeLocs: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var maxDistance: js.UndefOr[Double] = js.native
  var minDistance: js.UndefOr[Double] = js.native
  @JSName("near")
  var near_Original: Point = js.native
  var query: js.UndefOr[js.Object] = js.native
  var spherical: `true` = js.native
  def near(longitude: Double, latitude: Double): Point = js.native
}

