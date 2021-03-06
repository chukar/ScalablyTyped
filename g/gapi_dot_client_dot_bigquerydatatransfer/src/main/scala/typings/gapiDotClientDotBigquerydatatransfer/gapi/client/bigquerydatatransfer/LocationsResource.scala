package typings.gapiDotClientDotBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBigquerydatatransfer.Anon_Accesstoken
import typings.gapiDotClientDotBigquerydatatransfer.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var dataSources: DataSourcesResource
  var transferConfigs: TransferConfigsResource
  /** Get information about a location. */
  def get(request: Anon_Accesstoken): Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsFilter): Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    dataSources: DataSourcesResource,
    get: Anon_Accesstoken => Request[Location],
    list: Anon_AccesstokenAltBearertokenCallbackFieldsFilter => Request[ListLocationsResponse],
    transferConfigs: TransferConfigsResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(dataSources = dataSources.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), transferConfigs = transferConfigs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationsResource]
  }
}

