package typings.three

import typings.std.VRDisplay
import typings.three.srcCamerasArrayCameraMod.ArrayCamera
import typings.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcObjectsGroupMod.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webvr/WebVRManager", JSImport.Namespace)
@js.native
object srcRenderersWebvrWebVRManagerMod extends js.Object {
  @js.native
  class WebVRManager protected () extends js.Object {
    def this(renderer: js.Any) = this()
    var enabled: Boolean = js.native
    def dispose(): Unit = js.native
    def getCamera(camera: PerspectiveCamera): PerspectiveCamera | ArrayCamera = js.native
    def getController(id: Double): Group = js.native
    def getDevice(): VRDisplay | Null = js.native
    def getStandingMatrix(): Matrix4 = js.native
    def isPresenting(): Boolean = js.native
    def setAnimationLoop(callback: js.Function): Unit = js.native
    def setDevice(): Unit = js.native
    def setDevice(device: VRDisplay): Unit = js.native
    def setFramebufferScaleFactor(value: Double): Unit = js.native
    def setPoseTarget(): Unit = js.native
    def setPoseTarget(`object`: Object3D): Unit = js.native
    def setReferenceSpaceType(value: String): Unit = js.native
    def submitFrame(): Unit = js.native
  }
  
}

