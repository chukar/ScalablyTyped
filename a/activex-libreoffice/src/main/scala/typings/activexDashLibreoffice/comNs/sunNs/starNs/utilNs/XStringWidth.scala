package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface that encapsulates the abstract notion of string width.
  * @see XStringAbbreviation
  */
trait XStringWidth extends XInterface {
  /**
    * compute the width of a given string.
    *
    * Depending on the implementation of this interface, the width of a string can be rather different things, like the number of characters in the string,
    * or the width in pixel when displayed with a specific font.
    * @param aString The string that is to be measured.
    * @returns the string's width.
    */
  def queryStringWidth(aString: String): Double
}

object XStringWidth {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    queryStringWidth: String => Double,
    release: () => Unit
  ): XStringWidth = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), queryStringWidth = js.Any.fromFunction1(queryStringWidth), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStringWidth]
  }
}

