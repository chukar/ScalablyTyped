package typings.expressDashFileupload.expressDashFileuploadMod._Global_.Express

import typings.expressDashFileupload.expressDashFileuploadMod.FileArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var files: js.UndefOr[FileArray] = js.undefined
}

object Request {
  @scala.inline
  def apply(files: FileArray = null): Request = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

