package typings.astDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  import typings.std.Exclude
  import typings.std.Pick

  type Def = Plugin[Unit]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type Plugin[T] = js.Function1[/* fork */ Fork, T]
}
