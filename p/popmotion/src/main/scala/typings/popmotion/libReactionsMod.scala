package typings.popmotion

import typings.popmotion.libActionTypesMod.ColdSubscription
import typings.popmotion.libChainableMod.default
import typings.popmotion.libObserverTypesMod.IObserver
import typings.popmotion.libObserverTypesMod.ObserverCandidate
import typings.popmotion.libReactionsTypesMod.HotSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/reactions", JSImport.Namespace)
@js.native
object libReactionsMod extends js.Object {
  @js.native
  abstract class BaseMulticast[T] ()
    extends default[T]
       with IObserver {
    var parent: js.Any = js.native
    var subscribers: js.Array[IObserver] = js.native
    def registerParent(subscription: ColdSubscription): Unit = js.native
    def stop(): Unit = js.native
    def subscribe(observerCandidate: ObserverCandidate): HotSubscription = js.native
    @JSName("update")
    def update_MBaseMulticast(v: js.Any): Unit = js.native
  }
  
}

