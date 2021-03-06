package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A lightweight reference to a Team Drive.
  */
@js.native
trait Schema$TeamDriveReference extends js.Object {
  /**
    * The resource name of the Team Drive. The format is
    * &quot;teamDrives/TEAM_DRIVE_ID&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The title of the Team Drive.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$TeamDriveReference {
  @scala.inline
  def apply(name: String = null, title: String = null): Schema$TeamDriveReference = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TeamDriveReference]
  }
}

