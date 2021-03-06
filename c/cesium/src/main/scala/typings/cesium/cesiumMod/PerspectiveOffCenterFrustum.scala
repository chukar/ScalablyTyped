package typings.cesium.cesiumMod

import typings.cesium.Anon_Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerspectiveOffCenterFrustum")
@js.native
class PerspectiveOffCenterFrustum () extends Frustum {
  def this(options: Anon_Bottom) = this()
  var bottom: Double = js.native
  val infiniteProjectionMatrix: Matrix4 = js.native
  var left: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  def clone(result: PerspectiveOffCenterFrustum): PerspectiveOffCenterFrustum = js.native
  def equals(): Boolean = js.native
  def equals(other: PerspectiveOffCenterFrustum): Boolean = js.native
}

