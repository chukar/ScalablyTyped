package typings.parquetjs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: Double
  var dlevels: js.Array[Double]
  var rlevels: js.Array[Double]
  var values: js.Array[Buffer]
}

object Anon_Count {
  @scala.inline
  def apply(count: Double, dlevels: js.Array[Double], rlevels: js.Array[Double], values: js.Array[Buffer]): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dlevels = dlevels.asInstanceOf[js.Any], rlevels = rlevels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Count]
  }
}

