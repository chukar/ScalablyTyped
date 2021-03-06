package typings.tstl

import org.scalablytyped.runtime.Instantiable2
import typings.tstl.exceptionErrorCategoryMod.ErrorCategory
import typings.tstl.exceptionErrorCodeMod.ErrorCode
import typings.tstl.exceptionRuntimeErrorMod.RuntimeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/SystemError", JSImport.Namespace)
@js.native
object exceptionSystemErrorMod extends js.Object {
  @js.native
  class SystemError protected () extends RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param code An error code.
      * @param message A detailed error message.
      */
    def this(code: ErrorCode) = this()
    def this(code: ErrorCode, message: String) = this()
    /**
      * Construct from references.
      *
      * @param val Identnfier of an error code in *category*.
      * @param category An error category.
      * @param message A detailed error message.
      */
    def this(`val`: Double, category: ErrorCategory) = this()
    def this(`val`: Double, category: ErrorCategory, message: String) = this()
    /**
      * @hidden
      */
    var code_ : ErrorCode = js.native
    /**
      * Get error code.
      *
      * @return The error code.
      */
    def code(): ErrorCode = js.native
  }
  
  var system_error: Instantiable2[/* code */ ErrorCode, js.UndefOr[/* message */ String], SystemError] = js.native
  type system_error = SystemError
}

