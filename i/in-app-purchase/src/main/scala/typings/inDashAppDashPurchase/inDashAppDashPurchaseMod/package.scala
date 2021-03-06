package typings.inDashAppDashPurchase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inDashAppDashPurchaseMod {
  import typings.inDashAppDashPurchase.Anon_Data

  type AmazonReceipt = js.Object | String
  type AppleReceipt = String
  type GoogleReceipt = Anon_Data | String
  type Receipt = UnityReceipt | AppleReceipt | GoogleReceipt | WindowsReceipt | AmazonReceipt | RokuReceipt
  type RokuReceipt = String
  type UnityReceipt = js.Object | String
  type WindowsReceipt = String
}
