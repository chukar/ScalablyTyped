package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The cluster identifier (ID) for the cluster whose tags you are removing. To find the cluster ID, use DescribeClusters.
    */
  var ResourceId: ClusterId = js.native
  /**
    * A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag values.
    */
  var TagKeyList: typings.awsDashSdk.clientsCloudhsmv2Mod.TagKeyList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceId: ClusterId, TagKeyList: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

