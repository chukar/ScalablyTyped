package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about where a user&#39;s browser is taken after the
  * user clicks an ad.
  */
@js.native
trait Schema$LandingPage extends js.Object {
  /**
    * Advertiser ID of this landing page. This is a required field.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Whether this landing page has been archived.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Links that will direct the user to a mobile app, if installed.
    */
  var deepLinks: js.UndefOr[js.Array[Schema$DeepLink]] = js.native
  /**
    * ID of this landing page. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#landingPage&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this landing page. This is a required field. It must be less than
    * 256 characters long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * URL of this landing page. This is a required field.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$LandingPage {
  @scala.inline
  def apply(
    advertiserId: String = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    deepLinks: js.Array[Schema$DeepLink] = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    url: String = null
  ): Schema$LandingPage = {
    val __obj = js.Dynamic.literal()
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (deepLinks != null) __obj.updateDynamic("deepLinks")(deepLinks.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LandingPage]
  }
}

