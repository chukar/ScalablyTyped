package typings.reactDashBootstrap.libPaginationNextMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationNextProps
  extends AllHTMLAttributes[PaginationNext]
     with ClassAttributes[PaginationNext]

object PaginationNextProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PaginationNext] = null,
    ClassAttributes: ClassAttributes[PaginationNext] = null
  ): PaginationNextProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    __obj.asInstanceOf[PaginationNextProps]
  }
}

