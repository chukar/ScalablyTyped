package typings.cesium.cesiumMod

import typings.cesium.Anon_AllowPicking
import typings.cesium.Anon_AllowPickingAsynchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Model")
@js.native
class Model () extends js.Object {
  def this(options: Anon_AllowPicking) = this()
  var activeAnimations: ModelAnimationCollection = js.native
  var allowPicking: Boolean = js.native
  var asynchronous: Boolean = js.native
  var basePath: String = js.native
  var boundingSphere: BoundingSphere = js.native
  var debugShowBoundingVolume: Boolean = js.native
  var debugWireframe: Boolean = js.native
  var gltf: js.Any = js.native
  var id: js.Any = js.native
  var minimumPixelSize: Double = js.native
  var modelMatrix: Matrix4 = js.native
  var ready: Boolean = js.native
  var readyPromise: js.Promise[Model] = js.native
  var scale: Double = js.native
  var show: Boolean = js.native
  def destroy(): Unit = js.native
  def getMaterial(name: String): ModelMaterial = js.native
  def getMesh(name: String): ModelMesh = js.native
  def getNode(name: String): ModelNode = js.native
  def isDestroyed(): Boolean = js.native
  def update(): Unit = js.native
}

/* static members */
@JSImport("cesium", "Model")
@js.native
object Model extends js.Object {
  def fromGltf(options: Anon_AllowPickingAsynchronous): Model = js.native
}

