package typings.alksDashNode.alksDashNodeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("alks-node", "refreshTokenToAccessToken")
@js.native
object refreshTokenToAccessToken extends js.Object {
  def apply(
    account: Account,
    token: String,
    opts: js.Object,
    callback: js.Function2[/* err */ Error, /* body */ js.Any, Unit]
  ): Unit = js.native
}

