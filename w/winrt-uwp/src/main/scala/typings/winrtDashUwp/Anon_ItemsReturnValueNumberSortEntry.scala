package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Storage.Search.SortEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberSortEntry extends js.Object {
  /** The sort entries in the collection that start at startIndex. */ var items: SortEntry
  /** The number of items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueNumberSortEntry {
  @scala.inline
  def apply(items: SortEntry, returnValue: Double): Anon_ItemsReturnValueNumberSortEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberSortEntry]
  }
}

