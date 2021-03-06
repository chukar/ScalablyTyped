package typings
package fpDashTsLib.libTraversableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversableComposition[F, G]
  extends fpDashTsLib.libFoldableMod.FoldableComposition[F, G]
     with fpDashTsLib.libFunctorMod.FunctorComposition[F, G] {
  def traverse[H](H: fpDashTsLib.libApplicativeMod.Applicative[H]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[H, _]], 
    fpDashTsLib.libHKTMod.HKT[H, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]]]
  ]
}

object TraversableComposition {
  @scala.inline
  def apply[F, G](
    map: (fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]],
    reduce: (fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    traverse: fpDashTsLib.libApplicativeMod.Applicative[js.Any] => js.Function2[
      /* fga */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]], 
      /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[js.Any, _]], 
      fpDashTsLib.libHKTMod.HKT[js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[G, _]]]
    ]
  ): TraversableComposition[F, G] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), reduce = js.Any.fromFunction3(reduce), traverse = js.Any.fromFunction1(traverse))
  
    __obj.asInstanceOf[TraversableComposition[F, G]]
  }
}

