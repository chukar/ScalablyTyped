package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown in case a configuration does not exists or contains corrupt data.
  *
  * This exception must be used as base exception to derive specialized exceptions from it which identify a concrete error case.
  * @since OOo 2.3
  */
trait CorruptedConfigurationException extends Exception {
  /** Instead of the message part of an exception, this value describe the type of corruption more in detail. */
  var Details: String
}

object CorruptedConfigurationException {
  @scala.inline
  def apply(Context: XInterface, Details: String, Message: String): CorruptedConfigurationException = {
    val __obj = js.Dynamic.literal(Context = Context, Details = Details, Message = Message)
  
    __obj.asInstanceOf[CorruptedConfigurationException]
  }
}

