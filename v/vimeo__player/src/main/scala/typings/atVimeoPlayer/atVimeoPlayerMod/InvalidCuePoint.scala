package typings.atVimeoPlayer.atVimeoPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidCuePoint extends Error {
  @JSName("name")
  var name_InvalidCuePoint: typings.atVimeoPlayer.atVimeoPlayerStrings.InvalidCuePoint
}

object InvalidCuePoint {
  @scala.inline
  def apply(message: String, method: String, name: typings.atVimeoPlayer.atVimeoPlayerStrings.InvalidCuePoint): InvalidCuePoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InvalidCuePoint]
  }
}

