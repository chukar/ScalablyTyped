package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatePicker extends js.Object {
  var DatePicker: js.UndefOr[Anon_DatePickerLocaleDismissText] = js.undefined
  var DatePickerView: js.UndefOr[Anon_AmDay] = js.undefined
  var InputItem: js.UndefOr[Anon_BackspaceLabel] = js.undefined
  var ListView: js.UndefOr[Anon_Done] = js.undefined
  var Modal: js.UndefOr[Anon_ButtonText] = js.undefined
  var Pagination: js.UndefOr[Anon_NextText] = js.undefined
  var Picker: js.UndefOr[Anon_DismissText] = js.undefined
  var SearchBar: js.UndefOr[Anon_CancelText] = js.undefined
  var exist: Boolean
  var locale: js.UndefOr[String] = js.undefined
}

object Anon_DatePicker {
  @scala.inline
  def apply(
    exist: Boolean,
    DatePicker: Anon_DatePickerLocaleDismissText = null,
    DatePickerView: Anon_AmDay = null,
    InputItem: Anon_BackspaceLabel = null,
    ListView: Anon_Done = null,
    Modal: Anon_ButtonText = null,
    Pagination: Anon_NextText = null,
    Picker: Anon_DismissText = null,
    SearchBar: Anon_CancelText = null,
    locale: String = null
  ): Anon_DatePicker = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any])
    if (DatePicker != null) __obj.updateDynamic("DatePicker")(DatePicker.asInstanceOf[js.Any])
    if (DatePickerView != null) __obj.updateDynamic("DatePickerView")(DatePickerView.asInstanceOf[js.Any])
    if (InputItem != null) __obj.updateDynamic("InputItem")(InputItem.asInstanceOf[js.Any])
    if (ListView != null) __obj.updateDynamic("ListView")(ListView.asInstanceOf[js.Any])
    if (Modal != null) __obj.updateDynamic("Modal")(Modal.asInstanceOf[js.Any])
    if (Pagination != null) __obj.updateDynamic("Pagination")(Pagination.asInstanceOf[js.Any])
    if (Picker != null) __obj.updateDynamic("Picker")(Picker.asInstanceOf[js.Any])
    if (SearchBar != null) __obj.updateDynamic("SearchBar")(SearchBar.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DatePicker]
  }
}

