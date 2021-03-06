package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents targeting information about video.
  */
@js.native
trait Schema$VideoTargeting extends js.Object {
  /**
    * A list of video positions to be excluded. Position types can either be
    * included or excluded (XOR).
    */
  var excludedPositionTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of video positions to be included. When the included list is
    * present, the excluded list must be empty. When the excluded list is
    * present, the included list must be empty.
    */
  var targetedPositionTypes: js.UndefOr[js.Array[String]] = js.native
}

object Schema$VideoTargeting {
  @scala.inline
  def apply(excludedPositionTypes: js.Array[String] = null, targetedPositionTypes: js.Array[String] = null): Schema$VideoTargeting = {
    val __obj = js.Dynamic.literal()
    if (excludedPositionTypes != null) __obj.updateDynamic("excludedPositionTypes")(excludedPositionTypes.asInstanceOf[js.Any])
    if (targetedPositionTypes != null) __obj.updateDynamic("targetedPositionTypes")(targetedPositionTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoTargeting]
  }
}

