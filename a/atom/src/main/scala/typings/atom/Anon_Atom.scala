package typings.atom

import typings.atom.atomStrings.experimental
import typings.atom.atomStrings.native
import typings.atom.atomStrings.poll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Atom extends js.Object {
  var newValue: native | experimental | poll | typings.atom.atomStrings.atom
  var oldValue: js.UndefOr[native | experimental | poll | typings.atom.atomStrings.atom] = js.undefined
}

object Anon_Atom {
  @scala.inline
  def apply(
    newValue: native | experimental | poll | typings.atom.atomStrings.atom,
    oldValue: native | experimental | poll | typings.atom.atomStrings.atom = null
  ): Anon_Atom = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Atom]
  }
}

