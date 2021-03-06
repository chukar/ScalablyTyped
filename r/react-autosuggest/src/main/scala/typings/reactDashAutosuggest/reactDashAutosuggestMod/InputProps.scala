package typings.reactDashAutosuggest.reactDashAutosuggestMod

import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<any> ]: P} & {[ P in 'onChange' | 'onBlur' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<any>] ]: react.react.InputHTMLAttributes<any>[P]} */ trait InputProps[TSuggestion] extends js.Object {
  var onBlur: js.UndefOr[
    js.Function2[/* event */ FocusEvent[_], /* params */ js.UndefOr[BlurEvent[TSuggestion]], Unit]
  ] = js.undefined
  var value: String
  def onChange(event: FormEvent[_], params: ChangeEvent): Unit
}

object InputProps {
  @scala.inline
  def apply[TSuggestion](
    onChange: (FormEvent[_], ChangeEvent) => Unit,
    value: String,
    onBlur: (/* event */ FocusEvent[_], /* params */ js.UndefOr[BlurEvent[TSuggestion]]) => Unit = null
  ): InputProps[TSuggestion] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    __obj.asInstanceOf[InputProps[TSuggestion]]
  }
}

