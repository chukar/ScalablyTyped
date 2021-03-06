package typings.cacheableDashRequest.cacheableDashRequestMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheErrorCls extends Error {
  @JSName("name")
  val name_CacheErrorCls: typings.cacheableDashRequest.cacheableDashRequestStrings.CacheError
}

object CacheErrorCls {
  @scala.inline
  def apply(
    message: String,
    name: typings.cacheableDashRequest.cacheableDashRequestStrings.CacheError,
    stack: String = null
  ): CacheErrorCls = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheErrorCls]
  }
}

