package typings.activexDashWord.Word

import typings.activexDashWord.activexDashWordNumbers.`0`
import typings.activexDashWord.activexDashWordNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashWord.activexDashWordNumbers.`1`
  - typings.activexDashWord.activexDashWordNumbers.`0`
*/
trait WdProofreadingErrorType extends js.Object

object WdProofreadingErrorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdGrammaticalError: `1` = this.cast(1)
  @scala.inline
  def wdSpellingError: `0` = this.cast(0)
}

