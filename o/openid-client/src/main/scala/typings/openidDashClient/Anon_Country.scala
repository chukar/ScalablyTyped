package typings.openidDashClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Country
  extends /* key */ StringDictionary[js.Any] {
  var country: js.UndefOr[String] = js.undefined
  var formatted: js.UndefOr[String] = js.undefined
  var locality: js.UndefOr[String] = js.undefined
  var postal_code: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var street_address: js.UndefOr[String] = js.undefined
}

object Anon_Country {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    country: String = null,
    formatted: String = null,
    locality: String = null,
    postal_code: String = null,
    region: String = null,
    street_address: String = null
  ): Anon_Country = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (street_address != null) __obj.updateDynamic("street_address")(street_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Country]
  }
}

