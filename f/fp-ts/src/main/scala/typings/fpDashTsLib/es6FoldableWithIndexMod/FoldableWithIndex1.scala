package typings
package fpDashTsLib.es6FoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndex1[F /* <: fpDashTsLib.es6HKTMod.URIS */, I]
  extends fpDashTsLib.es6Foldable2vMod.Foldable2v1[F] {
  def foldMapWithIndex[M](M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[A, B](fa: fpDashTsLib.es6HKTMod.Kind[F, A], b: B, f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]): B
  def reduceWithIndex[A, B](fa: fpDashTsLib.es6HKTMod.Kind[F, A], b: B, f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]): B
}

object FoldableWithIndex1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */, I](
    URI: F,
    foldMap: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldMapWithIndex: fpDashTsLib.es6MonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[F, _], 
      /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
      js.Any
    ],
    foldr: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    foldrWithIndex: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Any,
    reduce: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceWithIndex: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Any
  ): FoldableWithIndex1[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), foldr = js.Any.fromFunction3(foldr), foldrWithIndex = js.Any.fromFunction3(foldrWithIndex), reduce = js.Any.fromFunction3(reduce), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
  
    __obj.asInstanceOf[FoldableWithIndex1[F, I]]
  }
}

