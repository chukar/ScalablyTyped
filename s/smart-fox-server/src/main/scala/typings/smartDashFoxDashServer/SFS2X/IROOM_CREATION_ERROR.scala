package typings.smartDashFoxDashServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IROOM_CREATION_ERROR extends js.Object {
  var errorCode: Double
  var errorMessage: String
}

object IROOM_CREATION_ERROR {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String): IROOM_CREATION_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IROOM_CREATION_ERROR]
  }
}

