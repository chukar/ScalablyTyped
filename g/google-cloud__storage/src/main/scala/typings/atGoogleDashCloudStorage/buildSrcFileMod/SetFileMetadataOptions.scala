package typings.atGoogleDashCloudStorage.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFileMetadataOptions extends js.Object {
  var userProject: js.UndefOr[String] = js.undefined
}

object SetFileMetadataOptions {
  @scala.inline
  def apply(userProject: String = null): SetFileMetadataOptions = {
    val __obj = js.Dynamic.literal()
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFileMetadataOptions]
  }
}

