package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailTemplateResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[__string] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was created.
    */
  var CreationDate: __string = js.native
  /**
    * The JSON object that specifies the default values that are used for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable.
    */
  var DefaultSubstitutions: js.UndefOr[__string] = js.native
  /**
    * The message body, in HTML format, that's used in email messages that are based on the message template.
    */
  var HtmlPart: js.UndefOr[__string] = js.native
  /**
    * The date, in ISO 8601 format, when the message template was last modified.
    */
  var LastModifiedDate: __string = js.native
  /**
    * The subject line, or title, that's used in email messages that are based on the message template.
    */
  var Subject: js.UndefOr[__string] = js.native
  /**
    * The custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[__string] = js.native
  /**
    * The name of the message template.
    */
  var TemplateName: __string = js.native
  /**
    * The type of channel that the message template is designed for. For an email template, this value is EMAIL.
    */
  var TemplateType: typings.awsDashSdk.clientsPinpointMod.TemplateType = js.native
  /**
    * The message body, in plain text format, that's used in email messages that are based on the message template.
    */
  var TextPart: js.UndefOr[__string] = js.native
  /**
    * The unique identifier, as an integer, for the active version of the message template, or the version of the template that you specified by using the version parameter in your request.
    */
  var Version: js.UndefOr[__string] = js.native
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.native
}

object EmailTemplateResponse {
  @scala.inline
  def apply(
    CreationDate: __string,
    LastModifiedDate: __string,
    TemplateName: __string,
    TemplateType: TemplateType,
    Arn: __string = null,
    DefaultSubstitutions: __string = null,
    HtmlPart: __string = null,
    Subject: __string = null,
    TemplateDescription: __string = null,
    TextPart: __string = null,
    Version: __string = null,
    tags: MapOf__string = null
  ): EmailTemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (DefaultSubstitutions != null) __obj.updateDynamic("DefaultSubstitutions")(DefaultSubstitutions.asInstanceOf[js.Any])
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart.asInstanceOf[js.Any])
    if (Subject != null) __obj.updateDynamic("Subject")(Subject.asInstanceOf[js.Any])
    if (TemplateDescription != null) __obj.updateDynamic("TemplateDescription")(TemplateDescription.asInstanceOf[js.Any])
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTemplateResponse]
  }
}

