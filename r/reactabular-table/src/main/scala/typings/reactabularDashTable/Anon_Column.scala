package typings.reactabularDashTable

import typings.reactabularDashTable.reactabularDashTableMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: Column
  var columnIndex: Double
  var property: String
}

object Anon_Column {
  @scala.inline
  def apply(column: Column, columnIndex: Double, property: String): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Column]
  }
}

