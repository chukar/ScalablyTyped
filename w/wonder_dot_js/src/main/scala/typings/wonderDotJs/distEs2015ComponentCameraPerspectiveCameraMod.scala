package typings.wonderDotJs

import typings.wonderDotJs.distEs2015ComponentCameraCameraMod.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/camera/PerspectiveCamera", JSImport.Namespace)
@js.native
object distEs2015ComponentCameraPerspectiveCameraMod extends js.Object {
  @js.native
  class PerspectiveCamera () extends Camera {
    var aspect: Double = js.native
    var fovy: Double = js.native
    def zoomIn(speed: Double): Unit = js.native
    def zoomIn(speed: Double, min: Double): Unit = js.native
    def zoomOut(speed: Double): Unit = js.native
    def zoomOut(speed: Double, max: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object PerspectiveCamera extends js.Object {
    def create(): PerspectiveCamera = js.native
  }
  
}

