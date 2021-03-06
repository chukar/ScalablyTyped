package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libActionTypesMod {
  import typings.popmotion.Anon_Init
  import typings.popmotion.libObserverTypesMod.IObserver
  import typings.popmotion.libObserverTypesMod.ObserverProps
  import typings.std.Partial

  type ActionInit = js.Function1[/* observer */ IObserver, Partial[ColdSubscription] | Unit]
  type ActionProps = ObserverProps with Anon_Init
}
