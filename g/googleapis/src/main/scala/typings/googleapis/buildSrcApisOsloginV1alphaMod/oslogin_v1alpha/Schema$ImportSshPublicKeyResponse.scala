package typings.googleapis.buildSrcApisOsloginV1alphaMod.oslogin_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message from importing an SSH public key.
  */
@js.native
trait Schema$ImportSshPublicKeyResponse extends js.Object {
  /**
    * The login profile information for the user.
    */
  var loginProfile: js.UndefOr[Schema$LoginProfile] = js.native
}

object Schema$ImportSshPublicKeyResponse {
  @scala.inline
  def apply(loginProfile: Schema$LoginProfile = null): Schema$ImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (loginProfile != null) __obj.updateDynamic("loginProfile")(loginProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImportSshPublicKeyResponse]
  }
}

