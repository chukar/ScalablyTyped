package typings.figlet.figletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figlet", "fontsSync")
@js.native
object fontsSync extends js.Object {
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  def apply(): js.Array[Fonts] = js.native
}

