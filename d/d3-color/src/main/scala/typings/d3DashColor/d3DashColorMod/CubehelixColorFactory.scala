package typings.d3DashColor.d3DashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CubehelixColorFactory
  extends js.Function {
  def apply(color: ColorCommonInstance): CubehelixColor = js.native
  /**
    * Converts the provided color instance and returns a Cubehelix color.
    * The color instance is specified, it is converted to the RGB color space using color.rgb and then converted to Cubehelix.
    * (Colors already in the Cubehelix color space skip the conversion to RGB.)
    *
    * @param color A permissible color space instance.
    */
  def apply(color: ColorSpaceObject): CubehelixColor = js.native
  /**
    * Parses the specified CSS Color Module Level 3 specifier string, returning an Cubehelix color.
    * If the specifier was not valid, null is returned.
    *
    * @param cssColorSpecifier A CSS Color Module Level 3 specifier string.
    */
  def apply(cssColorSpecifier: String): CubehelixColor = js.native
  /**
    * Constructs a new Cubehelix color based on the specified channel values and opacity.
    *
    * @param h Hue channel value.
    * @param s Saturation channel value.
    * @param l Lightness channel value.
    * @param opacity Optional opacity value, defaults to 1.
    */
  def apply(h: Double, s: Double, l: Double): CubehelixColor = js.native
  def apply(h: Double, s: Double, l: Double, opacity: Double): CubehelixColor = js.native
}

