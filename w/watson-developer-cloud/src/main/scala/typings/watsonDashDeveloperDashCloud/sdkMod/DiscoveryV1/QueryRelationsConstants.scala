package typings.watsonDashDeveloperDashCloud.sdkMod.DiscoveryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `queryRelations` operation. */
@JSImport("watson-developer-cloud/sdk", "DiscoveryV1.QueryRelationsConstants")
@js.native
object QueryRelationsConstants extends js.Object {
  /** The sorting method for the relationships, can be `score` or `frequency`. `frequency` is the number of unique times each entity is identified. The default is `score`. This parameter cannot be used in the same query as the **bias** parameter. */
  @js.native
  object Sort extends js.Object {
    /* "frequency" */ val FREQUENCY: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.QueryRelationsConstants.Sort.FREQUENCY with String = js.native
    /* "score" */ val SCORE: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.QueryRelationsConstants.Sort.SCORE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.QueryRelationsConstants.Sort with String
      ] = js.native
  }
  
}

