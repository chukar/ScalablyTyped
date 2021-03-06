package typings.atGrpcGrpcDashJs.buildSrcResolverMod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverConstructor extends Instantiable2[/* target */ String, /* listener */ ResolverListener, Resolver] {
  /**
    * Get the default authority for a target. This loosely corresponds to that
    * target's hostname. Throws an error if this resolver class cannot parse the
    * `target`.
    * @param target
    */
  def getDefaultAuthority(target: String): String = js.native
}

