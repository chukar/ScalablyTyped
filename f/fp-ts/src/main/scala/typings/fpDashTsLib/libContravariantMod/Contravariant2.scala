package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  val URI: F
  def contramap[L, A, B](fa: fpDashTsLib.libHKTMod.Kind2[F, L, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.Kind2[F, L, B]
}

object Contravariant2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    contramap: (fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
  ): Contravariant2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
  
    __obj.asInstanceOf[Contravariant2[F]]
  }
}

