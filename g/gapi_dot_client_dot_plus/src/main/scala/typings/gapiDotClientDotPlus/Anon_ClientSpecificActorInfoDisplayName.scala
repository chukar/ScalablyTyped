package typings.gapiDotClientDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientSpecificActorInfoDisplayName extends js.Object {
  /** Actor info specific to particular clients. */
  var clientSpecificActorInfo: js.UndefOr[Anon_YoutubeActorInfo] = js.undefined
  /** The name of this actor, suitable for display. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The ID of the actor. */
  var id: js.UndefOr[String] = js.undefined
  /** The image representation of this actor. */
  var image: js.UndefOr[Anon_Url] = js.undefined
  /** A link to the Person resource for this actor. */
  var url: js.UndefOr[String] = js.undefined
  /** Verification status of actor. */
  var verification: js.UndefOr[Anon_AdHocVerified] = js.undefined
}

object Anon_ClientSpecificActorInfoDisplayName {
  @scala.inline
  def apply(
    clientSpecificActorInfo: Anon_YoutubeActorInfo = null,
    displayName: String = null,
    id: String = null,
    image: Anon_Url = null,
    url: String = null,
    verification: Anon_AdHocVerified = null
  ): Anon_ClientSpecificActorInfoDisplayName = {
    val __obj = js.Dynamic.literal()
    if (clientSpecificActorInfo != null) __obj.updateDynamic("clientSpecificActorInfo")(clientSpecificActorInfo.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClientSpecificActorInfoDisplayName]
  }
}

