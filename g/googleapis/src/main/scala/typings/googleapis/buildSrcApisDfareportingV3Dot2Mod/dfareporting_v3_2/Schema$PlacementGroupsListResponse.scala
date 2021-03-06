package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement Group List Response
  */
@js.native
trait Schema$PlacementGroupsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Placement group collection.
    */
  var placementGroups: js.UndefOr[js.Array[Schema$PlacementGroup]] = js.native
}

object Schema$PlacementGroupsListResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    placementGroups: js.Array[Schema$PlacementGroup] = null
  ): Schema$PlacementGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (placementGroups != null) __obj.updateDynamic("placementGroups")(placementGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlacementGroupsListResponse]
  }
}

