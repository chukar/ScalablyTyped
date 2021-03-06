package typings.jpm.sdkContextDashMenuMod

import org.scalablytyped.runtime.TopLevel
import typings.jpm.Anon_DocumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredicateContext extends Context {
  def apply(predicateFunction: js.Function1[/* context */ Anon_DocumentType, Boolean]): js.Object = js.native
}

@JSImport("sdk/context-menu", "PredicateContext")
@js.native
object PredicateContext extends TopLevel[PredicateContext]

