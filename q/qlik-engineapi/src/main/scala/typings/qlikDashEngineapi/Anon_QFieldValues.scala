package typings.qlikDashEngineapi

import typings.qlikDashEngineapi.EngineAPI.IFieldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QFieldValues extends js.Object {
  var qFieldValues: js.Array[IFieldValue]
}

object Anon_QFieldValues {
  @scala.inline
  def apply(qFieldValues: js.Array[IFieldValue]): Anon_QFieldValues = {
    val __obj = js.Dynamic.literal(qFieldValues = qFieldValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QFieldValues]
  }
}

