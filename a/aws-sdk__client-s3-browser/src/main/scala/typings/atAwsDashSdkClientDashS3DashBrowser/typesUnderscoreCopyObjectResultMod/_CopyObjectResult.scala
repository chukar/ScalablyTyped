package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCopyObjectResultMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CopyObjectResult extends js.Object {
  /**
    * _ETag shape
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * _LastModified shape
    */
  var LastModified: js.UndefOr[Date | String | Double] = js.undefined
}

object _CopyObjectResult {
  @scala.inline
  def apply(ETag: String = null, LastModified: Date | String | Double = null): _CopyObjectResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CopyObjectResult]
  }
}

