package typings.svgDashSprite.svgDashSpriteMod

import typings.winston.winstonMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Main output directory
    * @default '.'
    */
  var dest: js.UndefOr[String] = js.undefined
  /**
    * Logging verbosity or custom logger
    */
  var log: js.UndefOr[String | Logger] = js.undefined
  /**
    * Output mode configurations
    */
  var mode: js.UndefOr[Mode] = js.undefined
  /**
    * SVG shape configuration
    */
  var shape: js.UndefOr[Shape] = js.undefined
  /**
    * Sprite SVG options
    */
  var svg: js.UndefOr[Svg] = js.undefined
  /**
    * Custom templating variables
    */
  var variables: js.UndefOr[js.Any] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    dest: String = null,
    log: String | Logger = null,
    mode: Mode = null,
    shape: Shape = null,
    svg: Svg = null,
    variables: js.Any = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

