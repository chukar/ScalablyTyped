package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Through
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/take", JSImport.Namespace)
@js.native
object throughsTakeMod extends js.Object {
  /**
    * `take` has 2 valid signatures:
    * 1. A single positive integer `n`. `take` pulls `n` values from the source and then closes the stream. This is really useful for limiting how much you pull.
    * 2. A `testFn` function and optional `opts`. Read data from the source stream and forward it downstream until `testFn(data)` returns false, then close the stream.
    *
    *    `opts` is an optional Object of form `{ last: Boolean }`, where `opts.last` determines whether the last value tested (before closing the stream) is included or excluded (default).
    */
  def apply[InOut](n: Double): Through[InOut, InOut] = js.native
  def apply[InOut](testFn: js.Function1[/* data */ InOut, Boolean]): Through[InOut, InOut] = js.native
  def apply[InOut](testFn: js.Function1[/* data */ InOut, Boolean], opts: Anon_Last): Through[InOut, InOut] = js.native
}

