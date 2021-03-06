package typings.grayDashPercentage

import typings.grayDashPercentage.grayDashPercentageStrings.cool
import typings.grayDashPercentage.grayDashPercentageStrings.slate
import typings.grayDashPercentage.grayDashPercentageStrings.warm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gray-percentage", JSImport.Namespace)
@js.native
object grayDashPercentageMod extends js.Object {
  def apply(lightness: Double): String = js.native
  def apply(lightness: Double, hue: Double): String = js.native
  def apply(lightness: Double, hue: Double, darkBackground: Boolean): String = js.native
  def apply(lightness: Double, hue: cool): String = js.native
  def apply(lightness: Double, hue: cool, darkBackground: Boolean): String = js.native
  def apply(lightness: Double, hue: slate): String = js.native
  def apply(lightness: Double, hue: slate, darkBackground: Boolean): String = js.native
  def apply(lightness: Double, hue: warm): String = js.native
  def apply(lightness: Double, hue: warm, darkBackground: Boolean): String = js.native
}

