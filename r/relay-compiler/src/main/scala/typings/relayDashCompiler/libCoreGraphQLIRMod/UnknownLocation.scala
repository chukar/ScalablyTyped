package typings.relayDashCompiler.libCoreGraphQLIRMod

import typings.relayDashCompiler.relayDashCompilerStrings.Unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnknownLocation extends Location {
  var kind: Unknown
}

object UnknownLocation {
  @scala.inline
  def apply(kind: Unknown): UnknownLocation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnknownLocation]
  }
}

