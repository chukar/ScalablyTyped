package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.SP.JsGrid.Internal.PropertyUpdate
import typings.sharepoint.SP.JsGrid.ValidationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.PropertyChanged")
@js.native
class PropertyChanged protected () extends IEventArgs {
  def this(
    recordKey: Double,
    fieldKey: String,
    oldProp: PropertyUpdate,
    newProp: PropertyUpdate,
    propType: IPropertyType,
    changeKey: IChangeKey,
    validationState: ValidationState
  ) = this()
  var changeKey: IChangeKey = js.native
  var fieldKey: String = js.native
  var newProp: PropertyUpdate = js.native
  var oldProp: PropertyUpdate = js.native
  var propType: IPropertyType = js.native
  var recordKey: Double = js.native
  var validationState: ValidationState = js.native
}

