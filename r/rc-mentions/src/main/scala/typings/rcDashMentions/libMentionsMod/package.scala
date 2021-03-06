package typings.rcDashMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMentionsMod {
  import typings.rcDashMentions.libUtilMod.Omit
  import typings.rcDashMentions.rcDashMentionsStrings.onChange
  import typings.rcDashMentions.rcDashMentionsStrings.onSelect
  import typings.rcDashMentions.rcDashMentionsStrings.prefix
  import typings.react.reactMod.TextareaHTMLAttributes
  import typings.std.HTMLTextAreaElement

  type BaseTextareaAttrs = Omit[TextareaHTMLAttributes[HTMLTextAreaElement], prefix | onChange | onSelect]
}
