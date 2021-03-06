package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNFSFileShareOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the updated file share. 
    */
  var FileShareARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.FileShareARN] = js.native
}

object UpdateNFSFileShareOutput {
  @scala.inline
  def apply(FileShareARN: FileShareARN = null): UpdateNFSFileShareOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNFSFileShareOutput]
  }
}

