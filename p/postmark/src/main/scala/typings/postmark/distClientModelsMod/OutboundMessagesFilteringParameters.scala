package typings.postmark.distClientModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "OutboundMessagesFilteringParameters")
@js.native
class OutboundMessagesFilteringParameters protected ()
  extends typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessagesFilteringParameters {
  def this(
    count: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    recipient: js.UndefOr[String],
    fromEmail: js.UndefOr[String],
    tag: js.UndefOr[String],
    status: js.UndefOr[
        typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus
      ],
    fromDate: js.UndefOr[String],
    toDate: js.UndefOr[String],
    subject: js.UndefOr[String],
    messageStream: js.UndefOr[String]
  ) = this()
}

