package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.DocumentReference

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.DocumentSnapshot
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Query.SnapshotError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  var error: js.UndefOr[ObserverOnError] = js.undefined
  var next: ObserverOnNext
}

object Observer {
  @scala.inline
  def apply(
    next: /* documentSnapshot */ DocumentSnapshot => Unit,
    error: /* err */ SnapshotError => Unit = null
  ): Observer = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    __obj.asInstanceOf[Observer]
  }
}

