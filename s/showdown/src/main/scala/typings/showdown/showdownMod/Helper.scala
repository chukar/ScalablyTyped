package typings.showdown.showdownMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * Helper Interface 
  */
trait Helper
  extends /* key */ StringDictionary[js.Function1[/* repeated */ js.Any, _]] {
  def replaceRecursiveRegExp(args: js.Any*): String
}

object Helper {
  @scala.inline
  def apply(
    replaceRecursiveRegExp: /* repeated */ js.Any => String,
    StringDictionary: /* key */ StringDictionary[js.Function1[/* repeated */ js.Any, _]] = null
  ): Helper = {
    val __obj = js.Dynamic.literal(replaceRecursiveRegExp = js.Any.fromFunction1(replaceRecursiveRegExp))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Helper]
  }
}

/**
  * Showdown helper.
  */
@JSImport("showdown", "helper")
@js.native
object helper extends TopLevel[Helper]

