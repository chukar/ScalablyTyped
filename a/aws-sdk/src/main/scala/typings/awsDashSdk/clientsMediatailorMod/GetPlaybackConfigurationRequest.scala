package typings.awsDashSdk.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPlaybackConfigurationRequest extends js.Object {
  /**
    * The identifier for the playback configuration.
    */
  var Name: __string = js.native
}

object GetPlaybackConfigurationRequest {
  @scala.inline
  def apply(Name: __string): GetPlaybackConfigurationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPlaybackConfigurationRequest]
  }
}

