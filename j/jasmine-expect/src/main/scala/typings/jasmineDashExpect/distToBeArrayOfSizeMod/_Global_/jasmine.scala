package typings.jasmineDashExpect.distToBeArrayOfSizeMod._Global_

import typings.jasmineDashExpect.distToBeArrayOfSizeMod.ToBeArrayOfSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toBeArrayOfSize")
    var toBeArrayOfSize_Original: ToBeArrayOfSize = js.native
    def toBeArrayOfSize(size: Double): Boolean = js.native
    def toBeArrayOfSize(size: Double, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

