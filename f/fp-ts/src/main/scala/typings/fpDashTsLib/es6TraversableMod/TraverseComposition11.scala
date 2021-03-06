package typings
package fpDashTsLib.es6TraversableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraverseComposition11[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS */] extends js.Object {
  def apply(
    H: fpDashTsLib.es6ApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]]
    ]
  ] = js.native
  def apply(
    H: fpDashTsLib.es6ApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      _, 
      fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]]
    ]
  ] = js.native
  def apply(
    H: fpDashTsLib.es6ApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ]
  ): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      _, 
      _, 
      fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]]
    ]
  ] = js.native
  def apply[H](H: fpDashTsLib.es6ApplicativeMod.Applicative[H]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[H, _]], 
    fpDashTsLib.es6HKTMod.HKT[H, fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]]]
  ] = js.native
  def apply[HL](
    H: fpDashTsLib.es6ApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      HL
    ]
  ): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      HL, 
      fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]]
    ]
  ] = js.native
  def apply[HU, HL](
    H: fpDashTsLib.es6ApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      HU, 
      HL
    ]
  ): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, HU, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      HU, 
      HL, 
      fpDashTsLib.es6HKTMod.Kind[F, fpDashTsLib.es6HKTMod.Kind[G, _]]
    ]
  ] = js.native
}

