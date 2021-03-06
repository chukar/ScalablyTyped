package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProtectionRequest extends js.Object {
  /**
    * Friendly name for the Protection you are creating.
    */
  var Name: ProtectionName = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource to be protected. The ARN should be in one of the following formats:   For an Application Load Balancer: arn:aws:elasticloadbalancing:region:account-id:loadbalancer/app/load-balancer-name/load-balancer-id     For an Elastic Load Balancer (Classic Load Balancer): arn:aws:elasticloadbalancing:region:account-id:loadbalancer/load-balancer-name     For an AWS CloudFront distribution: arn:aws:cloudfront::account-id:distribution/distribution-id     For an AWS Global Accelerator accelerator: arn:aws:globalaccelerator::account-id:accelerator/accelerator-id     For Amazon Route 53: arn:aws:route53:::hostedzone/hosted-zone-id     For an Elastic IP address: arn:aws:ec2:region:account-id:eip-allocation/allocation-id    
    */
  var ResourceArn: typings.awsDashSdk.clientsShieldMod.ResourceArn = js.native
}

object CreateProtectionRequest {
  @scala.inline
  def apply(Name: ProtectionName, ResourceArn: ResourceArn): CreateProtectionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateProtectionRequest]
  }
}

