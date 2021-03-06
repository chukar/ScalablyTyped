package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Contravariant", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def lift[F](contravariant: Contravariant[F]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  @JSName("lift")
  def lift_Array(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Const(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Const[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Either(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Either[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Eq(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Free(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Free[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_FreeGroup(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IO(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IOEither(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IOEither[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Identity(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IxIO(contravariant: Contravariant3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IxIO[U, L](contravariant: Contravariant3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Map(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Map[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_NonEmptyArray(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_NonEmptyArray2v(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Option(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Ord(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Pair(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Reader(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Reader[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_ReaderTaskEither(contravariant: Contravariant3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_ReaderTaskEither[U, L](contravariant: Contravariant3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Record(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_State(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_State[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Store(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Store[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_StrMap(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Task(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_TaskEither(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_TaskEither[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_These(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_These[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Traced(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Traced[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tree(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tuple(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tuple[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Validation(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Validation[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Writer(contravariant: Contravariant2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Writer[L](contravariant: Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Zipper(contravariant: Contravariant1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ]
  ] = js.native
}

