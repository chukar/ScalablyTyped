package typings.kendoDashUi.kendo.data

import typings.kendoDashUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.data.TemplateBinding")
@js.native
class TemplateBinding protected () extends Binding {
  def this(source: Observable, path: String, template: js.Function) = this()
  def render(value: js.Object): String = js.native
}

