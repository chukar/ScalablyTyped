package typings.naja.najaMod

import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsHandler extends js.Object {
  var netteForms: js.Object
  def initForms(element: Element): Unit
  def processForm(event: Event): Unit
}

object FormsHandler {
  @scala.inline
  def apply(initForms: Element => Unit, netteForms: js.Object, processForm: Event => Unit): FormsHandler = {
    val __obj = js.Dynamic.literal(initForms = js.Any.fromFunction1(initForms), netteForms = netteForms.asInstanceOf[js.Any], processForm = js.Any.fromFunction1(processForm))
  
    __obj.asInstanceOf[FormsHandler]
  }
}

