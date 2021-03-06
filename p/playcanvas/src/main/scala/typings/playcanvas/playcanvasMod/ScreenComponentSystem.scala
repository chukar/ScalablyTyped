package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScreenComponentSystem
  * @extends pc.ComponentSystem
  * @classdesc Manages creation of {@link pc.ScreenComponent}s.
  * @description Create a new ScreenComponentSystem
  * @param {pc.Application} app The application
  */
@JSImport("playcanvas", "ScreenComponentSystem")
@js.native
class ScreenComponentSystem protected ()
  extends typings.playcanvas.pc.ScreenComponentSystem {
  def this(app: typings.playcanvas.pc.Application) = this()
}

