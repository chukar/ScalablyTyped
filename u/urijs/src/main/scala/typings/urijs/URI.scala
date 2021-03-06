package typings.urijs

import org.scalablytyped.runtime.TopLevel
import typings.urijs.uri.URIOptions
import typings.urijs.uri.URIStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("URI")
@js.native
class URI ()
  extends typings.urijs.uri.URI {
  def this(value: String) = this()
  def this(value: HTMLElement) = this()
  def this(value: URIOptions) = this()
}

@JSGlobal("URI")
@js.native
object URI extends TopLevel[URIStatic]

