package typings.activedirectory2.activedirectory2Mod

import typings.activedirectory2.Anon_Cn
import typings.activedirectory2.Anon_Enabled
import typings.activedirectory2.activedirectory2Numbers.`1000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ADProperties extends js.Object {
  var attributes: js.UndefOr[Anon_Cn] = js.undefined
  var baseDN: String
  var entryParser: js.UndefOr[
    js.Function3[
      /* entry */ js.Object, 
      /* raw */ String, 
      /* cb */ js.Function1[/* entry */ js.Object, Unit], 
      Unit
    ]
  ] = js.undefined
  var pageSize: js.UndefOr[`1000`] = js.undefined
  var password: String
  var referrals: js.UndefOr[Anon_Enabled] = js.undefined
  var url: String
  var username: String
}

object ADProperties {
  @scala.inline
  def apply(
    baseDN: String,
    password: String,
    url: String,
    username: String,
    attributes: Anon_Cn = null,
    entryParser: (/* entry */ js.Object, /* raw */ String, /* cb */ js.Function1[/* entry */ js.Object, Unit]) => Unit = null,
    pageSize: `1000` = null,
    referrals: Anon_Enabled = null
  ): ADProperties = {
    val __obj = js.Dynamic.literal(baseDN = baseDN.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (entryParser != null) __obj.updateDynamic("entryParser")(js.Any.fromFunction3(entryParser))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (referrals != null) __obj.updateDynamic("referrals")(referrals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADProperties]
  }
}

