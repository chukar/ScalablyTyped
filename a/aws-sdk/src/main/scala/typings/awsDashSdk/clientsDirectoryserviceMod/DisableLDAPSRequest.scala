package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableLDAPSRequest extends js.Object {
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId = js.native
  /**
    * The type of LDAP security that the customer wants to enable. The security can be either server or client, but currently only the default Client is supported.
    */
  var Type: js.UndefOr[LDAPSType] = js.native
}

object DisableLDAPSRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, Type: LDAPSType = null): DisableLDAPSRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableLDAPSRequest]
  }
}

