package typings.tstl

import typings.tstl.exceptionLogicErrorMod.LogicError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/InvalidArgument", JSImport.Namespace)
@js.native
object exceptionInvalidArgumentMod extends js.Object {
  @js.native
  class InvalidArgument protected () extends LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
}

