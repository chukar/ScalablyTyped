package typings.stylus

import typings.stylus.stylusMod.Stylus.Nodes.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoSelectors extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var selectors: js.Array[Selector]
}

object Anon_ColumnFilenameLinenoSelectors {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, selectors: js.Array[Selector]): Anon_ColumnFilenameLinenoSelectors = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoSelectors]
  }
}

