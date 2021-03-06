package typings.winrtDashUwp.Windows.ApplicationModel.Store

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProductPurchaseStatus extends js.Object

/** Defines values used to indicate the transaction status when purchasing an in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.ProductPurchaseStatus")
@js.native
object ProductPurchaseStatus extends js.Object {
  /** The transaction did not complete because this in-app product has already been purchased by the user, and it cannot be purchased again. */
  @js.native
  sealed trait alreadyPurchased extends ProductPurchaseStatus
  
  /** The transaction did not complete because the last purchase of this consumable in-app product has not been reported as fulfilled to the Windows Store. */
  @js.native
  sealed trait notFulfilled extends ProductPurchaseStatus
  
  /** The purchase did not occur because the user decided not to complete the transaction (or the transaction failed for other reasons). */
  @js.native
  sealed trait notPurchased extends ProductPurchaseStatus
  
  /** The transaction succeeded and the user has been notified. */
  @js.native
  sealed trait succeeded extends ProductPurchaseStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProductPurchaseStatus with Double] = js.native
  /* 1 */ @js.native
  object alreadyPurchased extends TopLevel[alreadyPurchased with Double]
  
  /* 2 */ @js.native
  object notFulfilled extends TopLevel[notFulfilled with Double]
  
  /* 3 */ @js.native
  object notPurchased extends TopLevel[notPurchased with Double]
  
  /* 0 */ @js.native
  object succeeded extends TopLevel[succeeded with Double]
  
}

