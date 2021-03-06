package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a platform type that can be targeted by ads.
  */
@js.native
trait Schema$PlatformType extends js.Object {
  /**
    * ID of this platform type.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#platformType&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this platform type.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$PlatformType {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): Schema$PlatformType = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlatformType]
  }
}

