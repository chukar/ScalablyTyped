package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentVersionResponse extends js.Object {
  var SegmentResponse: typings.awsDashSdk.clientsPinpointMod.SegmentResponse = js.native
}

object GetSegmentVersionResponse {
  @scala.inline
  def apply(SegmentResponse: SegmentResponse): GetSegmentVersionResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSegmentVersionResponse]
  }
}

