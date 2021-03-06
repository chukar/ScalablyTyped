package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInputRequest extends js.Object {
  /**
    * Destination settings for PUSH type inputs.
    */
  var Destinations: js.UndefOr[__listOfInputDestinationRequest] = js.native
  /**
    * A list of security groups referenced by IDs to attach to the input.
    */
  var InputSecurityGroups: js.UndefOr[__listOf__string] = js.native
  /**
    * A list of the MediaConnect Flows that you want to use in this input. You can specify as few as one
  Flow and presently, as many as two. The only requirement is when you have more than one is that each Flow is in a
  separate Availability Zone as this ensures your EML input is redundant to AZ issues.
    */
  var MediaConnectFlows: js.UndefOr[__listOfMediaConnectFlowRequest] = js.native
  /**
    * Name of the input.
    */
  var Name: js.UndefOr[__string] = js.native
  /**
    * Unique identifier of the request to ensure the request is handled
  exactly once in case of retries.
    */
  var RequestId: js.UndefOr[__string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role this input assumes during and after creation.
    */
  var RoleArn: js.UndefOr[__string] = js.native
  /**
    * The source URLs for a PULL-type input. Every PULL type input needs
  exactly two source URLs for redundancy.
  Only specify sources for PULL type Inputs. Leave Destinations empty.
    */
  var Sources: js.UndefOr[__listOfInputSourceRequest] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Tags] = js.native
  var Type: js.UndefOr[InputType] = js.native
  var Vpc: js.UndefOr[InputVpcRequest] = js.native
}

object CreateInputRequest {
  @scala.inline
  def apply(
    Destinations: __listOfInputDestinationRequest = null,
    InputSecurityGroups: __listOf__string = null,
    MediaConnectFlows: __listOfMediaConnectFlowRequest = null,
    Name: __string = null,
    RequestId: __string = null,
    RoleArn: __string = null,
    Sources: __listOfInputSourceRequest = null,
    Tags: Tags = null,
    Type: InputType = null,
    Vpc: InputVpcRequest = null
  ): CreateInputRequest = {
    val __obj = js.Dynamic.literal()
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    if (InputSecurityGroups != null) __obj.updateDynamic("InputSecurityGroups")(InputSecurityGroups.asInstanceOf[js.Any])
    if (MediaConnectFlows != null) __obj.updateDynamic("MediaConnectFlows")(MediaConnectFlows.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Vpc != null) __obj.updateDynamic("Vpc")(Vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInputRequest]
  }
}

