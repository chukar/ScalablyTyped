package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConnectorDefinitionVersionsResponse extends js.Object {
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * Information about a version.
    */
  var Versions: js.UndefOr[__listOfVersionInformation] = js.native
}

object ListConnectorDefinitionVersionsResponse {
  @scala.inline
  def apply(NextToken: __string = null, Versions: __listOfVersionInformation = null): ListConnectorDefinitionVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Versions != null) __obj.updateDynamic("Versions")(Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConnectorDefinitionVersionsResponse]
  }
}

