package typings
package fpDashTsLib.es6ReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Reader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Reader = js.native
  val reader: fpDashTsLib.es6MonadMod.Monad2[URI] with fpDashTsLib.es6ProfunctorMod.Profunctor2[URI] with fpDashTsLib.es6CategoryMod.Category2[URI] with fpDashTsLib.es6StrongMod.Strong2[URI] with fpDashTsLib.es6ChoiceMod.Choice2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(apFirst, apSecond, chain, chainFirst, compose, flatten, map, promap) */ def ap[L, A](fa: Reader[L, A]): js.Function1[/* fab */ Reader[L, js.Function1[/* a */ A, _]], Reader[L, _]] = js.native
  def ask[E](): Reader[E, E] = js.native
  def asks[E, A](f: js.Function1[/* e */ E, A]): Reader[E, A] = js.native
  def getMonoid[E, A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[Reader[E, A]] = js.native
  def getSemigroup[E, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[Reader[E, A]] = js.native
  def local[E, E2](f: js.Function1[/* e */ E2, E]): js.Function1[/* fa */ Reader[E, _], Reader[E2, _]] = js.native
  def of[R, A](a: A): Reader[R, A] = js.native
}

