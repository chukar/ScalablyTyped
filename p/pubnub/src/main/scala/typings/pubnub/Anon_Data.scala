package typings.pubnub

import typings.pubnub.pubnubMod.UserData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: UserData
  var event: String
  var `type`: String
}

object Anon_Data {
  @scala.inline
  def apply(data: UserData, event: String, `type`: String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

