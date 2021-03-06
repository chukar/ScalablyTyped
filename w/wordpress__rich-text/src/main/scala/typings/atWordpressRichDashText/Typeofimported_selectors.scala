package typings.atWordpressRichDashText

import typings.atWordpressRichDashText.atWordpressRichDashTextMod.NamedFormatConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofimported_selectors extends js.Object {
  def getFormatType(name: String): js.UndefOr[NamedFormatConfiguration]
  def getFormatTypeForBareElement(
    bareElementTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
  ): js.UndefOr[NamedFormatConfiguration]
  def getFormatTypeForClassName(elementClassName: String): js.UndefOr[NamedFormatConfiguration]
  def getFormatTypes(): js.Array[NamedFormatConfiguration]
}

object Typeofimported_selectors {
  @scala.inline
  def apply(
    getFormatType: String => js.UndefOr[NamedFormatConfiguration],
    getFormatTypeForBareElement: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => js.UndefOr[NamedFormatConfiguration],
    getFormatTypeForClassName: String => js.UndefOr[NamedFormatConfiguration],
    getFormatTypes: () => js.Array[NamedFormatConfiguration]
  ): Typeofimported_selectors = {
    val __obj = js.Dynamic.literal(getFormatType = js.Any.fromFunction1(getFormatType), getFormatTypeForBareElement = js.Any.fromFunction1(getFormatTypeForBareElement), getFormatTypeForClassName = js.Any.fromFunction1(getFormatTypeForClassName), getFormatTypes = js.Any.fromFunction0(getFormatTypes))
  
    __obj.asInstanceOf[Typeofimported_selectors]
  }
}

