package typings.changeDashEmitter.changeDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEmitterOf4[T1, T2, T3, T4] extends js.Object {
  def emit(value1: T1, value2: T2, value3: T3, value4: T4): Unit
  def listen(listener: ListenerOf4[T1, T2, T3, T4]): Unlisten
}

object ChangeEmitterOf4 {
  @scala.inline
  def apply[T1, T2, T3, T4](emit: (T1, T2, T3, T4) => Unit, listen: ListenerOf4[T1, T2, T3, T4] => Unlisten): ChangeEmitterOf4[T1, T2, T3, T4] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction4(emit), listen = js.Any.fromFunction1(listen))
  
    __obj.asInstanceOf[ChangeEmitterOf4[T1, T2, T3, T4]]
  }
}

