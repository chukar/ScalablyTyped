package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SceneModePickerViewModel")
@js.native
class SceneModePickerViewModel protected () extends js.Object {
  def this(scene: Scene) = this()
  def this(scene: Scene, duration: Double) = this()
  var dropDownVisible: Boolean = js.native
  var duration: Double = js.native
  var morphTo2D: Command = js.native
  var morphTo3D: Command = js.native
  var morphToColumbusView: Command = js.native
  var scene: Scene = js.native
  var sceneMode: SceneMode = js.native
  var selectedTooltip: String = js.native
  var toggleDropDown: Command = js.native
  var tooltip2D: String = js.native
  var tooltip3D: String = js.native
  var tooltipColumbusView: String = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

