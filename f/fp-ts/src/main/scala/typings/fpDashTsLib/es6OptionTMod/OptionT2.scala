package typings
package fpDashTsLib.es6OptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionT2[M /* <: fpDashTsLib.es6HKTMod.URIS2 */]
  extends fpDashTsLib.es6ApplicativeMod.ApplicativeComposition21[M, fpDashTsLib.es6OptionMod.URI] {
  def chain[L, A, B](
    f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Kind2[M, L, fpDashTsLib.es6OptionMod.Option[B]]],
    fa: fpDashTsLib.es6HKTMod.Kind2[M, L, fpDashTsLib.es6OptionMod.Option[A]]
  ): fpDashTsLib.es6HKTMod.Kind2[M, L, fpDashTsLib.es6OptionMod.Option[B]]
}

object OptionT2 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    ap: (fpDashTsLib.es6HKTMod.Kind2[
      M, 
      js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6OptionMod.URI, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.es6HKTMod.Kind2[M, js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6OptionMod.URI, js.Any]]) => fpDashTsLib.es6HKTMod.Kind2[M, js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6OptionMod.URI, js.Any]],
    chain: (js.Function1[
      js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[M, js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]]
    ], fpDashTsLib.es6HKTMod.Kind2[M, js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]]) => fpDashTsLib.es6HKTMod.Kind2[M, js.Any, fpDashTsLib.es6OptionMod.Option[js.Any]],
    map: (fpDashTsLib.es6HKTMod.Kind2[M, js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6OptionMod.URI, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[M, js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6OptionMod.URI, js.Any]],
    of: js.Any => fpDashTsLib.es6HKTMod.Kind2[M, js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6OptionMod.URI, js.Any]]
  ): OptionT2[M] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[OptionT2[M]]
  }
}

