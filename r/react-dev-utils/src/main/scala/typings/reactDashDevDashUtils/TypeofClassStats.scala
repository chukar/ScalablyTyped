package typings.reactDashDevDashUtils

import org.scalablytyped.runtime.Instantiable0
import typings.webpack.webpackMod.Stats
import typings.webpack.webpackMod.Stats.Preset
import typings.webpack.webpackMod.Stats.ToJsonOptionsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassStats extends Instantiable0[Stats] {
  /**
    * Returns the default json options from the stats preset.
    * @param preset The preset to be transformed into json options.
    */
  def presetToOptions(): ToJsonOptionsObject = js.native
  def presetToOptions(preset: Preset): ToJsonOptionsObject = js.native
}

