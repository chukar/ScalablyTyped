package typings.ngDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/filtering/filterComparator", JSImport.Namespace)
@js.native
object srcCoreFilteringFilterComparatorMod extends js.Object {
  type FilterComparator[T] = Boolean | IFilterComparatorFunc[T]
  type IFilterComparatorFunc[T] = js.Function2[/* actual */ T, /* expected */ T, Boolean]
}

