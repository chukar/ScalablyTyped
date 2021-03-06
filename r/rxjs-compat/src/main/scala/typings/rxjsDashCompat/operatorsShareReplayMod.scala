package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operators/shareReplay", JSImport.Namespace)
@js.native
object operatorsShareReplayMod extends js.Object {
  def shareReplay[T](): js.Any = js.native
  def shareReplay[T](bufferSize: Double): js.Any = js.native
  def shareReplay[T](bufferSize: Double, windowTime: Double): js.Any = js.native
  def shareReplay[T](
    bufferSize: Double,
    windowTime: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def shareReplay[T](
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShareReplayConfig */ js.Any
  ): js.Any = js.native
}

