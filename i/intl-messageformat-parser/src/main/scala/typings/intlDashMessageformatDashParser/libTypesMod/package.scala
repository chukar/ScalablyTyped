package typings.intlDashMessageformatDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typings.intlDashMessageformatDashParser.libTypesMod.TYPE.argument
  import typings.intlDashMessageformatDashParser.libTypesMod.TYPE.date
  import typings.intlDashMessageformatDashParser.libTypesMod.TYPE.literal
  import typings.intlDashMessageformatDashParser.libTypesMod.TYPE.number
  import typings.intlDashMessageformatDashParser.libTypesMod.TYPE.time

  type ArgumentElement = BaseElement[argument]
  type DateElement = SimpleFormatElement[date, DateTimeSkeleton]
  type LiteralElement = BaseElement[literal]
  /* Rewritten from type alias, can be one of: 
    - typings.intlDashMessageformatDashParser.libTypesMod.LiteralElement
    - typings.intlDashMessageformatDashParser.libTypesMod.ArgumentElement
    - typings.intlDashMessageformatDashParser.libTypesMod.NumberElement
    - typings.intlDashMessageformatDashParser.libTypesMod.DateElement
    - typings.intlDashMessageformatDashParser.libTypesMod.TimeElement
    - typings.intlDashMessageformatDashParser.libTypesMod.SelectElement
    - typings.intlDashMessageformatDashParser.libTypesMod.PluralElement
  */
  type MessageFormatElement = _MessageFormatElement | LiteralElement | ArgumentElement | NumberElement | DateElement | TimeElement
  type NumberElement = SimpleFormatElement[number, NumberSkeleton]
  type TimeElement = SimpleFormatElement[time, DateTimeSkeleton]
  /* Rewritten from type alias, can be one of: 
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.zero
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.one
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.two
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.few
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.many
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.other
    - java.lang.String
  */
  type ValidPluralRule = _ValidPluralRule | String
}
