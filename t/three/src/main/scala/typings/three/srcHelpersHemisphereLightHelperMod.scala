package typings.three

import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsHemisphereLightMod.HemisphereLight
import typings.three.srcMaterialsMeshBasicMaterialMod.MeshBasicMaterial
import typings.three.srcMathColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/HemisphereLightHelper", JSImport.Namespace)
@js.native
object srcHelpersHemisphereLightHelperMod extends js.Object {
  @js.native
  class HemisphereLightHelper protected () extends Object3D {
    def this(light: HemisphereLight, size: Double) = this()
    def this(light: HemisphereLight, size: Double, color: String) = this()
    def this(light: HemisphereLight, size: Double, color: Double) = this()
    def this(light: HemisphereLight, size: Double, color: Color) = this()
    var color: js.UndefOr[Color | String | Double] = js.native
    var light: HemisphereLight = js.native
    var material: MeshBasicMaterial = js.native
    def dispose(): Unit = js.native
    def update(): Unit = js.native
  }
  
}

