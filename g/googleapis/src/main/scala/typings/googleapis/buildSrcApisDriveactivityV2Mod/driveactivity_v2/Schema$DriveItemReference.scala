package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A lightweight reference to a Drive item, such as a file or folder.
  */
@js.native
trait Schema$DriveItemReference extends js.Object {
  /**
    * The Drive item is a file.
    */
  var file: js.UndefOr[Schema$File] = js.native
  /**
    * The Drive item is a folder.
    */
  var folder: js.UndefOr[Schema$Folder] = js.native
  /**
    * The target Drive item. The format is &quot;items/ITEM_ID&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The title of the Drive item.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$DriveItemReference {
  @scala.inline
  def apply(file: Schema$File = null, folder: Schema$Folder = null, name: String = null, title: String = null): Schema$DriveItemReference = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DriveItemReference]
  }
}

