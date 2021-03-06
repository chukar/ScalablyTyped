package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message to list customers of the vendor.
  */
@js.native
trait Schema$ListVendorCustomersResponse extends js.Object {
  /**
    * List of customers of the vendor.
    */
  var customers: js.UndefOr[js.Array[Schema$Company]] = js.native
  /**
    * A token to retrieve the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total count of items in the list irrespective of pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object Schema$ListVendorCustomersResponse {
  @scala.inline
  def apply(
    customers: js.Array[Schema$Company] = null,
    nextPageToken: String = null,
    totalSize: Int | Double = null
  ): Schema$ListVendorCustomersResponse = {
    val __obj = js.Dynamic.literal()
    if (customers != null) __obj.updateDynamic("customers")(customers.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListVendorCustomersResponse]
  }
}

