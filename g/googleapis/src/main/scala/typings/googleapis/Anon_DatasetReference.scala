package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$DatasetReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DatasetReference extends js.Object {
  var datasetReference: js.UndefOr[Schema$DatasetReference] = js.native
  var friendlyName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  var location: js.UndefOr[String] = js.native
}

object Anon_DatasetReference {
  @scala.inline
  def apply(
    datasetReference: Schema$DatasetReference = null,
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    labels: StringDictionary[String] = null,
    location: String = null
  ): Anon_DatasetReference = {
    val __obj = js.Dynamic.literal()
    if (datasetReference != null) __obj.updateDynamic("datasetReference")(datasetReference.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DatasetReference]
  }
}

