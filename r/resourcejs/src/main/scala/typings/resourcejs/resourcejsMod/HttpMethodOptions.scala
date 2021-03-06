package typings.resourcejs.resourcejsMod

import typings.express.expressMod.NextFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpMethodOptions extends js.Object {
  var after: js.UndefOr[HttpHandler] = js.undefined
  var before: js.UndefOr[HttpHandler] = js.undefined
}

object HttpMethodOptions {
  @scala.inline
  def apply(
    after: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null,
    before: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit = null
  ): HttpMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction3(before))
    __obj.asInstanceOf[HttpMethodOptions]
  }
}

