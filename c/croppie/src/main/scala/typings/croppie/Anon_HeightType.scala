package typings.croppie

import typings.croppie.croppieMod.CropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightType extends js.Object {
  var height: Double
  var `type`: js.UndefOr[CropType] = js.undefined
  var width: Double
}

object Anon_HeightType {
  @scala.inline
  def apply(height: Double, width: Double, `type`: CropType = null): Anon_HeightType = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightType]
  }
}

