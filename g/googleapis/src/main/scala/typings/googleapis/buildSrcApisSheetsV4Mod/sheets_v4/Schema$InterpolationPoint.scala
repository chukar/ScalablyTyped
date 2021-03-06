package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single interpolation point on a gradient conditional format. These pin
  * the gradient color scale according to the color, type and value chosen.
  */
@js.native
trait Schema$InterpolationPoint extends js.Object {
  /**
    * The color this interpolation point should use.
    */
  var color: js.UndefOr[Schema$Color] = js.native
  /**
    * How the value should be interpreted.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The value this interpolation point uses.  May be a formula. Unused if
    * type is MIN or MAX.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$InterpolationPoint {
  @scala.inline
  def apply(color: Schema$Color = null, `type`: String = null, value: String = null): Schema$InterpolationPoint = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InterpolationPoint]
  }
}

