package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIPSetRequest extends js.Object {
  /**
    * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: EntityId = js.native
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: typings.awsDashSdk.clientsWafv2Mod.LockToken = js.native
  /**
    * A friendly name of the IP set. You cannot change the name of an IPSet after you create it.
    */
  var Name: EntityName = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsDashSdk.clientsWafv2Mod.Scope = js.native
}

object DeleteIPSetRequest {
  @scala.inline
  def apply(Id: EntityId, LockToken: LockToken, Name: EntityName, Scope: Scope): DeleteIPSetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LockToken = LockToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIPSetRequest]
  }
}

