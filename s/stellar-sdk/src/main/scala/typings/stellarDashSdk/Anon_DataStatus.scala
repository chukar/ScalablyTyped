package typings.stellarDashSdk

import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData.InternalServerError
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData.RateLimitExceeded
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData.TransactionFailed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataStatus extends js.Object {
  var data: js.UndefOr[RateLimitExceeded | InternalServerError | TransactionFailed] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_DataStatus {
  @scala.inline
  def apply(
    data: RateLimitExceeded | InternalServerError | TransactionFailed = null,
    status: Int | Double = null,
    statusText: String = null,
    url: String = null
  ): Anon_DataStatus = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataStatus]
  }
}

