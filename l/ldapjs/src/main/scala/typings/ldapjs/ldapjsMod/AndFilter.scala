package typings.ldapjs.ldapjsMod

import typings.ldapjs.Anon_Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "AndFilter")
@js.native
class AndFilter protected () extends Filter {
  def this(options: Anon_Filters) = this()
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def matches(obj: js.Any): Boolean = js.native
}

