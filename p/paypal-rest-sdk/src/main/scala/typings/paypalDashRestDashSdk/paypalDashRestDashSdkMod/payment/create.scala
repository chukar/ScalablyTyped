package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.payment

import typings.node.httpMod.RequestOptions
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.CallbackFunction
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Payment
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.PaymentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "payment.create")
@js.native
object create extends js.Object {
  def apply(data: Payment, config: RequestOptions): Unit = js.native
  def apply(data: Payment, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(data: Payment, config: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(data: Payment, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = js.native
}

