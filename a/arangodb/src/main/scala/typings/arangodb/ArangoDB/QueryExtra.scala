package typings.arangodb.ArangoDB

import typings.arangodb.Anon_ExecutionTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExtra extends js.Object {
  var stats: Anon_ExecutionTime
  var warnings: js.Array[String]
}

object QueryExtra {
  @scala.inline
  def apply(stats: Anon_ExecutionTime, warnings: js.Array[String]): QueryExtra = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryExtra]
  }
}

