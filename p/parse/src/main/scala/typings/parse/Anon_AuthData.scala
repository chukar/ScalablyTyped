package typings.parse

import typings.parse.parseMod._Global_.Parse.AuthData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthData extends js.Object {
  var authData: js.UndefOr[AuthData] = js.undefined
}

object Anon_AuthData {
  @scala.inline
  def apply(authData: AuthData = null): Anon_AuthData = {
    val __obj = js.Dynamic.literal()
    if (authData != null) __obj.updateDynamic("authData")(authData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthData]
  }
}

