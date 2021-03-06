package typings.googleapis.buildSrcApisLoggingV2beta1Mod.logging_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned from ListSinks.
  */
@js.native
trait Schema$ListSinksResponse extends js.Object {
  /**
    * If there might be more results than appear in this response, then
    * nextPageToken is included. To get the next set of results, call the same
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of sinks.
    */
  var sinks: js.UndefOr[js.Array[Schema$LogSink]] = js.native
}

object Schema$ListSinksResponse {
  @scala.inline
  def apply(nextPageToken: String = null, sinks: js.Array[Schema$LogSink] = null): Schema$ListSinksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sinks != null) __obj.updateDynamic("sinks")(sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListSinksResponse]
  }
}

