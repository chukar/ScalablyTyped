package typings.baiduDashApp.swan.ai

import typings.baiduDashApp.Anon_Height
import typings.baiduDashApp.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait carClassifyResponse extends js.Object {
  var location_result: Anon_Height
  var log_id: Double
   // 	唯一的log id，用于问题定位。
  var result: js.Array[Anon_Name]
}

object carClassifyResponse {
  @scala.inline
  def apply(location_result: Anon_Height, log_id: Double, result: js.Array[Anon_Name]): carClassifyResponse = {
    val __obj = js.Dynamic.literal(location_result = location_result.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[carClassifyResponse]
  }
}

