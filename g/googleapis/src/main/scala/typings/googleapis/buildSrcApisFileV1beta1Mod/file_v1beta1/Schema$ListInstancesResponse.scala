package typings.googleapis.buildSrcApisFileV1beta1Mod.file_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListInstancesResponse is the result of ListInstancesRequest.
  */
@js.native
trait Schema$ListInstancesResponse extends js.Object {
  /**
    * A list of instances in the project for the specified location.  If the
    * {location} value in the request is &quot;-&quot;, the response contains a
    * list of instances from all locations. If any location is unreachable, the
    * response will only return instances in reachable locations and the
    * &quot;unreachable&quot; field will be populated with a list of
    * unreachable locations.
    */
  var instances: js.UndefOr[js.Array[Schema$Instance]] = js.native
  /**
    * The token you can use to retrieve the next page of results. Not returned
    * if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ListInstancesResponse {
  @scala.inline
  def apply(
    instances: js.Array[Schema$Instance] = null,
    nextPageToken: String = null,
    unreachable: js.Array[String] = null
  ): Schema$ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (unreachable != null) __obj.updateDynamic("unreachable")(unreachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListInstancesResponse]
  }
}

