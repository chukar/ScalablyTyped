package typings.three

import typings.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typings.three.srcLightsLightShadowMod.LightShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/PointLightShadow", JSImport.Namespace)
@js.native
object srcLightsPointLightShadowMod extends js.Object {
  @js.native
  class PointLightShadow () extends LightShadow {
    @JSName("camera")
    var camera_PointLightShadow: PerspectiveCamera = js.native
  }
  
}

