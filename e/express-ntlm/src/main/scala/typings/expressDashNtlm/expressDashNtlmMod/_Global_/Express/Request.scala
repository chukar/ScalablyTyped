package typings.expressDashNtlm.expressDashNtlmMod._Global_.Express

import typings.expressDashNtlm.expressDashNtlmMod.RequestNtlm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var ntlm: js.UndefOr[RequestNtlm] = js.undefined
}

object Request {
  @scala.inline
  def apply(ntlm: RequestNtlm = null): Request = {
    val __obj = js.Dynamic.literal()
    if (ntlm != null) __obj.updateDynamic("ntlm")(ntlm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

