package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreMultipartUploadMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.ONEZONE_IA
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.REDUCED_REDUNDANCY
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.STANDARD
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.STANDARD_IA
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInitiatorMod._Initiator
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOwnerMod._Owner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _MultipartUpload extends js.Object {
  /**
    * <p>Date and time at which the multipart upload was initiated.</p>
    */
  var Initiated: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Identifies who initiated the multipart upload.</p>
    */
  var Initiator: js.UndefOr[_Initiator] = js.undefined
  /**
    * <p>Key of the object for which the multipart upload was initiated.</p>
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[_Owner] = js.undefined
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.undefined
  /**
    * <p>Upload ID that identifies the multipart upload.</p>
    */
  var UploadId: js.UndefOr[String] = js.undefined
}

object _MultipartUpload {
  @scala.inline
  def apply(
    Initiated: Date | String | Double = null,
    Initiator: _Initiator = null,
    Key: String = null,
    Owner: _Owner = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null,
    UploadId: String = null
  ): _MultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (Initiated != null) __obj.updateDynamic("Initiated")(Initiated.asInstanceOf[js.Any])
    if (Initiator != null) __obj.updateDynamic("Initiator")(Initiator.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (UploadId != null) __obj.updateDynamic("UploadId")(UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_MultipartUpload]
  }
}

