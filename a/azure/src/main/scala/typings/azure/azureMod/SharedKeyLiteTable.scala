package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "SharedKeyLiteTable")
@js.native
class SharedKeyLiteTable protected () extends js.Object {
  def this(storageAccount: String, storageAccessKey: String, usePathStyleUri: Boolean) = this()
  var signer: HmacSha256Sign = js.native
  var storageAccessKey: String = js.native
  var torageAccount: String = js.native
  var usePathStyleUri: String = js.native
  /**
    * Retrieves the webresource's canonicalized resource string.
    */
  def _getCanonicalizedResource(webResource: WebResource): String = js.native
  /**
    * Signs a request with the Authentication header.
    */
  def signRequest(webResource: WebResource, callback: ErrorCallback): Unit = js.native
}

