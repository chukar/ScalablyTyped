package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.QueryExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoNodesPredicate extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var nodes: js.Array[QueryExpr]
  var predicate: String
  var `type`: String
}

object Anon_ColumnFilenameLinenoNodesPredicate {
  @scala.inline
  def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    nodes: js.Array[QueryExpr],
    predicate: String,
    `type`: String
  ): Anon_ColumnFilenameLinenoNodesPredicate = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoNodesPredicate]
  }
}

