package typings.i2cDashBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i2cDashBusMod {
  import typings.node.Buffer

  type BufferCallback = js.Function3[/* error */ js.Any, /* bytesReadOrWritten */ Double, /* buffer */ Buffer, js.Any]
  type CompletionCallback = js.Function1[/* error */ js.Any, js.Any]
  type ResultCallback[T] = js.Function2[/* error */ js.Any, /* result */ T, js.Any]
}
