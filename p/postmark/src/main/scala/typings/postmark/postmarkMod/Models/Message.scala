package typings.postmark.postmarkMod.Models

import typings.postmark.distClientModelsClientSupportingTypesMod.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.Message")
@js.native
class Message protected ()
  extends typings.postmark.distClientModelsMod.Message {
  def this(
    From: String,
    Subject: String,
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    To: js.UndefOr[String],
    Cc: js.UndefOr[String],
    Bcc: js.UndefOr[String],
    ReplyTo: js.UndefOr[String],
    Tag: js.UndefOr[String],
    TrackOpens: js.UndefOr[Boolean],
    TrackLinks: js.UndefOr[typings.postmark.distClientModelsMessageSupportingTypesMod.LinkTrackingOptions],
    Headers: js.UndefOr[js.Array[typings.postmark.distClientModelsMessageSupportingTypesMod.Header]],
    Attachments: js.UndefOr[js.Array[typings.postmark.distClientModelsMessageSupportingTypesMod.Attachment]],
    Metadata: js.UndefOr[Hash[String]]
  ) = this()
}

