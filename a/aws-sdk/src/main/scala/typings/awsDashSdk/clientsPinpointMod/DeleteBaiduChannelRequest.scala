package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBaiduChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
}

object DeleteBaiduChannelRequest {
  @scala.inline
  def apply(ApplicationId: __string): DeleteBaiduChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBaiduChannelRequest]
  }
}

