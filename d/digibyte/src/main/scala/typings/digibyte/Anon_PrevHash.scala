package typings.digibyte

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrevHash extends js.Object {
  var prevHash: String
  var time: Double
}

object Anon_PrevHash {
  @scala.inline
  def apply(prevHash: String, time: Double): Anon_PrevHash = {
    val __obj = js.Dynamic.literal(prevHash = prevHash.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PrevHash]
  }
}

