package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CollectionOverride allows resource handling overrides for specific
  * resources within a BaseType
  */
@js.native
trait Schema$CollectionOverride extends js.Object {
  /**
    * The collection that identifies this resource within its service.
    */
  var collection: js.UndefOr[String] = js.native
  /**
    * The options to apply to this resource-level override
    */
  var options: js.UndefOr[Schema$Options] = js.native
}

object Schema$CollectionOverride {
  @scala.inline
  def apply(collection: String = null, options: Schema$Options = null): Schema$CollectionOverride = {
    val __obj = js.Dynamic.literal()
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CollectionOverride]
  }
}

