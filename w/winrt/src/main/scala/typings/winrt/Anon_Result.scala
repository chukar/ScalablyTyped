package typings.winrt

import typings.winrt.Windows.Data.Json.JsonArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Result extends js.Object {
  var result: JsonArray
  var succeeded: Boolean
}

object Anon_Result {
  @scala.inline
  def apply(result: JsonArray, succeeded: Boolean): Anon_Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Result]
  }
}

