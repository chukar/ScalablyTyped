package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qunit {
  type QUnit = QUnit_
  type moduleFunc1 = js.Function3[
    /* name */ String, 
    /* hooks */ js.UndefOr[Hooks], 
    /* nested */ js.UndefOr[js.Function1[/* hooks */ NestedHooks, Unit]], 
    Unit
  ]
  type moduleFunc2 = js.Function2[
    /* name */ String, 
    /* nested */ js.UndefOr[js.Function1[/* hooks */ NestedHooks, Unit]], 
    Unit
  ]
}
