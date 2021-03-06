package typings.dc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dcMod {
  import typings.std.Date

  type Accessor[T, V] = js.Function2[/* datum */ T, /* index */ js.UndefOr[Double], V]
  type UnitFunction = js.Function3[
    /* start */ Double | Date, 
    /* end */ Double | Date, 
    /* domain */ js.UndefOr[Double | js.Array[String]], 
    Double | (js.Array[Double | Date | String])
  ]
}
