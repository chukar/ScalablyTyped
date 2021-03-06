package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNFSFileShareOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the newly created file share. 
    */
  var FileShareARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.FileShareARN] = js.native
}

object CreateNFSFileShareOutput {
  @scala.inline
  def apply(FileShareARN: FileShareARN = null): CreateNFSFileShareOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNFSFileShareOutput]
  }
}

