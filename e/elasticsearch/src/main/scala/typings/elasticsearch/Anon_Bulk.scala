package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bulk extends js.Object {
  var bulk: Double
  var search: Double
}

object Anon_Bulk {
  @scala.inline
  def apply(bulk: Double, search: Double): Anon_Bulk = {
    val __obj = js.Dynamic.literal(bulk = bulk.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bulk]
  }
}

