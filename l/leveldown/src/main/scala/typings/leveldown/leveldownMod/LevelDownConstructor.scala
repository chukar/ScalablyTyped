package typings.leveldown.leveldownMod

import org.scalablytyped.runtime.Instantiable1
import typings.abstractDashLeveldown.abstractDashLeveldownMod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDownConstructor extends Instantiable1[/* location */ String, LevelDown] {
  def apply(location: String): LevelDown = js.native
  def destroy(location: String, cb: ErrorCallback): Unit = js.native
  def repair(location: String, cb: ErrorCallback): Unit = js.native
}

