package typings.navermaps.naver.maps.Service

import typings.navermaps.Anon_Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeResponse extends js.Object {
  var result: Anon_Items
}

object GeocodeResponse {
  @scala.inline
  def apply(result: Anon_Items): GeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeocodeResponse]
  }
}

