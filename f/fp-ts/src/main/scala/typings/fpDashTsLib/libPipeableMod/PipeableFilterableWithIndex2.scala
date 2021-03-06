package typings
package fpDashTsLib.libPipeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeableFilterableWithIndex2[F /* <: fpDashTsLib.libHKTMod.URIS2 */, I] extends PipeableFilterable2[F] {
  def filterMapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libHKTMod.Kind2[F, _, B]
  ] = js.native
  def filterWithIndex[A](predicateWithIndex: fpDashTsLib.libFilterableWithIndexMod.PredicateWithIndex[I, A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libHKTMod.Kind2[F, _, A]
  ] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_ABA[A, B /* <: A */](refinementWithIndex: fpDashTsLib.libFilterableWithIndexMod.RefinementWithIndex[I, A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libHKTMod.Kind2[F, _, B]
  ] = js.native
  def partitionMapWithIndex[A, RL, RR](f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, _, RL], fpDashTsLib.libHKTMod.Kind2[F, _, RR]]
  ] = js.native
  def partitionWithIndex[A](predicateWithIndex: fpDashTsLib.libFilterableWithIndexMod.PredicateWithIndex[I, A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, _, A], fpDashTsLib.libHKTMod.Kind2[F, _, A]]
  ] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_ABA[A, B /* <: A */](refinementWithIndex: fpDashTsLib.libFilterableWithIndexMod.RefinementWithIndex[I, A, B]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[F, _, A], 
    fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Kind2[F, _, A], fpDashTsLib.libHKTMod.Kind2[F, _, B]]
  ] = js.native
}

