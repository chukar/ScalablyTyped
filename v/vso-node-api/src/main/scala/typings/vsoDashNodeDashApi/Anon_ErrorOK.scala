package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorOK extends js.Object {
  var error: Double
  var oK: Double
  var warning: Double
}

object Anon_ErrorOK {
  @scala.inline
  def apply(error: Double, oK: Double, warning: Double): Anon_ErrorOK = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrorOK]
  }
}

