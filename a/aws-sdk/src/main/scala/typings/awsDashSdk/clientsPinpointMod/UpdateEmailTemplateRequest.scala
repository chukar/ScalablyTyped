package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEmailTemplateRequest extends js.Object {
  /**
    * Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to the latest existing version of the template. If you don't specify a value for this parameter, Amazon Pinpoint saves the updates to the latest existing version of the template. If you specify a value of true for this parameter, don't specify a value for the version parameter. Otherwise, an error will occur.
    */
  var CreateNewVersion: js.UndefOr[__boolean] = js.native
  var EmailTemplateRequest: typings.awsDashSdk.clientsPinpointMod.EmailTemplateRequest = js.native
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: __string = js.native
  /**
    * The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the Template Versions resource. If specified, this value must match the identifier of an existing template version. If specified for an update operation, this value must match the identifier of the latest existing version of the template. This restriction helps ensure that race conditions don't occur. If you don't specify a value for this parameter, Amazon Pinpoint does the following: For a get operation, retrieves information about the active version of the template. For an update operation, saves the updates to the latest existing version of the template, if the create-new-version parameter isn't used or is set to false. For a delete operation, deletes the template, including all versions of the template.
    */
  var Version: js.UndefOr[__string] = js.native
}

object UpdateEmailTemplateRequest {
  @scala.inline
  def apply(
    EmailTemplateRequest: EmailTemplateRequest,
    TemplateName: __string,
    CreateNewVersion: js.UndefOr[Boolean] = js.undefined,
    Version: __string = null
  ): UpdateEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(EmailTemplateRequest = EmailTemplateRequest.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    if (!js.isUndefined(CreateNewVersion)) __obj.updateDynamic("CreateNewVersion")(CreateNewVersion.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailTemplateRequest]
  }
}

