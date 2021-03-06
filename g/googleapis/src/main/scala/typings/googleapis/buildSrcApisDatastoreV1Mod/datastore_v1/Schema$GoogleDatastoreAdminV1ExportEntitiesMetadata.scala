package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for ExportEntities operations.
  */
@js.native
trait Schema$GoogleDatastoreAdminV1ExportEntitiesMetadata extends js.Object {
  /**
    * Metadata common to all Datastore Admin operations.
    */
  var common: js.UndefOr[Schema$GoogleDatastoreAdminV1CommonMetadata] = js.native
  /**
    * Description of which entities are being exported.
    */
  var entityFilter: js.UndefOr[Schema$GoogleDatastoreAdminV1EntityFilter] = js.native
  /**
    * Location for the export metadata and data files. This will be the same
    * value as the
    * google.datastore.admin.v1.ExportEntitiesRequest.output_url_prefix field.
    * The final output location is provided in
    * google.datastore.admin.v1.ExportEntitiesResponse.output_url.
    */
  var outputUrlPrefix: js.UndefOr[String] = js.native
  /**
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[Schema$GoogleDatastoreAdminV1Progress] = js.native
  /**
    * An estimate of the number of entities processed.
    */
  var progressEntities: js.UndefOr[Schema$GoogleDatastoreAdminV1Progress] = js.native
}

object Schema$GoogleDatastoreAdminV1ExportEntitiesMetadata {
  @scala.inline
  def apply(
    common: Schema$GoogleDatastoreAdminV1CommonMetadata = null,
    entityFilter: Schema$GoogleDatastoreAdminV1EntityFilter = null,
    outputUrlPrefix: String = null,
    progressBytes: Schema$GoogleDatastoreAdminV1Progress = null,
    progressEntities: Schema$GoogleDatastoreAdminV1Progress = null
  ): Schema$GoogleDatastoreAdminV1ExportEntitiesMetadata = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (entityFilter != null) __obj.updateDynamic("entityFilter")(entityFilter.asInstanceOf[js.Any])
    if (outputUrlPrefix != null) __obj.updateDynamic("outputUrlPrefix")(outputUrlPrefix.asInstanceOf[js.Any])
    if (progressBytes != null) __obj.updateDynamic("progressBytes")(progressBytes.asInstanceOf[js.Any])
    if (progressEntities != null) __obj.updateDynamic("progressEntities")(progressEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDatastoreAdminV1ExportEntitiesMetadata]
  }
}

