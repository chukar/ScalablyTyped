package typings.angularDashStrap.mgcrea.ngStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object datepicker {
  import typings.angular.angularMod.IAugmentedJQuery

  type IDatepickerService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ js.UndefOr[IDatepickerOptions], 
    IDatepicker
  ]
}
