package typings.atOracleOraclejet.ojradiosetMod

import typings.atOracleOraclejet.Anon_ConverterHint
import typings.atOracleOraclejet.Anon_Definition
import typings.atOracleOraclejet.Anon_Instruction
import typings.atOracleOraclejet.Anon_Required
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidHidden
import typings.atOracleOraclejet.atOracleOraclejetStrings.invalidShown
import typings.atOracleOraclejet.atOracleOraclejetStrings.pending
import typings.atOracleOraclejet.atOracleOraclejetStrings.valid
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.atOracleOraclejet.ojmessagingMod.^
import typings.atOracleOraclejet.ojradiosetMod.ojRadioset.OptionContext
import typings.atOracleOraclejet.ojradiosetMod.ojRadioset.OptionsKeys
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojRadiosetSettableProperties[K, D]
  extends editableValueSettableProperties[js.Any, js.Any, js.Any] {
  var labelledBy: String | Null
  var optionRenderer: js.UndefOr[(js.Function1[/* param0 */ OptionContext[D], Element]) | Null] = js.undefined
  var options: (DataProvider[K, D]) | Null
  var optionsKeys: js.UndefOr[OptionsKeys] = js.undefined
  var required: Boolean
  @JSName("translations")
  var translations_ojRadiosetSettableProperties: Anon_Required
}

object ojRadiosetSettableProperties {
  @scala.inline
  def apply[K, D](
    disabled: Boolean,
    displayOptions: Anon_ConverterHint,
    help: Anon_Instruction,
    helpHints: Anon_Definition,
    labelHint: String,
    messagesCustom: js.Array[^],
    required: Boolean,
    translations: Anon_Required,
    valid: valid | pending | invalidHidden | invalidShown,
    value: js.Any,
    describedBy: String = null,
    labelledBy: String = null,
    optionRenderer: /* param0 */ OptionContext[D] => Element = null,
    options: DataProvider[K, D] = null,
    optionsKeys: OptionsKeys = null
  ): ojRadiosetSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy.asInstanceOf[js.Any])
    if (labelledBy != null) __obj.updateDynamic("labelledBy")(labelledBy.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (optionsKeys != null) __obj.updateDynamic("optionsKeys")(optionsKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRadiosetSettableProperties[K, D]]
  }
}

