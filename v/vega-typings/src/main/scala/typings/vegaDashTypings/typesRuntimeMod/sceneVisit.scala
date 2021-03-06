package typings.vegaDashTypings.typesRuntimeMod

import typings.vegaDashTypings.typesRuntimeSceneMod.Scene
import typings.vegaDashTypings.typesRuntimeSceneMod.SceneGroup
import typings.vegaDashTypings.typesRuntimeSceneMod.SceneItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime", "sceneVisit")
@js.native
object sceneVisit extends js.Object {
  def apply(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
  def apply(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
}

